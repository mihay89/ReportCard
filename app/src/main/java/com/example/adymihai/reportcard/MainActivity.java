package com.example.adymihai.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       ReportCard report = new ReportCard("Mihai Badea", 5, 7, 10, 8, 4);
        Log.d("ReportCard: ", report.toString() );

    }
}
