package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreJuventus = 0;
    int scoreBarcellona = 0;
    int foulsJuventus = 0;
    int foulsBarcellona = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method increase the score for Juventus Team by 1 point.
     */
    public void addOneToJuventus(View view) {
        scoreJuventus = scoreJuventus + 1;
        displayForJuventus(scoreJuventus);
    }

    /**
     * This method increase the score for Barcellona Team by 1 point.
     */
    public void addOneToBarcellona(View view) {
        scoreBarcellona = scoreBarcellona + 1;
        displayForBarcellona(scoreBarcellona);
    }

    /**
     * This method increase the fouls of Barcellona Team by 1.
     */
    public void addOneFoulToBarca(View view) {
        foulsBarcellona = foulsBarcellona + 1;
        displayBarcellonaFouls(foulsBarcellona);
    }

    /**
     * This method increase the fouls of Barcellona Team by 1.
     */
    public void addOneFoulToJuve(View view) {
        foulsJuventus = foulsJuventus + 1;
        displayJuventusFouls(foulsJuventus);
    }

    /**
     * This method set score and fouls of both Teams to zero.
     */
    public void resetScore(View view){
        scoreJuventus = scoreBarcellona = 0;
        foulsJuventus = foulsBarcellona = 0;
        displayForJuventus(scoreJuventus);
        displayForBarcellona(scoreBarcellona);
        displayBarcellonaFouls(foulsBarcellona);
        displayJuventusFouls(foulsJuventus);
    }

    /**
     * Displays the given score for Juventus Team.
     */
    public void displayForJuventus(int score) {
        TextView scoreView = (TextView) findViewById(R.id.juventus_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Barcellona Team.
     */
    public void displayForBarcellona(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Juventus Team.
     */
    public void displayJuventusFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.juventus_fouls);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given fouls for Barcellona Team.
     */
    public void displayBarcellonaFouls(int score) {
        TextView scoreView = (TextView) findViewById(R.id.barcelona_fouls);
        scoreView.setText(String.valueOf(score));
    }
}
