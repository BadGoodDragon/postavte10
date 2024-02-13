package com.example.myapplication;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView nameTextView;
    public TextView vidTextView;

    public MyViewHolder(View itemView) {
        super(itemView);
        nameTextView = itemView.findViewById(R.id.nameTextView);
        vidTextView = itemView.findViewById(R.id.vidTextView);
    }
}
