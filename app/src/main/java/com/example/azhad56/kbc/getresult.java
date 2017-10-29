package com.example.azhad56.kbc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class getresult extends AppCompatActivity {
    public int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getresult);
        Bundle getvalue=getIntent().getExtras();
        if(getvalue==null)
        {
            return;
        }
        result = getvalue.getInt("result");
    }
    public void getresult(View view)
    {
        Intent i = new Intent(this,activity11.class);
        i.putExtra("result",result);
        startActivity(i);
    }
}
