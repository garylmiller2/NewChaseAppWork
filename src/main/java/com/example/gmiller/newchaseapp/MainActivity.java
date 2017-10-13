package com.example.gmiller.newchaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txtViewTitle;
    Button btnGetSentence;
    TextView txtViewShowSentence;
    Spinner spnChooseWord;
    Button btnCheckAnswer;
    TextView txtGiveResponse;

    String a = "I want __ new bike for my birthday.";
    String and = "Can I have __ ice cream?";
    String are = "There __ several toys on the bedroom floor.";
    String can = "I __ be anything I want when I grow up.";
    String go = "Let's __ to the park.";
    String has = "Everyone __ dreams.";
    String have = "Can I __ a birthday party?";
    String he = "After I stopped playing with the baby __ started crying.";
    String here = "I would like you to play over __.";
    String I = "My parents said __ can have a sleep over.";
    String is = "What __ this?";
    String like = "Do you __ playing baseball?";
    String little = "They always say I'm too __ to play with the big kids.";
    String look = "Let's __ at the moon and stars.";
    String me = "You really scared __.";
    String my = "That's __ video game.";
    String play = "I want to __ at the park today.";
    String said = "My dad __ that he loves me.";
    String see = "I would like to __what's cooking in the kitchen.";
    String she = "My mom fell down and __hurt her foot.";
    String the = "Let's play __game called Minecraft.";
    String to = "Do you want __ play with me?";
    String was = "Last year I __ six years old.";
    String we = "When are __ going to the movies?";
    String what = "That's __ I said to my dad.";
    String where = "__would you like to go tonight?";
    String with = "My cousin came __ us camping.";
    String jump = "I love to __ on my trampoline.";
    String up = "You have to look __ to see the sky.";
    String not = "That was __ part of the plan.";


    Random r;
    String currentSentence;

    String[] dictionary = {
            "I want __ new bike for my birthday.",
            "Can I have cake __ ice cream?",
            "There __ several toys on the bedroom floor.",
            "I __ be anything I want when I grow up.",
            "Bobby does not have anything to __ today.",
            "Did you buy that toy __ me?",
            "Let's __ to the park.",
            "Everyone __ dreams.",
            "Can I __ a birthday party?",
            "After I stopped playing with the baby __ started crying.",
            "I would like you to play over __.",
            "My parents said __ can have a sleep over.",
            "What __ this?",
            "Do you __ playing baseball?",
            "They always say I'm too __ to play with the big kids.",
            "Let's __ at the moon and stars.",
            "You really scared __.",
            "That's __ video game.",
            "I want to __ at the park today.",
            "My dad __ that he loves me.",
            "I would like to __what's cooking in the kitchen.",
            "My mom fell down and __hurt her foot.",
            "Let's play __game called Minecraft.",
            "I would like to play __game instead.",
            "Do you want __ play with me?",
            "Last year I __ six years old.",
            "When are __ going to the movies?",
            "That's __ I said to my dad.",
            "__would you like to go tonight?",
            "My cousin came __ us camping.",
            "I love to __ on my trampoline.",
            "You have to look __ to see the sky.",
            "That was __ part of the plan.",


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtViewTitle = (TextView) findViewById(R.id.textViewTitle);
        btnGetSentence = (Button) findViewById(R.id.buttonGetSentence);
        txtViewShowSentence = (TextView) findViewById(R.id.textViewShowSentence);
        spnChooseWord = (Spinner) findViewById(R.id.spinnerChooseWord);
        btnCheckAnswer = (Button) findViewById(R.id.buttonCheckAnswer);
        txtGiveResponse = (TextView) findViewById(R.id.textViewResponse);

        r = new Random();

        btnGetSentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newSentence();

            }
        });

        btnCheckAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAnswer();

            }
        });


    }

    private String shuffleSentence(String sentence) {
        List<String> sentences = Arrays.asList(sentence);
        Collections.shuffle(sentences);
        String shuffled = "";
        for (String quote : sentences) {
            shuffled += quote;
        }
        return shuffled;
    }

    private void newSentence() {

        currentSentence = dictionary[r.nextInt(dictionary.length)];
        txtViewShowSentence.setText(shuffleSentence(currentSentence));


    }

    private void checkAnswer() {

        String a = "I want __ new bike for my birthday.";
        String and = "Can I have cake __ ice cream?";
        String are = "There __ several toys on the bedroom floor.";
        String can = "I __ be anything I want when I grow up.";
        String go = "Let's __ to the park.";
        String has = "Everyone __ dreams.";
        String have = "Can I __ a birthday party?";
        String he = "After I stopped playing with the baby __ started crying.";
        String here = "I would like you to play over __.";
        String I = "My parents said __ can have a sleep over.";
        String is = "What __ this?";
        String like = "Do you __ playing baseball?";
        String little = "They always say I'm too __ to play with the big kids.";
        String look = "Let's __ at the moon and stars.";
        String me = "You really scared __.";
        String my = "That's __ video game.";
        String play = "I want to __ at the park today.";
        String said = "My dad __ that he loves me.";
        String see = "I would like to __what's cooking in the kitchen.";
        String she = "My mom fell down and __hurt her foot.";
        String the = "Let's play __game called Minecraft.";
        String to = "Do you want __ play with me?";
        String was = "Last year I __ six years old.";
        String we = "When are __ going to the movies?";
        String what = "That's __ I said to my dad.";
        String where = "__would you like to go tonight?";
        String with = "My cousin came __ us camping.";
        String jump = "I love to __ on my trampoline.";
        String up = "You have to look __ to see the sky.";
        String not = "That was __ part of the plan.";

        


        String selectedWord = spnChooseWord.getSelectedItem().toString();


        if (selectedWord.equalsIgnoreCase("a")) {
            if (currentSentence.equalsIgnoreCase(a)) {
                txtGiveResponse.setText("Great Job Word Master!");
            }

        } else txtGiveResponse.setText("Oh Sorry Word Master, try again. You can do it!");

        if (selectedWord.equalsIgnoreCase("and")) {
            if (currentSentence.equalsIgnoreCase(and)) {
                txtGiveResponse.setText("Great Job Word Master!");
            }

        } else txtGiveResponse.setText("Oh Sorry Word Master, try again. You can do it!");


    }
}
