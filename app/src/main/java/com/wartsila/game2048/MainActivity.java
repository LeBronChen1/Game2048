package com.wartsila.game2048;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvScore;
    private int score=0;

    private static MainActivity mainAcitivity=null;
    public MainActivity(){
        mainAcitivity = this;
    }
    public static MainActivity getMainAcitivity(){
        return mainAcitivity;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tvScore = (TextView) findViewById(R.id.tvScore);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    public void clearScore(){
        score = 0;
        showScore();
    }
    public void showScore(){
        tvScore.setText(score+" ");
    }
    public void addScore(int s){
        score+=s;
        showScore();
    }
}
