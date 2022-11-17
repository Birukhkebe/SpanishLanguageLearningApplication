package com.example.spanishlanguagelearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
class vars
{
    public static int i =0 ;
    //public
}
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



        TextView englishText = (TextView) findViewById(R.id.englishWord);
        //englishText.setText(englishList.get(vars.i));

        TextView spanishText =(TextView) findViewById(R.id.spanishWord);
        //spanishText.setText(spanishList.get(vars.i));

        //When next is clicked
        Button next =  findViewById(R.id.nextButton);
        Button previous = findViewById(R.id.previousButton);

        //while(vars.i < englishList.size()) {

            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    

                    englishText.setText(englishList.get(vars.i));
                    spanishText.setText(spanishList.get(vars.i));
                    vars.i++;

                }
            });

        //}

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vars.i--;
                englishText.setText(englishList.get(vars.i));
                spanishText.setText(spanishList.get(vars.i));
            }
        });

    }
}