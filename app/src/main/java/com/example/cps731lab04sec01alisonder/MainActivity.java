package com.example.cps731lab04sec01alisonder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private String[] recipeTitles = new String[]{"Ice Coffee", "French Vanilla", "Earl Grey Tea"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}