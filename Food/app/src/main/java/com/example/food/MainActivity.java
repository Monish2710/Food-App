package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView value,value1,value2;
    int count = 0;
    int call = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        value = (TextView) findViewById(R.id.txt1);
        value1 = (TextView) findViewById(R.id.txt2);
    }
    public void a1(View view) {
        Intent i1 = new Intent(MainActivity.this, Cart.class);
        startActivity(i1);
    }
    public void a3(View view) {
        finish();
        System.exit(0);
    }
    public void dec(View view) {
     count++;
     value.setText(""+count);
    }
    public void inc(View view) {
       if(count <=0 ) count=0;
       else count--;
       value.setText(""+count);
    }
    public void sub(View view) {
        call++;
        value1.setText(""+call);
    }
    public void add(View view) {
        if(call <=0 ) call=0;
        else call--;
        value1.setText(""+call);
    }

}