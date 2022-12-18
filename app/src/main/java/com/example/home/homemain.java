package com.example.home;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class homemain extends AppCompatActivity {
    Button intro_btn, service, button3, best_toilet_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hahaha);

        intro_btn = findViewById(R.id.intro_btn);
        service = findViewById(R.id.service);
        button3 = findViewById(R.id.button3);
        best_toilet_btn = findViewById(R.id.best_toilet_btn);





    }
}