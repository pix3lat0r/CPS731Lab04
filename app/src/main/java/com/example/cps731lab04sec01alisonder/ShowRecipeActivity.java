package com.example.cps731lab04sec01alisonder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ShowRecipeActivity extends AppCompatActivity {
    ImageView mainImageView;
    TextView titlee, ingredients;
    String data1, data2;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_recipe);

        mainImageView = findViewById(R.id.mainImageView);
        titlee = findViewById(R.id.titlee);
        ingredients = findViewById(R.id.ingredients);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") &&
                getIntent().hasExtra("data2")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            myImage = getIntent().getIntExtra("myImage", 1);
        }
        else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        titlee.setText(data1);
        ingredients.setText(data2);
        mainImageView.setImageResource(myImage);
    }
}