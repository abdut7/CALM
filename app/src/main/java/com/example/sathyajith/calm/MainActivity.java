package com.example.sathyajith.calm;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {
    EditText edusername,edpassword;
    Button blogin,test;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activitymain);
        edusername=(EditText)findViewById(R.id.uname);
test=(Button)findViewById(R.id.tst);
        edpassword=(EditText)findViewById(R.id.password);
        blogin=(Button)findViewById(R.id.signin);
        mAuth = FirebaseAuth.getInstance();
        blogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
String u=edusername.getText().toString();
String p=edpassword.getText().toString();
                    mAuth.signInWithEmailAndPassword(u, p)
                                            .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                                                @Override
                                                public void onComplete(@NonNull Task<AuthResult> task) {
                                                    if (task.isSuccessful()) {
                                                        // Sign in success, update UI with the signed-in user's information
                                                        Toast.makeText(MainActivity.this, "Succes", Toast.LENGTH_SHORT).show();
                                                        FirebaseUser user = mAuth.getCurrentUser();

                                                    } else {
                                                        // If sign in fails, display a message to the user.

                                                        Toast.makeText(MainActivity.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();

                                }

                                // ...
                            }
                        });
                Toast.makeText(MainActivity.this, "user "+u+"\n"+p, Toast.LENGTH_SHORT).show();

              }
        });
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Userhomepage.class));
            }
        });

    }

}
