package com.example.kalendarz;

import static com.example.kalendarz.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Button btn = findViewById(id.wyswietl);
        TextView txt = findViewById(R.id.txt);
        GridView gridView = findViewById(R.id.gridView);
        //String[] dni = getResources().getStringArray(R.array.dni);
        String[] dni = new String[14];
        for (int i = 1; i <= dni.length; i++) {
            dni[i-1] = "Dzień " + i;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dni);
        btn.setOnClickListener(e -> {
            gridView.setAdapter(adapter);
        });
        gridView.setOnItemClickListener((adapterView, view, i, l) ->
                txt.setText(dni[i]));
    }
}