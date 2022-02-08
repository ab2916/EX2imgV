package com.example.ex2imgv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageButton ib;
ImageView iv;
int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ib = findViewById(R.id.ib);
        iv = findViewById(R.id.iv);
    }

    public void go(View view) {
        int x = (int)(101*Math.random())%3+1;
        if(x==1){
            ib.setImageResource(R.drawable.n1);
            iv.setImageResource(R.drawable.rollsroyce);
        }
        else if(x==2){
            ib.setImageResource(R.drawable.n2);
            iv.setImageResource(R.drawable.mercedes);
        }
        else{
            ib.setImageResource(R.drawable.n3);
            iv.setImageResource(R.drawable.lambo);
        }
    }
}