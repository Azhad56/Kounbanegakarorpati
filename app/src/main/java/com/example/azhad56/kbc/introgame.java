package com.example.azhad56.kbc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class introgame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introgame);
    }
    public void getactivity(View view)
    {
        Intent i = new Intent(this,activity1.class);
        startActivity(i);
    }
}
