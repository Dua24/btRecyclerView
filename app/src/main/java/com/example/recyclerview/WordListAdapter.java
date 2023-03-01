package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;

public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder>  {
    private final LayoutInflater mInflater;
    LinkedList<String> mWordList = new LinkedList<>();
    LinkedList<String> description = new LinkedList<>();


    public WordListAdapter(Context context,LinkedList<String> wordList,LinkedList<String> description) {
        mInflater = LayoutInflater.from(context);
        this.mWordList=wordList;
        this.description=description;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(R.layout.activity_main2,parent,false);
        View description = mInflater.inflate(R.layout.activity_main2,parent,false);
        return new WordViewHolder(mItemView,description,this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        String desCurretn = description.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.description.setText(desCurretn);
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
