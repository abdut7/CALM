package com.example.sathyajith.calm;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Missingmodel> itemList;
   IteamAdapter iteamAdapter;
  Missingmodel itemMode,jl;
    private DatabaseReference mDatabase;

    SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        recyclerView=findViewById(R.id.recyclerview);
        refreshLayout=(SwipeRefreshLayout)findViewById(R.id.sw_refresh);
        itemList = new ArrayList<Missingmodel>();
//        jk();
        iteamAdapter=new IteamAdapter(itemList,getApplicationContext());
        mDatabase = FirebaseDatabase.getInstance().getReference("Added_MissingCases");
        //        itemMode=new Missingmodel("abdu","10","info","info");
//        itemList.add(itemMode);itemMode=new Missingmodel("abdu","10","info","info");
     //   itemList.add(itemMode);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(iteamAdapter);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  startActivity(new Intent(MainActivity.this,Main2Activity.class));
               // Toast.makeText(Main2Activity.this, itemMode.getIname(), Toast.LENGTH_SHORT).show();
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

                iteamAdapter.notifyDataSetChanged();
                Toast.makeText(Main2Activity.this, "no"+iteamAdapter.getItemCount(), Toast.LENGTH_SHORT).show();

            }
        });

        SharedPreferences sp=getSharedPreferences("MyPref", Activity.MODE_PRIVATE);
        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                for ( DataSnapshot itemDataSnapshot : dataSnapshot.getChildren() ) {
//                    Room room = roomDataSnapshot.getValue(Room.class);
//
//                    yourList.add(room.getRoom_name_pucblic());
//                    yourAdapter.notifyDataSetChanged();

                    String name = "Name  : ", age = "Age  :", location = "Place :  ", info = "More Info  : ";
                    name += itemDataSnapshot.child("name").getValue(String.class);
                    age += itemDataSnapshot.child("age").getValue(String.class);
                    location += itemDataSnapshot.child("loc").getValue(String.class);
                    info += itemDataSnapshot.child("info").getValue(String.class);
                    itemMode = new Missingmodel(name, age, location, info);
                    itemList.add(itemMode);
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
    public void jk(){
        for(int i=0;i<4;i++){
            jl=new Missingmodel("abdu","10","info","info");
            itemList.add(jl);}
        // iteamAdapter.notifyDataSetChanged();
    }


}
