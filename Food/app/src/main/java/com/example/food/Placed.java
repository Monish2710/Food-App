package com.example.food;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Placed extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placed);
    }
    public void a5(View view) {
        Intent i1 = new Intent(Placed.this, MainActivity.class);
        startActivity(i1);
    }
}