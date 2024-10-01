package com.example.listview;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    Button addButton;
    Button showButton;
    Button clearButton;
    EditText editText;

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

        listView = findViewById(R.id.listaSamochodow);
        addButton = findViewById(R.id.addButton);
        showButton = findViewById(R.id.showButton);
        editText = findViewById(R.id.editText);
        clearButton = findViewById(R.id.clearButton);
        String[] cars = getResources().getStringArray(R.array.samochody);

        //Utworzenie konstruktora i przypisanie mu tablicy samochodow
        ArrayList<String> carL = new ArrayList<>(Arrays.asList(cars));

        addButton.setOnClickListener(e -> {
            carL.add(editText.getText().toString());
            //Skonfigurowanie obiektu adaptera
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.lista, carL);
            //Wyświetlenie w komponencie listView zawartości tablicy
            listView.setAdapter(adapter);
        });

        showButton.setOnClickListener(e -> {
            //Skonfigurowanie obiektu adaptera
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.lista, carL);
            //Wyświetlenie w komponencie listView zawartości tablicy
            listView.setAdapter(adapter);
        });

        clearButton.setOnClickListener(e -> {

        });

    }
}