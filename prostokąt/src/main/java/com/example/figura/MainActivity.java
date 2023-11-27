package com.example.figura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int pole;
        int a = 5, b = 2;
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.txt);
        pole = a * b;

        btn.setOnClickListener(e ->
                txt.setText("Pole jest równe: " + pole));
    }
}