package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class JugarActivity extends AppCompatActivity {

    TextView incognita1;
    TextView incognita2;
    TextView incognita3;
    TextView incognita4;
    static int minimo = 1023;
    static int maximo = 9876;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);

        incognita1 = findViewById(R.id.incognita1);
        incognita2 = findViewById(R.id.incognita2);
        incognita3 = findViewById(R.id.incognita3);
        incognita4 = findViewById(R.id.incognita4);
        double valorEntero = Math.floor(Math.random()*(maximo-minimo+1)+minimo);  // Valor entre M y N, ambos incluidos.

        String inc = Double.toString(valorEntero);

        char[] l = inc.toCharArray();

        incognita1.setText(String.valueOf(l[0]));
        incognita2.setText(String.valueOf(l[1]));
        incognita3.setText(String.valueOf(l[2]));
        incognita4.setText(String.valueOf(l[3]));
    }
}

