package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset (View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * adds three to score
     */
    public void threePointA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }


    /**
     * adds two to score
     */
    public void twoPointA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }


    /**
     * adds one to score
     */
    public void freePointA(View view) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }


    /**
     * adds three to score
     */
    public void threePointB(View view) {
        scoreTeamB += 3;
        displayForTeamA(scoreTeamB);
    }


    /**
     * adds two to score
     */
    public void twoPointB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }


    /**
     * adds one to score
     */
    public void freePointB(View view) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
