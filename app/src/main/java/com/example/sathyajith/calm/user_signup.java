package com.example.sathyajith.calm;

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

public class user_signup extends AppCompatActivity {
    EditText edname, edpass, edconfirm, edphone, edaadhar, edmail;
    Button bsubmit;
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_signup);
        FirebaseApp.initializeApp(this);
        edname = (EditText) findViewById(R.id.name);
        edpass = (EditText) findViewById(R.id.password);
        edconfirm = (EditText) findViewById(R.id.confirm);
        edphone = (EditText) findViewById(R.id.phno);
        edaadhar = (EditText) findViewById(R.id.aadhar);
        edmail = (EditText) findViewById(R.id.mail);
        bsubmit = (Button) findViewById(R.id.submit);
        try {
            mAuth = FirebaseAuth.getInstance();
        }catch (Exception e)
        {
            Toast.makeText(this, "error"+e.toString(), Toast.LENGTH_SHORT).show();
        }

            bsubmit.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        String name=edname.getText().toString();
        String pass=edpass.getText().toString();
        String confirm=edconfirm.getText().toString();
        String phone=edphone.getText().toString();
        String aadhar=edaadhar.getText().toString();
        String mail=edmail.getText().toString();
        mAuth.createUserWithEmailAndPassword(mail, pass)
                .addOnCompleteListener(user_signup.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            FirebaseUser user = mAuth.getCurrentUser();

                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(user_signup.this, "Authentication failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });

    }
});

    }
}
