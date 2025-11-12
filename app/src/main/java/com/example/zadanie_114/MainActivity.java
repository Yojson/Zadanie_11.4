package com.example.zadanie_114;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.zadanie_114.NAME";
    public static final String EXTRA_AGE = "com.example.zadanie_114.AGE";

    private EditText Name;
    private EditText Age;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.Name);
        Age = findViewById(R.id.Age);
        button = findViewById(R.id.button);


        button.setOnClickListener(v -> {
            String name = Name.getText().toString();
            String age = Age.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            intent.putExtra(EXTRA_NAME, name);
            intent.putExtra(EXTRA_AGE, age);

            startActivity(intent);
        });
    }
}