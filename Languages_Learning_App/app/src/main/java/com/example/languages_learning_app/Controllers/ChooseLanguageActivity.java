package com.example.languages_learning_app.Controllers;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;

import com.example.languages_learning_app.Adapters.LanguageAdapter;
import com.example.languages_learning_app.Common.Common;
import com.example.languages_learning_app.DTO.Language;
import com.example.languages_learning_app.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class ChooseLanguageActivity extends AppCompatActivity {
    Button back;
    RecyclerView recyclerView;
    ArrayList<Language> listLanguage;
    LanguageAdapter languageAdapter;

    DatabaseReference mDatabase;
    private LanguageAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_language);

        setOnClickListener();
        setRecyclerView();

        back = (Button) findViewById(R.id.btBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { finish();
            }
        });
    }

    private void setOnClickListener() {
        listener = new LanguageAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                finish();

                Intent intent;

                if(Common.role == Common.RoleTrainee){
                    intent = new Intent(getApplicationContext(), MainActivity.class);
                } else {
                    intent = new Intent(getApplicationContext(), ManagerMainActivity.class);
                }


                intent.putExtra("LanguageN", listLanguage.get(position).getName());
                intent.putExtra("LanguageDN", listLanguage.get(position).getDisplayName());
                //Convert int to string
                intent.putExtra("LanguageIM", String.valueOf(listLanguage.get(position).getImage()));

                Common.language = listLanguage.get(position);
                startActivity(intent);
            }

            @Override
            public void onCreateContextMenu(ContextMenu menu, int position) {
            }

            @Override
            public void onTouch(View v, int position) {

            }
        };
    }

    private void setRecyclerView(){
        listLanguage = new ArrayList<>();
        recyclerView = findViewById(R.id.rvLanguages);

        languageAdapter = new LanguageAdapter(getApplicationContext(), listLanguage, listener);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 1, GridLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(languageAdapter);

        // Get data from firebase
        mDatabase = FirebaseDatabase.getInstance().getReference("Languages");
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listLanguage.clear();
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Language language = dataSnapshot.getValue(Language.class);
                    if(language.getStatus()){
                        listLanguage.add(language);
                    }
                }
                languageAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }
}