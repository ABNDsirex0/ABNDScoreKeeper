package com.example.android.ngscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int cardYellowA = 0;
    int cardYellowB = 0;
    int cardRedA = 0;
    int cardRedB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreA();
        displayScoreB();
        displayYellowA();
        displayYellowB();
        displayRedA();
        displayRedB();

        //displayRedScore();
    }

    public void displayScoreA() {
        TextView scoreView = (TextView) findViewById(R.id.text_score_a);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayScoreB() {
        TextView scoreView = (TextView) findViewById(R.id.text_score_b);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void displayYellowA() {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score_a);
        scoreView.setText(String.valueOf(cardYellowA));
    }

    public void displayYellowB() {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score_b);
        scoreView.setText(String.valueOf(cardYellowB));
    }

    public void displayRedA() {
        TextView scoreView = (TextView) findViewById(R.id.red_score_a);
        scoreView.setText(String.valueOf(cardRedA));
    }

    public void displayRedB() {
        TextView scoreView = (TextView) findViewById(R.id.red_score_b);
        scoreView.setText(String.valueOf(cardRedB));
    }

    public void clickGoalA(View view) {
        scoreA += 1;
        displayScoreA();
    }

    public void clickGoalB(View view) {
        scoreB += 1;
        displayScoreB();
    }

    public void clickYellowA(View view) {
        cardYellowA += 1;
        displayYellowA();
    }

    public void clickYellowB(View view) {
        cardYellowB += 1;
        displayYellowB();
    }


    public void clickRedA(View view) {
        cardRedA += 1;
        displayRedA();
    }

    public void clickRedB(View view) {
        cardRedB += 1;
        displayRedB();
    }

    public void clickReset(View view) {
        scoreB = 0;
        scoreA = 0;
        cardRedA = 0;
        cardRedB = 0;
        cardYellowB = 0;
        cardYellowA = 0;
        displayRedA();
        displayRedB();
        displayYellowA();
        displayYellowB();
        displayScoreA();
        displayScoreB();
    }
}

