package com.example.sathyajith.calm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;

public class Firstpage extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);
        final Button b=(Button)findViewById(R.id.signup);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popup = new PopupMenu(Firstpage.this,b);
                popup.getMenuInflater().inflate(R.menu.menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId())
                        {
                            case R.id.i1:
                            {
                                startActivity(new Intent(Firstpage.this,StationRegistration.class));
                                break;
                            }
                            case R.id.i2:{
                                startActivity(new Intent(Firstpage.this,user_signup.class));
                                break;

                            }

                        }
                        return true;
                    }
                });
                popup.show();
            }
        });
    }


public void lookoutclick(View v)
{
    Intent i=new Intent(this,LookoutSearch.class);
    startActivity(i);
}
public void missingclick(View v)
{
    Intent i=new Intent(this,MissingSearch.class);
    startActivity(i);

}
public void usersignin(View v)
{
    Intent i=new Intent(this,Userhomepage.class);
    startActivity(i);

}
public void policesignin(View v)
{
    Intent i=new Intent(this,stationsignin.class);
    startActivity(i);
}

}


