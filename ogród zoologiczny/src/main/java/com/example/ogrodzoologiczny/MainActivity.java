package com.example.ogrodzoologiczny;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt1;
    TextView txt2;

    @SuppressLint("MissingInflatedId")
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

        Resources res = getResources();

        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        String[] zwierzeta = {"słoń", "żyrafa", "zebra"};
        for (String s : zwierzeta) {
            txt1.append(s + "\n");
        }



        String[] zwierzetaStrings = res.getStringArray(R.array.zwierzeta);
        for (String s : zwierzetaStrings) {
            txt2.append(s + "\n");
        }

    }
}