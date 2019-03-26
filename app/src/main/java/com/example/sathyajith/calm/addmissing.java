package com.example.sathyajith.calm;

import android.app.Activity;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class addmissing extends AppCompatActivity {
    EditText edname,edage,edloc,edinfo;
    Button edphoto,edsubmit;
    SharedPreferences.Editor eds;
    private DatabaseReference mDatabase;

    int c=0;String upload;
    Missingmodel missing;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addmissing);
        edname=(EditText)findViewById(R.id.name);
        edphoto=(Button)findViewById(R.id.photo);
        edage=(EditText)findViewById(R.id.age);
        edloc=(EditText)findViewById(R.id.loc);
        edinfo=(EditText)findViewById(R.id.info);
        edsubmit=(Button)findViewById(R.id.submit);
        SharedPreferences sp=getSharedPreferences("MyPref", Activity.MODE_PRIVATE);
        eds= sp.edit();
        c=sp.getInt("missingno",0);
        mDatabase = FirebaseDatabase.getInstance().getReference("Added_MissingCases");
        edsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=edname.getText().toString();
                String photo=edphoto.getText().toString();
                String age=edage.getText().toString();
                String loc=edloc.getText().toString();
                String info=edinfo.getText().toString();
                missing=new Missingmodel(name,age,loc,info);
                edinfo.setText("");edage.setText("");edloc.setText("");edinfo.setText("");
                mDatabase.push().setValue(missing);

            }
        });

    }
}
