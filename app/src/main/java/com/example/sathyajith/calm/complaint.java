package com.example.sathyajith.calm;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class complaint extends AppCompatActivity {
EditText edname,edcomplaint,eddetails,edloc,edstn;
Button edsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complaint_activity);
edname=(EditText)findViewById(R.id.name);
edcomplaint=(EditText)findViewById(R.id.complaint);
eddetails=(EditText)findViewById(R.id.details);
edloc=(EditText)findViewById(R.id.loc);
edstn=(EditText)findViewById(R.id.station);
edsubmit=(Button)findViewById(R.id.submit);
edsubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name=edname.getText().toString();
        String compt=edcomplaint.getText().toString();
        String det=eddetails.getText().toString();
        String loc=edloc.getText().toString();
        String stn=edstn.getText().toString();

    }
});



    }

}
