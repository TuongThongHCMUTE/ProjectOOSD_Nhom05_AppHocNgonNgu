package com.example.languages_learning_app.Controllers;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.languages_learning_app.Models.ItemLessonMan;
import com.example.languages_learning_app.R;

import java.util.ArrayList;

public class ManagerLessonFragment extends Fragment {

    ListView lvlesson;
    ArrayList<ItemLessonMan> arrlistLesson;

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
////        if (getArguments() != null) {
////            mParam1 = getArguments().getString(ARG_PARAM1);
////            mParam2 = getArguments().getString(ARG_PARAM2);
////        }
//
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

        return view;
    }

    private ArrayList<ItemLessonMan> addData(ArrayList<ItemLessonMan> arrlesson_param) {
        ItemLessonMan tmpi0 = new ItemLessonMan(1, "Lesson: Greeting");
        ItemLessonMan tmpi1 = new ItemLessonMan(2, "Lesson: My profile");

        arrlesson_param.add(tmpi0);
        arrlesson_param.add(tmpi1);

        return arrlesson_param;
    }
}