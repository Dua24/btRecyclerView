package com.example.recyclerview;

import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class WordViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final WordListAdapter mAdapter;
    TextView wordItemView,description;
    ImageView imgView;
    public WordViewHolder(View itemView,View descr, WordListAdapter adapter) {
        super(itemView);
        wordItemView=itemView.findViewById(R.id.word);
        description=descr.findViewById(R.id.description);
        this.mAdapter = adapter;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}