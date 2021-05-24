package com.example.languages_learning_app.Adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.languages_learning_app.Models.ItemWordMan;
import com.example.languages_learning_app.R;

import java.util.ArrayList;

public class WordListViewAdapter extends BaseAdapter {

    final ArrayList<ItemWordMan> listItemWordMan;

    public WordListViewAdapter(ArrayList<ItemWordMan> listItemWordMan) {
        this.listItemWordMan = listItemWordMan;
    }

    @Override
    public int getCount() {
        return listItemWordMan.size();
    }

    @Override
    public Object getItem(int position) {
        return listItemWordMan.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View viewWordItem;
        if( convertView == null) {
            viewWordItem = View.inflate(parent.getContext(), R.layout.item_word_view, null);
        } else {
            viewWordItem = convertView;
        }

        ItemWordMan iwm = (ItemWordMan) getItem(position);
        ((TextView) viewWordItem.findViewById(R.id.textViewWord)).setText(String.format("%s" + iwm.getWord()));
        ((TextView) viewWordItem.findViewById(R.id.textViewMean)).setText(String.format("Mean: %s" + iwm.getMean()));

        return viewWordItem;
    }
}
