package com.example.spanishlanguagelearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Vocabulary extends AppCompatActivity {

    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary);

        button3 = findViewById(R.id.beginnerButton);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Vocabulary.this, WordType.class);
                startActivity(intent);
            }
        });
    }
}