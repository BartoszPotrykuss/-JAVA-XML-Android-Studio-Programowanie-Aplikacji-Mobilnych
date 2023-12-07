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

        btn.setOnClickListener(e -> {

            String mes1 = imie.getText().toString();
            String mes2 = nazwisko.getText().toString();
            String czyDuza;

            if (mes1.isEmpty() || mes2.isEmpty())
            {
                //AlertDialog
                Toast.makeText(this, "Uzupełnij wszystkie pola", Toast.LENGTH_LONG).show();
            }
            else
            {
                if (mes1.charAt(0) == mes1.toUpperCase().charAt(0))
                {
                    czyDuza = "Twoje imię jest zapisane z dużej litery";
                }
                else
                {
                    czyDuza = "Twoje imię jest zapisane z małej litery";
                }

                txt2.setText("Imię: " + mes1 + "\n Nazwisko: " + mes2 + "\n " + czyDuza);
            }
                }
        );
    }
}