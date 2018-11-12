/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.arch.lifecycle.ViewModelProviders;


/**
 * This activity keeps track of the basketball score for 2 teams.
 */
public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
   // private int scoreTeamA = 0;

    // Tracks the score for Team B
  // private int scoreTeamB = 0;
    ScoreViewModel mViewModel;

    private  TextView scoreViewB = null;
  private  TextView scoreViewA = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);


         scoreViewB = (TextView) findViewById(R.id.team_b_score);
         scoreViewA = (TextView) findViewById(R.id.team_a_score);

        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);


    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 1;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 2;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View v) {
        mViewModel.scoreTeamA = mViewModel.scoreTeamA + 3;
        displayForTeamA(mViewModel.scoreTeamA);
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 1;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 2;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    public void addThreeForTeamB(View v) {
        mViewModel.scoreTeamB = mViewModel.scoreTeamB + 3;
        displayForTeamB(mViewModel.scoreTeamB);
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        mViewModel.scoreTeamA = 0;
        mViewModel.scoreTeamB = 0;
        displayForTeamA(mViewModel.scoreTeamA);
        displayForTeamB(mViewModel.scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA(int score) {
       // TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    private void displayForTeamB(int score) {
 //       TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
}
