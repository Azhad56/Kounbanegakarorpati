package com.example.azhad56.kbc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class activity4 extends AppCompatActivity {
    RadioButton rb1,rb2,rb3,rb4;
    public int inc=50000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
    }
    public void Gotohome(View view)
    {
        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
    }
    public void Countresult(View view)
    {
        boolean checked = ((RadioButton) view).isChecked();
        Intent i1 = new Intent(this,activity5.class);
        Intent i2 = new Intent(this,MainActivity.class);
        switch(view.getId())
        {
            case R.id.rb13:
                i2.putExtra("count",inc);
                startActivity(i1);
                break;
            case R.id.rb14:
                startActivity(i1);
                break;
            case R.id.rb15:
                startActivity(i1);
                break;
            case R.id.rb16:
                startActivity(i1);
                break;

        }
    }
}
