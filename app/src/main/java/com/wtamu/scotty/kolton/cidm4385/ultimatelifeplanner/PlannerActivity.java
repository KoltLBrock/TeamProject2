package com.wtamu.scotty.kolton.cidm4385.ultimatelifeplanner;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlannerActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Button btn;
    private Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        Intent incoming = getIntent();

    }
}