package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText imie;
    EditText nazwisko;
    EditText haslo;
    Button btn;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imie = findViewById(R.id.imie);
        nazwisko = findViewById(R.id.nazwisko);
        btn = findViewById(R.id.btn);
        txt2 = findViewById(R.id.txt2);
        haslo = findViewById(R.id.haslo);

        btn.setOnClickListener(e -> {

            String imieText = imie.getText().toString();
            String nazwiskoText = nazwisko.getText().toString();
            String hasloText = haslo.getText().toString();
            String czyDuza;

            if (imieText.isEmpty() || nazwiskoText.isEmpty()) {
                //AlertDialog
                Toast.makeText(this, "Uzupełnij wszystkie pola", Toast.LENGTH_LONG).show();
            } else {
                if (imieText.charAt(0) == imieText.toUpperCase().charAt(0)) {
                    czyDuza = "Twoje imię jest zapisane z dużej litery";
                } else {
                    czyDuza = "Twoje imię jest zapisane z małej litery";
                }

                txt2.setText("Imię: " + imieText + "\n Nazwisko: " + nazwiskoText + "\n " + czyDuza + "\n Hasło: " + hasloText);
            }
            imie.getText().clear();
            nazwisko.getText().clear();
            haslo.getText().clear();
                }
        );
    }
}