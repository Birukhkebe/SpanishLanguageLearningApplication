package com.example.spanishlanguagelearningapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//import com.example.spanishlanguagelearningapplication.VocabularyList;
import com.example.spanishlanguagelearningapplication.WordType; // to identify selected wordType


import java.sql.SQLException;
import java.util.ArrayList;
class vars
{
    public static int i =0 ;
}

public class VocabularyLesson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        VocabularyList vocabularyList;
        DatabaseConnection dbConnection = new DatabaseConnection();

        System.out.println("Hi we are in Vocab Lesson!");
        System.out.println(wordKind.word);

        // Declare and Store english and spanish words on ArrayLists
        ArrayList<String> greetingsEnglishList = new ArrayList<>();
        ArrayList<String> greetingsSpanishList = new ArrayList<>();
        ArrayList<String> travelEnglishList = new ArrayList<>();
        ArrayList<String> travelSpanishList = new ArrayList<>();
        ArrayList<String> holidayEnglishList = new ArrayList<>();
        ArrayList<String> holidaySpanishList = new ArrayList<>();
        ArrayList<String> numbersEnglishList = new ArrayList<>();
        ArrayList<String> numbersSpanishList = new ArrayList<>();
        ArrayList<String> mixtureEnglishList = new ArrayList<>();
        ArrayList<String> mixtureSpanishList = new ArrayList<>();

        // Greetings is 1
        // Add to greetings english list
        greetingsEnglishList.add("Hello");
        greetingsEnglishList.add("Hi (informal)");
        greetingsEnglishList.add("Good Afternoon");
        greetingsEnglishList.add("Welcome");
        greetingsEnglishList.add("Good evening");
        // Add to greetings spanish list
        greetingsSpanishList.add("Hola");
        greetingsSpanishList.add("Buenas");
        greetingsSpanishList.add("Buenas Tardes");
        greetingsSpanishList.add("Bienvenidos");
        greetingsSpanishList.add("Buenas Noches");

        // Travel is 2
        //Add to travel english list
        travelEnglishList.add("Airport");
        travelEnglishList.add("flight");
        travelEnglishList.add("arrival");
        travelEnglishList.add("departure");
        travelEnglishList.add("Luggage");
        travelEnglishList.add("Plane");
        travelEnglishList.add("City");
        travelEnglishList.add("Country");
        travelEnglishList.add("Street");
        //Add to travel spanish list
        travelSpanishList.add("Aeropuerto");
        travelSpanishList.add("vuelo");
        travelSpanishList.add("llegada");
        travelSpanishList.add("partida");
        travelSpanishList.add("Equipaje");
        travelSpanishList.add("Avion");
        travelSpanishList.add("Ciudad");
        travelSpanishList.add("Pais");
        travelSpanishList.add("Calle");

        // Holiday is 3
        //Add to holiday english list
        holidayEnglishList.add("Holidays");
        holidayEnglishList.add("New year");
        holidayEnglishList.add("Christmas");
        holidayEnglishList.add("Easter");
        holidayEnglishList.add("Thanksgiving");
        holidayEnglishList.add("Passover");
        //Add to holiday spanish list
        holidaySpanishList.add("Dias Festivos");
        holidaySpanishList.add("Ano Nuevo");
        holidaySpanishList.add("Navidad");
        holidaySpanishList.add("Pascua");
        holidaySpanishList.add("Dia de Accion de Gracias");
        holidaySpanishList.add("Pascua Judia (Pesaj)");

        // Numbers is 4
        //Add to numbers english list
        numbersEnglishList.add("One");
        numbersEnglishList.add("Two");
        numbersEnglishList.add("Three");
        numbersEnglishList.add("Four");
        numbersEnglishList.add("Five");
        //Add to numbers spanish list
        numbersSpanishList.add("uno");
        numbersSpanishList.add("dos");
        numbersSpanishList.add("tres");
        numbersSpanishList.add("cuatro");
        numbersSpanishList.add("Cinco");

        // Mixture is 5
        // Add to mixture english list
        mixtureEnglishList.add("hello");
        mixtureEnglishList.add("One");
        mixtureEnglishList.add("Airport");
        mixtureEnglishList.add("Holidays");
        mixtureEnglishList.add("Four");
        // Add to mixture spanish list
        mixtureSpanishList.add("Hola");
        mixtureSpanishList.add("uno");
        mixtureSpanishList.add("Aeropuerto");
        mixtureSpanishList.add("Dias Festivos");
        mixtureSpanishList.add("cuatro");



        //ArrayList <String> testList = new ArrayList<>();
        //testList = dbConnection.getVocabList("ENG_Infinitive");
        //System.out.println(dbConnection.getVocabList("SPN_Infinitive").get(0));
        //System.out.println("RIGHT HERE !!!!!!!!! \n");
        //englishList = dbConnection.getVocabList("ENG_Infinitive");
        //spanishList = dbConnection.getVocabList("SPN_Infinitive");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vocabulary_lesson);

        TextView englishText = (TextView) findViewById(R.id.englishWord);
        //englishText.setText(englishList.get(vars.i));
        TextView spanishText = (TextView) findViewById(R.id.spanishWord);
        //spanishText.setText(spanishList.get(vars.i));

        //When next is clicked
        Button next = findViewById(R.id.nextButton);
        Button previous = findViewById(R.id.previousButton);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (wordKind.word == 1)
                {
                    englishText.setText(greetingsEnglishList.get(vars.i));
                    spanishText.setText(greetingsSpanishList.get(vars.i));
                    vars.i++;
                }

                if (wordKind.word == 2)
                {
                    englishText.setText(travelEnglishList.get(vars.i));
                    spanishText.setText(travelSpanishList.get(vars.i));
                    vars.i++;
                }

                if (wordKind.word == 3)
                {
                    englishText.setText(holidayEnglishList.get(vars.i));
                    spanishText.setText(holidaySpanishList.get(vars.i));
                    vars.i++;
                }

                if (wordKind.word == 4)
                {
                    englishText.setText(numbersEnglishList.get(vars.i));
                    spanishText.setText(numbersSpanishList.get(vars.i));
                    vars.i++;
                }

                if (wordKind.word == 5)
                {
                    englishText.setText(mixtureEnglishList.get(vars.i));
                    spanishText.setText(mixtureSpanishList.get(vars.i));
                    vars.i++;
                }


            }
        });

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vars.i--;
                //englishText.setText(testList.get(vars.i));

                if(wordKind.word == 1)
                {
                    englishText.setText(greetingsEnglishList.get(vars.i));
                    spanishText.setText(greetingsSpanishList.get(vars.i));
                }

                if(wordKind.word == 2)
                {
                    englishText.setText(travelEnglishList.get(vars.i));
                    spanishText.setText(travelSpanishList.get(vars.i));
                }

                if(wordKind.word == 3)
                {
                    englishText.setText(holidayEnglishList.get(vars.i));
                    spanishText.setText(holidaySpanishList.get(vars.i));
                }

                if(wordKind.word == 4)
                {
                    englishText.setText(numbersEnglishList.get(vars.i));
                    spanishText.setText(numbersSpanishList.get(vars.i));
                }
                if(wordKind.word == 5)
                {
                    englishText.setText(mixtureEnglishList.get(vars.i));
                    spanishText.setText(mixtureSpanishList.get(vars.i));
                }

            }
        });

        Button buttonQuiz;
        buttonQuiz = findViewById(R.id.quizButton);
        buttonQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VocabularyLesson.this, VocabularyBeginnerLevel.class);
                startActivity(intent);
            }

        });
    }
}
