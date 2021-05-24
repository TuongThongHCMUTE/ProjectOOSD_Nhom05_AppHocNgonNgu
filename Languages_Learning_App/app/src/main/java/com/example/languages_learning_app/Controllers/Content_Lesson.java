package com.example.languages_learning_app.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.languages_learning_app.Models.ContentLessonItemMan;
import com.example.languages_learning_app.R;

public class Content_Lesson extends AppCompatActivity {
    ContentLessonItemMan contentLessonItemMan;

    TextView tvIdLesson;
    EditText etNameLesson, etContentLesson;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_lesson);

        mappingview();

        contentLessonItemMan = loadData();

        tvIdLesson.setText("Lesson: " + contentLessonItemMan.getIdlesson());
        etNameLesson.setText("Lesson's name: " + contentLessonItemMan.getNamelesson());
        etContentLesson.setText(contentLessonItemMan.getContentlesson());

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etNameLesson.getText() != null && etContentLesson.getText() != null) {
                    ContentLessonItemMan tmpclim = new ContentLessonItemMan();

                    tmpclim.setIdlesson(contentLessonItemMan.getIdlesson());
                    tmpclim.setNamelesson(etNameLesson.getText().toString());
                    tmpclim.setContentlesson(etContentLesson.getText().toString());
                    tmpclim.setActivestate(contentLessonItemMan.getActivestate());
                    tmpclim.setManageruser(contentLessonItemMan.getManageruser());

                    saveData(tmpclim);
                }
            }
        });
    }

    private void mappingview() {
        tvIdLesson = (TextView) findViewById(R.id.textViewIdLesson);
        etNameLesson = (EditText) findViewById(R.id.editTextNameLesson);
        etContentLesson = (EditText) findViewById(R.id.editTextContentLesson);
        btnSave = (Button) findViewById(R.id.buttonSave);
    }

    private ContentLessonItemMan loadData() {
        // Load data from DB
        ContentLessonItemMan tmpcli = new ContentLessonItemMan(1, "Greeting", "Hello\nI'm Cat.\nNice to meet you!", "manen1", 1);

        return tmpcli;
    }

    private void saveData(ContentLessonItemMan clim) {
        // Save data to DB
    }
}