package com.example.spanishlanguagelearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

class wordKind
{
    public static int word = 0;
}

public class WordType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_type);

        Button buttonGreetings;
        buttonGreetings = findViewById(R.id.greetingsButton);
        buttonGreetings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordKind.word =1;
                Intent intent = new Intent(WordType.this, VocabularyLesson.class);
                startActivity(intent);
            }
        });

        Button buttonTravel;
        buttonTravel = findViewById(R.id.travelButton);
        buttonTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordKind.word =2;
                Intent intent = new Intent(WordType.this, VocabularyLesson.class);
                startActivity(intent);
            }
        });

        Button buttonHoliday;
        buttonHoliday = findViewById(R.id.holidayButton);
        buttonHoliday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordKind.word =3;
                Intent intent = new Intent(WordType.this, VocabularyLesson.class);
                startActivity(intent);
            }
        });
        Button buttonNumbers;
        buttonNumbers = findViewById(R.id.numbersButton);
        buttonNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordKind.word =4;
                Intent intent = new Intent(WordType.this, VocabularyLesson.class);
                startActivity(intent);
            }
        });

        Button buttonMixture;
        buttonMixture = findViewById(R.id.mixtureButton);
        buttonMixture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wordKind.word =5;
                Intent intent = new Intent(WordType.this, VocabularyLesson.class);
                startActivity(intent);
            }
        });
    }
}