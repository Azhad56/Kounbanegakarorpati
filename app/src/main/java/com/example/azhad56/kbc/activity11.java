package com.example.azhad56.kbc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity11 extends AppCompatActivity {
    public int result=100;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity11);
        Bundle getvalue = getIntent().getExtras();
        if(getvalue==null) {
            return;
        }
        result = getvalue.getInt("result");
        tv= (TextView) findViewById(R.id.score);
        tv.setText(" "+result);
    }
    public void Gotohome(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
}
