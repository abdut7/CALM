package com.example.sathyajith.calm;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class StationRegistration extends AppCompatActivity {
    EditText edstation,edpass,eddist,edmail,edphno;
    Button bsubmit;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_registration);
        FirebaseApp.initializeApp(this);
        edstation=(EditText)findViewById(R.id.stname);
        edpass=(EditText)findViewById(R.id.pwd);
        eddist=(EditText)findViewById(R.id.dst);
        edmail=(EditText)findViewById(R.id.mail);
        edphno=(EditText)findViewById(R.id.phno);
        bsubmit=(Button)findViewById(R.id.submit);
        mAuth = FirebaseAuth.getInstance();
        SharedPreferences sp=getSharedPreferences("MyPref", Activity.MODE_PRIVATE);
        final SharedPreferences.Editor ed= sp.edit();
        bsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st=edstation.getText().toString();
                String pass=edpass.getText().toString();
                String dist=eddist.getText().toString();
                final String mail=edmail.getText().toString();
                String phno=edphno.getText().toString();
                mAuth.createUserWithEmailAndPassword(mail, pass)
                        .addOnCompleteListener(StationRegistration.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    FirebaseUser user = mAuth.getCurrentUser();
                                    ed.putString("username",mail);
                                    ed.putBoolean("login_status",true);
                                    ed.commit();
                                    startActivity(new Intent(StationRegistration.this,Policehomepage.class));

                                } else {
                                    // If sign in fails, display a message to the user.

                                    Toast.makeText(StationRegistration.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }

                                // ...
                            }
                        });
            }
        });

    }
}
