package com.example.cloudchat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<ViewHolder>
{

    ArrayList<String> messages;

    LayoutInflater inflanter;

    public DataAdapter(Context context,ArrayList<String> messages) {
        this.messages = messages;
        this.inflanter = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflanter.inflate(R.layout.item_message,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        String msg = messages.get(position);
        holder.message.setText(msg);
    }

    @Override
    public int getItemCount() {
        return messages.size();
    }
}
