package com.example.zadanie_114;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {


    private TextView textView;
    private TextView textView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra(MainActivity.EXTRA_NAME)) {
            // Odczytanie danych
            String userName = intent.getStringExtra(MainActivity.EXTRA_NAME);

            // Ustawienie tekstu powitalnego
            textView.setText("Imie, " + userName + "!");
        } else {
            // Obsługa sytuacji, gdy dane nie zostały przekazane
            textView.setText("Witaj");
        }


        if (intent != null && intent.hasExtra(MainActivity.EXTRA_AGE)) {
            // Odczytanie danych
            String userAge = intent.getStringExtra(MainActivity.EXTRA_AGE);

            // Ustawienie tekstu powitalnego
            textView2.setText("Wiek, " + userAge + "!");
        } else {
            // Obsługa sytuacji, gdy dane nie zostały przekazane
            textView2.setText("Witaj");
        }
    }
}