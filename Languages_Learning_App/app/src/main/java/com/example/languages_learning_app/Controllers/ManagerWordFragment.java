package com.example.languages_learning_app.Controllers;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.languages_learning_app.Adapters.WordListViewAdapter;
import com.example.languages_learning_app.Models.ContentWordItemMan;
import com.example.languages_learning_app.Models.ItemWordMan;
import com.example.languages_learning_app.R;

import java.util.ArrayList;

public class ManagerWordFragment extends Fragment {
    ArrayList<ItemWordMan> arrItemWordMan;

    WordListViewAdapter wordListViewAdapter;

    ListView lvWord;
    Button btnAdd;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_manager_word, container, false);

        arrItemWordMan = new ArrayList<ItemWordMan>();
        arrItemWordMan = loadData(arrItemWordMan);

        wordListViewAdapter = new WordListViewAdapter(arrItemWordMan);

        btnAdd = (Button) view.findViewById(R.id.buttonAddWord);
        lvWord = (ListView) view.findViewById(R.id.listviewWord);

        lvWord.setAdapter(wordListViewAdapter);

        lvWord.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemWordMan tmpiwm = (ItemWordMan) wordListViewAdapter.getItem(position);
                // Show content word to edit
                Toast.makeText(getContext(), "Click on word: " + tmpiwm.getWord(), Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }

    private ArrayList<ItemWordMan> loadData(ArrayList<ItemWordMan> arriwm) {
        // Load data from database
        arriwm.add(new ItemWordMan("hello", "Xin chao"));
        arriwm.add(new ItemWordMan("cry", "Khoc"));
        arriwm.add(new ItemWordMan("scream", "la het"));

        return arriwm;
    }
}