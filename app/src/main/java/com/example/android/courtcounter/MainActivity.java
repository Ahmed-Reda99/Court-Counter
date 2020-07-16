package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }

    public void reset(View view)
    {

        if(scoreTeamA > scoreTeamB)
            Toast.makeText(this, "Team A Wins", Toast.LENGTH_LONG).show();
        else
            Toast.makeText(this, "Team B Wins", Toast.LENGTH_SHORT).show();
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayTeamAScore(scoreTeamA);
        displayTeamBScore(scoreTeamB);
    }

    ///////////////////////////////                                        ///////////////////////////////
    //////////////////////////////                Team A                  ///////////////////////////////
    /////////////////////////////                                        ///////////////////////////////


    /**
     * This Function displays scoreTeamA
     */
    private void displayTeamAScore(int num)
    {
        TextView scoreTextView = (TextView) findViewById(R.id.teamAScore);
        scoreTextView.setText(num +"");
    }

    /**
     * This Function Adds 3 Points To scoreTeamA
     */
    public void addThreePointsToTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 3;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * This Function Adds 2 Points To scoreTeamA
     */
    public void addTwoPointsToTeamA(View view)
    {
        scoreTeamA = scoreTeamA + 2;
        displayTeamAScore(scoreTeamA);
    }

    /**
     * This Function Adds 1 Point To scoreTeamA
     */
    public void addOnePointToTeamA(View view)
    {
        scoreTeamA++;
        displayTeamAScore(scoreTeamA);
    }

    ///////////////////////////////                                        ///////////////////////////////
    //////////////////////////////                Team B                  ///////////////////////////////
    /////////////////////////////                                        ///////////////////////////////

    /**
     * This Function displays scoreTeamB
     */
    private void displayTeamBScore(int num)
    {
        TextView scoreTextView = (TextView) findViewById(R.id.teamBScore);
        scoreTextView.setText(num +"");
    }

    /**
     * This Function Adds 3 Points To scoreTeamB
     */
    public void addThreePointsToTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 3;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * This Function Adds 2 Points To scoreTeamB
     */
    public void addTwoPointsToTeamB(View view)
    {
        scoreTeamB = scoreTeamB + 2;
        displayTeamBScore(scoreTeamB);
    }

    /**
     * This Function Adds 1 Point To scoreTeamB
     */
    public void addOnePointToTeamB(View view)
    {
        scoreTeamB++;
        displayTeamBScore(scoreTeamB);
    }
}
