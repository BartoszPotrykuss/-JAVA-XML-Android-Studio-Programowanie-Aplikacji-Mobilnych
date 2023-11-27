package com.example.parknarodowy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button wyswietl;
    Button wyczysc;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wyswietl = findViewById(R.id.wyswietl);
        wyczysc = findViewById(R.id.wyczysc);
        txt = findViewById(R.id.txt);

        String message = "Lorem ipsum";

        wyswietl.setOnClickListener(e ->
                txt.setText(message));
        wyczysc.setOnClickListener(e ->
                txt.setText(""));
    }
}