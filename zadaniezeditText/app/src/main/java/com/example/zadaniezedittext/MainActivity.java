package com.example.zadaniezedittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText liczbaA;
    EditText liczbaB;
    Button dodaj;
    Button odejmij;
    Button pomnoz;
    Button podziel;
    Button wyczysc;

    TextView dane;

    int a;
    int b;
    int wynik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        liczbaA = findViewById(R.id.a);
        liczbaB = findViewById(R.id.b);

        dodaj = findViewById(R.id.dodaj);
        odejmij = findViewById(R.id.odejmij);
        pomnoz = findViewById(R.id.pomnoz);
        podziel = findViewById(R.id.podziel);
        wyczysc = findViewById(R.id.clear);

        dane = findViewById(R.id.wynik);

        dodaj.setOnClickListener(e -> {
            String aString = liczbaA.getText().toString();
            String bString = liczbaB.getText().toString();

            if(aString.isEmpty() || bString.isEmpty()) {
                Toast.makeText(this, "Uzupełnij wszystkie pola", Toast.LENGTH_LONG).show();
            }
            else {

                a = Integer.parseInt(aString);
                b = Integer.parseInt(bString);


                wynik = a + b;

                String stringWynik = Integer.toString(wynik);


                dane.setText(stringWynik);
            }
        });

        odejmij.setOnClickListener(e -> {
            String aString = liczbaA.getText().toString();
            String bString = liczbaB.getText().toString();

            if(aString.isEmpty() || bString.isEmpty()) {
                Toast.makeText(this, "Uzupełnij wszystkie pola", Toast.LENGTH_LONG).show();
            }
            else {

                a = Integer.parseInt(aString);
                b = Integer.parseInt(bString);


                wynik = a - b;

                String stringWynik = Integer.toString(wynik);


                dane.setText(stringWynik);
            }
        });

        pomnoz.setOnClickListener(e -> {
            String aString = liczbaA.getText().toString();
            String bString = liczbaB.getText().toString();

            if(aString.isEmpty() || bString.isEmpty()) {
                Toast.makeText(this, "Uzupełnij wszystkie pola", Toast.LENGTH_LONG).show();
            }
            else {

                a = Integer.parseInt(aString);
                b = Integer.parseInt(bString);


                wynik = a * b;

                String stringWynik = Integer.toString(wynik);


                dane.setText(stringWynik);
            }
        });

        podziel.setOnClickListener(e -> {
            String aString = liczbaA.getText().toString();
            String bString = liczbaB.getText().toString();

            if(aString.isEmpty() || bString.isEmpty()) {
                Toast.makeText(this, "Uzupełnij wszystkie pola", Toast.LENGTH_LONG).show();
            }
            else {

                a = Integer.parseInt(aString);
                b = Integer.parseInt(bString);


                wynik = a / b;

                String stringWynik = Integer.toString(wynik);


                dane.setText(stringWynik);
            }
        });

        wyczysc.setOnClickListener(e -> {
            liczbaA.getText().clear();
            liczbaB.getText().clear();
        });
    }
}