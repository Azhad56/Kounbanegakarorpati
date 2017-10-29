package com.example.azhad56.kbc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;

public class activity1 extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;
    public int inc=50000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);
    }
    public void Gotohome(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void Countresult(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        Intent i1 = new Intent(this,activity2.class);
        Intent i2 = new Intent(this,MainActivity.class);
        switch(view.getId())
        {
            case R.id.rb1:
                startActivity(i1);
                break;
            case R.id.rb2:
                startActivity(i1);
                break;
            case R.id.rb3:
                i2.putExtra("count",inc);
                startActivity(i1);
                break;
            case R.id.rb4:
                startActivity(i1);
                break;

        }

    }
}
