package com.example.android.ngscorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Variables to keep score. A,B - teams
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

        //Display initial values on layout
        displayScoreA();
        displayScoreB();
        displayYellowA();
        displayYellowB();
        displayRedA();
        displayRedB();
    }

    /**
     * Display sore for team A
     */
    public void displayScoreA() {
        TextView scoreView = (TextView) findViewById(R.id.text_score_a);
        scoreView.setText(String.valueOf(scoreA));
    }

    /**
     * Display score for team B
     */
    public void displayScoreB() {
        TextView scoreView = (TextView) findViewById(R.id.text_score_b);
        scoreView.setText(String.valueOf(scoreB));
    }

    /**
     * Display counter for team A yellow cards
     */
    public void displayYellowA() {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score_a);
        scoreView.setText(String.valueOf(cardYellowA));
    }

    /**
     * Display counter for team B yellow cards
     */
    public void displayYellowB() {
        TextView scoreView = (TextView) findViewById(R.id.yellow_score_b);
        scoreView.setText(String.valueOf(cardYellowB));
    }

    /**
     * Display counter for team B yellow cards
     */
    public void displayRedA() {
        TextView scoreView = (TextView) findViewById(R.id.red_score_a);
        scoreView.setText(String.valueOf(cardRedA));
    }

    /**
     * Display counter for team B yellow cards
     */
    public void displayRedB() {
        TextView scoreView = (TextView) findViewById(R.id.red_score_b);
        scoreView.setText(String.valueOf(cardRedB));
    }

    /**
     * When goal button for team A is pressed
     *
     * @param view view
     */
    public void clickGoalA(View view) {
        scoreA += 1;
        displayScoreA();
    }

    /**
     * When goal button for team B is pressed
     *
     * @param view view
     */
    public void clickGoalB(View view) {
        scoreB += 1;
        displayScoreB();
    }

    /**
     * When yellow card button for team A is pressed
     *
     * @param view view
     */
    public void clickYellowA(View view) {
        cardYellowA += 1;
        displayYellowA();
    }

    /**
     * When yellow card button for team B is pressed
     *
     * @param view view
     */
    public void clickYellowB(View view) {
        cardYellowB += 1;
        displayYellowB();
    }

    /**
     * When red card button for team A is pressed
     *
     * @param view view
     */
    public void clickRedA(View view) {
        cardRedA += 1;
        displayRedA();
    }

    /**
     * When red card button for team B is pressed
     *
     * @param view view
     */
    public void clickRedB(View view) {
        cardRedB += 1;
        displayRedB();
    }

    /**
     * When click reset button
     *
     * @param view view
     */
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

