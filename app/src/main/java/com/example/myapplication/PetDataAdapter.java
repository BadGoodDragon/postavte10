package com.example.myapplication;

// MyAdapter.java
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class PetDataAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<PetData> data;
    private Context context;

    public PetDataAdapter(Context context, List<PetData> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.out_lay, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        PetData item = data.get(position);
        holder.nameTextView.setText(item.name);
        holder.vidTextView.setText(item.vid);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
