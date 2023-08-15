package com.example.recyklapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LLamado de opciones del Menu Principal
        ImageView OptionOne = findViewById(R.id.optionOne);
        ImageView OptionTwo = findViewById(R.id.optionTwo);
        ImageView OptionThree = findViewById(R.id.optionThree);
        ImageView OptionFour = findViewById(R.id.optionFour);
        ImageView OptionFive = findViewById(R.id.optionFive);
        ImageView OptionSix = findViewById(R.id.optionSix);


        OptionOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent howRecycle = new Intent(MainActivity.this, InstructionsActivity.class);
                startActivity(howRecycle);
            }
        });

        OptionTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent greenMap = new Intent(MainActivity.this, GreenMapActivity.class);
                startActivity(greenMap);
            }
        });

        OptionThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent videoTips = new Intent(MainActivity.this, TipsActivity.class);
                startActivity(videoTips);
            }
        });

        OptionFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recyGame = new Intent(MainActivity.this, RecyGameActivity.class);
                startActivity(recyGame);
            }
        });

        OptionFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recyGame = new Intent(MainActivity.this, RecyGameActivity.class);
                startActivity(recyGame);
            }
        });

        OptionSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(MainActivity.this, ContactActivity.class);
                startActivity(contact);
            }
        });

    }
}