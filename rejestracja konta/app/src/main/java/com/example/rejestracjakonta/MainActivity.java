package com.example.rejestracjakonta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    Button zatwierdz;
    EditText editEmail;
    EditText editHaslo;
    EditText editPowtorzHaslo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zatwierdz = findViewById(R.id.zatwierdz);
        editEmail = findViewById(R.id.email);
        wynik = findViewById(R.id.wynik);
        editHaslo = findViewById(R.id.haslo);
        editPowtorzHaslo = findViewById(R.id.powtorzHaslo);

        zatwierdz.setOnClickListener(e -> {
            String emailText = editEmail.getText().toString();
            String haslo = editHaslo.getText().toString();
            String powtorzHaslo = editPowtorzHaslo.getText().toString();

            if (!emailText.contains("@")) {
                wynik.setText("Nieprawidłowy adres email");
            }
            else if (!haslo.equals(powtorzHaslo)) {
                wynik.setText("Hasła się różnią");
            }
            else {
                wynik.setText("Witaj " + emailText);
            }
        });
    }
}