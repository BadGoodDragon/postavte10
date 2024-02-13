package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class PersDataAdapter extends ArrayAdapter<PersData> {

    public PersDataAdapter(Context context, List<PersData> persDataList) {
        super(context, 0, persDataList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        PersData persData = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);
        }

        TextView textView = convertView.findViewById(android.R.id.text1);

        textView.setText("ID: " + persData.id + ", Name: " + persData.name + ", Num: " + persData.num);

        return convertView;
    }
}
