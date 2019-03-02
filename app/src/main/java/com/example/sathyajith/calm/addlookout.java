package com.example.sathyajith.calm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class addlookout extends AppCompatActivity {
EditText edname,edadd,eddist,eddes;
Button edphoto,edsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addlookout);
        edname=(EditText)findViewById(R.id.name);
        edphoto=(Button)findViewById(R.id.photo);
        edadd=(EditText)findViewById(R.id.add);
        eddist=(EditText)findViewById(R.id.dist);
        eddes=(EditText)findViewById(R.id.descptn);
        edsubmit=(Button)findViewById(R.id.submit);
        edsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=edname.getText().toString();
                String photo=edphoto.getText().toString();
                String add=edadd.getText().toString();
                String dis=eddist.getText().toString();
                String des=eddes.getText().toString();
            }
        });
    }
}
