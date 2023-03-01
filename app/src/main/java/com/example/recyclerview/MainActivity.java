package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Adapter;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<String> mWordList = new LinkedList<>();
    private LinkedList<String> descriptions = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("PHP");
        mWordList.add("C#");
        mWordList.add("JS");
        mWordList.add("Kotlin");
        mWordList.add("MongoDB");
        mWordList.add("C#1");
        mWordList.add("C2#");
        mWordList.add("C#3");
        //
        descriptions.add("mo taSQL");
        descriptions.add("mo taJava");
        descriptions.add("mo taPHP");
        descriptions.add("mo taC#");
        descriptions.add("mo taJS");
        descriptions.add("mo taKotlin");
        descriptions.add("mo taMongoDB");
        descriptions.add("mo taC#1");
        descriptions.add("mo taC2#");
        descriptions.add("mo taC#3");
        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this,mWordList,descriptions);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}