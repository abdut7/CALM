package com.example.sathyajith.calm;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class complaint extends AppCompatActivity {
EditText edname,edcomplaint,eddetails,edloc,edstn;
Button edsubmit;
    SharedPreferences.Editor eds;
    private DatabaseReference mDatabase;
int c=0;String uname;
Complaintmodel complaint;
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
        SharedPreferences sp=getSharedPreferences("MyPref", Activity.MODE_PRIVATE);
        eds= sp.edit();
         c=sp.getInt("complaintno",0);
         uname=sp.getString("username","userunknown");
         edname.setText(uname);
        mDatabase = FirebaseDatabase.getInstance().getReference();

        edsubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name=edname.getText().toString();
        String compt=edcomplaint.getText().toString();
        String det=eddetails.getText().toString();
        String loc=edloc.getText().toString();
        String stn=edstn.getText().toString();
        complaint=new Complaintmodel(name,compt,det,loc,stn);
        mDatabase.child("Complaints_by_user").child(name).child("Complaint number ").setValue(complaint);

        startActivity(new Intent(complaint.this,Userhomepage.class));

//        c++;
//        eds.putInt("complaintno",c);
//        eds.commit();


    }
});



    }

}
