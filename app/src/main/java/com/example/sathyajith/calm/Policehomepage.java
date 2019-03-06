package com.example.sathyajith.calm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Policehomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_policehomepage);
        Button b1=(Button)findViewById(R.id.crime);
        Button b2=(Button)findViewById(R.id.addmissing);
        Button b3=(Button)findViewById(R.id.addlookout);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Policehomepage.this,CrimeRegister.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Policehomepage.this,addmissing.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Policehomepage.this,addlookout.class));
            }
        });
    }
}
