package com.example.spanishlanguagelearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class VocabularyLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_lesson);


        //Store english and spanish words on ArrayLists
        ArrayList <String> englishList = new ArrayList<>();
        ArrayList <String> spanishList = new ArrayList<>();

        englishList.add("hi");
        englishList.add("One");
        englishList.add("Two");
        englishList.add("Three");
        englishList.add("Four");

        spanishList.add("Hola");
        spanishList.add("uno");
        spanishList.add("dos");
        spanishList.add("tres");
        spanishList.add("cuatro");

        int i =0 ;

        TextView englishText = (TextView) findViewById(R.id.englishWord);
        englishText.setText(englishList.get(i));

        TextView spanishText =(TextView) findViewById(R.id.spanishWord);
        spanishText.setText(spanishList.get(i));

        //When next is clicked
        Button next =  findViewById(R.id.nextButton);
        Button previous = findViewById(R.id.previousButton);


        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //for(int j=1; j< englishList.size();j++) {
                    englishText.setText(englishList.get(i+1));
                    spanishText.setText(spanishList.get(i+1));
                //}
             }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                englishText.setText(englishList.get(0));
                spanishText.setText(spanishList.get(0));
            }
        });

    }
}