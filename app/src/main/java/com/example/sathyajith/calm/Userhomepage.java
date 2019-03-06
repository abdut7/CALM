package com.example.sathyajith.calm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Userhomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userhomepage);
        Button b1=(Button)findViewById(R.id.fcomplaint);
        Button b2=(Button)findViewById(R.id.vmissing);
        Button b3=(Button)findViewById(R.id.vlookout);
        Button b4=(Button)findViewById(R.id.scrime);
        Button b5=(Button)findViewById(R.id.sstation);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Userhomepage.this,complaint.class));
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Userhomepage.this,MissingSearch.class));
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Userhomepage.this,LookoutSearch.class));
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Userhomepage.this,Crimesearch.class));
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Userhomepage.this,StationSearch.class));
            }
        });
    }
}
