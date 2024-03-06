package com.example.polawyboru;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton espresso;
    RadioButton late;
    RadioButton cappucino;
    CheckBox milk;
    CheckBox sugar;
    Button order;
    Button clear;
    TextView txt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);
        espresso = findViewById(R.id.espresso);
        late = findViewById(R.id.late);
        cappucino = findViewById(R.id.cappucino);
        milk = findViewById(R.id.milk);
        sugar = findViewById(R.id.sugar);
        order = findViewById(R.id.order);
        txt = findViewById(R.id.txt);
        clear = findViewById(R.id.clear);

        order.setOnClickListener(view -> {

            int radioID = radioGroup.getCheckedRadioButtonId();
            StringBuilder result = new StringBuilder();

            int suma = 0;

            if (radioID == R.id.espresso) {
                result.append("Wybrales espresso - 20zł\n");
                suma += 20;
            }
            else if (radioID == R.id.late) {
                result.append("Wybrales late - 25zł\n");
                suma += 25;
            }
            else if (radioID == R.id.cappucino) {
                result.append("Wybrales cappucino - 20zł \n");
                suma += 20;
            }

            if(milk.isChecked()) {
                result.append("Dodałeś mleko - 5zł \n");
                suma += 5;
            }

            if(sugar.isChecked()) {
                result.append("Dodałeś cukier - 5zł \n");
                suma += 5;
            }

            result.append("Łączny koszt: " + suma + "zł");
            txt.setText(result);
        });

        clear.setOnClickListener(view -> {
            espresso.setChecked(false);
            late.setChecked(false);
            cappucino.setChecked(false);

            milk.setChecked(false);
            sugar.setChecked(false);

            txt.setText("");

        });
    }


}