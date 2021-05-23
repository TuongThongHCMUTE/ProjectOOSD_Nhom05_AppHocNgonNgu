package com.example.languages_learning_app.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.languages_learning_app.Models.ItemLessonMan;
import com.example.languages_learning_app.R;

import java.util.ArrayList;

public class LessonListViewAdapter extends BaseAdapter {
    // Data convert by adapter is a list of Lesson's Items
    final ArrayList<ItemLessonMan> listLesson;

    public LessonListViewAdapter(ArrayList<ItemLessonMan> listLesson) {
        this.listLesson = listLesson;
    }

    // Methods

    /**
     * Return the number of item of lesson in ListView
     * @return
     */
    @Override
    public int getCount() {
        return listLesson.size();
    }

    /**
     * Return the item at position
     * @param position
     * @return
     */
    @Override
    public Object getItem(int position) {
        return listLesson.get(position);
    }

    /**
     * Return idlesson at position
     * @param position
     * @return
     */
    @Override
    public long getItemId(int position) {
        return listLesson.get(position).getIdlesson();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewItem;
        if(convertView != null) {
            viewItem = View.inflate(parent.getContext(), R.layout.lesson_item_view, null);
        } else {
            viewItem = convertView;
        }

        ItemLessonMan ilm = (ItemLessonMan) getItem(position);
        ((TextView) viewItem.findViewById(R.id.idlesson)).setText(String.format("Lesson: %d", ilm.getIdlesson()));
        ((TextView) viewItem.findViewById(R.id.namelesson)).setText(String.format("Lesson's name: %s", ilm.getNamelesson()));

        return viewItem;
    }
}
