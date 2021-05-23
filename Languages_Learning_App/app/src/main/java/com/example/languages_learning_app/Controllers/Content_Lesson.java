package com.example.languages_learning_app.Controllers;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.languages_learning_app.Models.ContentLessonItemMan;
import com.example.languages_learning_app.R;

public class Content_Lesson extends AppCompatActivity {
    ContentLessonItemMan contentLessonItemMan;

    TextView tvIdLesson, tvNameLesson, tvContentLesson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_lesson);

        mappingview();
    }

    private void mappingview() {
        tvIdLesson = (TextView) findViewById(R.id.textViewIdLesson);
        tvNameLesson = (TextView) findViewById(R.id.textViewNameLesson);
        tvContentLesson = (TextView) findViewById(R.id.textViewContentLesson);
    }
}