package com.example.sathyajith.calm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class StationRegistration extends AppCompatActivity {
    EditText edstation,edpass,eddist,edpin,edphno;
    Button bsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_registration);
        edstation=(EditText)findViewById(R.id.stname);
        edpass=(EditText)findViewById(R.id.pwd);
        eddist=(EditText)findViewById(R.id.dst);
        edpin=(EditText)findViewById(R.id.pin);
        edphno=(EditText)findViewById(R.id.phno);
        bsubmit=(Button)findViewById(R.id.submit);
        bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=edstation.getText().toString();
                String pass=edpass.getText().toString();
                String dist=eddist.getText().toString();
                String pin=edpin.getText().toString();
                String phno=edphno.getText().toString();
            }
        });

    }
}
