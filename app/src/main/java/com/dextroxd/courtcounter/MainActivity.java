package com.dextroxd.courtcounter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    int sc = 0;
    int scb = 0;
    public void displayForTeamA(int score)
    {
        TextView tv = (TextView)findViewById(R.id.team_a_score);
        tv.setText(String.valueOf(score));
    }
    public void plusth(View view)
    {
        sc = sc + 3;
        displayForTeamA(sc);
    }
    public void plustw(View view)
    {
        sc = sc + 2;
        displayForTeamA(sc);
    }
    public void pluso(View view)
    {
        sc = sc + 1;
        displayForTeamA(sc);
    }
    public void displayForTeamB(int score)
    {
        TextView tvb = (TextView)findViewById(R.id.team_b_score);
        tvb.setText(String.valueOf(score));
    }
    public void plusthb(View view)
    {
        scb = scb + 3;
        displayForTeamB(scb);
    }
    public void plustwb(View view)
    {
        scb = scb + 2;
        displayForTeamB(scb);
    }
    public void plusob(View view)
    {
        scb = scb + 1;
        displayForTeamB(scb);
    }
    public void reset(View view)
    {
        sc = 0;
        scb = 0;
        displayForTeamA(sc);
        displayForTeamB(scb);
    }
}
