package com.example.sathyajith.calm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CrimeRegister extends AppCompatActivity {
EditText edcat,edcrime,edfir,eddate,edloc;
Button edsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crime_register);
        edcat=(EditText)findViewById(R.id.category);
        edcrime=(EditText)findViewById(R.id.crimename);
        edfir=(EditText)findViewById(R.id.firno);
        eddate=(EditText)findViewById(R.id.dt);
        edloc=(EditText)findViewById(R.id.loc);
        edsubmit=(Button)findViewById(R.id.submit);
        edsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String category=edcat.getText().toString();
                String crime=edcrime.getText().toString();
                String fir=edfir.getText().toString();
                String date=eddate.getText().toString();
                String loc=edloc.getText().toString();
            }
        });

    }
}
