package com.example.food;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Cart extends AppCompatActivity {
    TextView value,value1;
    int count = 0;
    int call = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        value = (TextView) findViewById(R.id.txt4);
        value1 = (TextView) findViewById(R.id.txt3);
    }
    public void a2(View view) {
        finish();
    }
    public void a4(View view) {
        Intent i1 = new Intent(Cart.this, Placed.class);
        startActivity(i1);
    }
    public void sa(View view) {
        count++;
        value.setText(""+count);
    }
    @SuppressLint("SetTextI18n")
    public void as(View view) {
        if(count <=0 ) count=0;
        else count--;
        value.setText(""+count);
    }
    public void ax(View view) {
        call++;
        value1.setText(""+call);
    }
    public void xa(View view) {
        if(call <=0 ) call=0;
        else call--;
        value1.setText(""+call);
    }
}


