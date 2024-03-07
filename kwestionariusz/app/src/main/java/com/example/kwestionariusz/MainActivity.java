package com.example.kwestionariusz;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText dane;
    RadioGroup radioGroup;
    RadioButton sokPomaranczowy;
    RadioButton wodaNiegazowana;
    RadioButton energetyk;
    RadioButton herbata;
    CheckBox przyjaciele;
    CheckBox ksiazka;
    CheckBox gry;
    CheckBox sport;
    Button wyslij;
    Button wyczysc;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        dane = findViewById(R.id.dane);
        radioGroup = findViewById(R.id.radioGroup);
        sokPomaranczowy = findViewById(R.id.sokPomaranczowy);
        wodaNiegazowana = findViewById(R.id.wodaNiegazowana);
        energetyk = findViewById(R.id.energetyk);
        herbata = findViewById(R.id.herbata);
        przyjaciele = findViewById(R.id.przyjaciele);
        ksiazka = findViewById(R.id.ksiazka);
        gry = findViewById(R.id.gry);
        sport = findViewById(R.id.sport);
        wyslij = findViewById(R.id.wyslij);
        wyczysc = findViewById(R.id.wyczysc);
        txt = findViewById(R.id.txt);

        wyslij.setOnClickListener(e -> {
            String ImieINazwisko = dane.getText().toString();


            StringBuilder stringBuilder = new StringBuilder();
            if (ImieINazwisko.isEmpty()) {
                Toast.makeText(this, "Podaj dane", Toast.LENGTH_SHORT).show();
            }
            else {
                stringBuilder.append("Twoje dane: ");
                stringBuilder.append(ImieINazwisko);
                stringBuilder.append("\n Twój ulubiony napój to ");


                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

                if (checkedRadioButtonId == R.id.sokPomaranczowy) {
                    stringBuilder.append("sok pomaranczowy \n");
                }
                else if (checkedRadioButtonId == R.id.wodaNiegazowana) {
                    stringBuilder.append("woda niegazowana \n");
                }
                else if (checkedRadioButtonId == R.id.energetyk) {
                    stringBuilder.append("energetyk \n");
                }
                else if (checkedRadioButtonId == R.id.herbata) {
                    stringBuilder.append("herbata \n");
                }

                stringBuilder.append("W wolnym czasie lubisz: ");

                if (przyjaciele.isChecked()) {
                    stringBuilder.append("spotykać się z przyjaciółmi, ");
                }
                if (ksiazka.isChecked()) {
                    stringBuilder.append("czytać książkę, ");
                }
                if (gry.isChecked()) {
                    stringBuilder.append("grać w gry, ");
                }
                if (sport.isChecked()) {
                    stringBuilder.append("uprawiać sport, ");
                }

                txt.setText(stringBuilder.toString());
            }
        });

        wyczysc.setOnClickListener(e -> {
            radioGroup.clearCheck();
            przyjaciele.setChecked(false);
            ksiazka.setChecked(false);
            gry.setChecked(false);
            sport.setChecked(false);
            dane.setText("");
        });

    }
}