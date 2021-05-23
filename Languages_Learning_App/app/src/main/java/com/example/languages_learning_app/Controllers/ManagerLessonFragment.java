package com.example.languages_learning_app.Controllers;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.languages_learning_app.Adapters.LessonListViewAdapter;
import com.example.languages_learning_app.Models.ItemLessonMan;
import com.example.languages_learning_app.R;

import java.util.ArrayList;

public class ManagerLessonFragment extends Fragment {

    ListView lvlesson;
    Button buttonnaddlesson;
    ArrayList<ItemLessonMan> arrlistLesson;
    LessonListViewAdapter lessonListViewAdapter;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                            @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_manager_lesson, container, false);

        lvlesson = (ListView) view.findViewById(R.id.listviewLesson);
        arrlistLesson = new ArrayList<ItemLessonMan>();

        arrlistLesson = addData(arrlistLesson);

        lessonListViewAdapter = new LessonListViewAdapter(arrlistLesson);

        lvlesson = view.findViewById(R.id.listviewLesson);
        lvlesson.setAdapter(lessonListViewAdapter);

        lvlesson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ItemLessonMan itlm = (ItemLessonMan) lessonListViewAdapter.getItem(position);
                Toast.makeText(getContext(), "Click on Lesson: " + itlm.getIdlesson(), Toast.LENGTH_SHORT).show();
            }
        });

        buttonnaddlesson = (Button) view.findViewById(R.id.btnAddLesson);

        buttonnaddlesson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

    private ArrayList<ItemLessonMan> addData(ArrayList<ItemLessonMan> arrlesson_param) {
        // Load data from DB and add to listview

        ItemLessonMan tmpi0 = new ItemLessonMan(1, "Lesson: Greeting");
        ItemLessonMan tmpi1 = new ItemLessonMan(2, "Lesson: My profile");

        arrlesson_param.add(tmpi0);
        arrlesson_param.add(tmpi1);

        return arrlesson_param;
    }


}