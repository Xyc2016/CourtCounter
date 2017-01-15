package com.example.x.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int aScores =0;
    int bScores =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayA(int scores){
        TextView textView = (TextView) findViewById(R.id.aScore);
        textView.setText(""+scores);
    }
    public void displayB(int scores){
        TextView textView = (TextView) findViewById(R.id.bScore);
        textView.setText(""+scores);
    }
    public void plusThreeScoreForA(View view){
        aScores +=3;
        displayA(aScores);
    }
    public void plusTwoScoreForA(View view){
        aScores +=2;
        displayA(aScores);
    }
    public void plusOneScoreForA(View view){
        aScores +=1;
        displayA(aScores);
    }
    public void plusThreeScoreForB(View view){
        bScores +=3;
        displayB(bScores);
    }
    public void plusTwoScoreForB(View view){
        bScores +=2;
        displayB(bScores);
    }
    public void plusOneScoreForB(View view){
        bScores +=1;
        displayB(bScores);
    }
    public void reset(View view){
        aScores=0;
        bScores=0;
        displayA(aScores);
        displayB(bScores);
    }
}
