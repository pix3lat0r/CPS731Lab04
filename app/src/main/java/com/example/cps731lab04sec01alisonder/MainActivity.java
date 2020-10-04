package com.example.cps731lab04sec01alisonder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String titles[], txt[];
    int images[] = {R.drawable.ic, R.drawable.fv, R.drawable.eg};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        titles = getResources().getStringArray(R.array.recipeTitles);
        txt = getResources().getStringArray(R.array.descriptions);

        RecyclerViewAdapter mAdapter = new RecyclerViewAdapter(this, titles, txt, images);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}