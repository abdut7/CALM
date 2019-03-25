package com.example.sathyajith.calm;

import android.os.Bundle;
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

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    RecyclerView recyclerView;
    private ArrayList<Missingmodel> itemList;
   IteamAdapter iteamAdapter;
  Missingmodel itemMode,jl;
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
        jk();
        iteamAdapter=new IteamAdapter(itemList,getApplicationContext());
        itemMode=new Missingmodel("abdu","10","info","info");
        itemList.add(itemMode);

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
                itemMode=new Missingmodel("abdu","10","info","info");
                itemList.add(itemMode);
                jk();
                iteamAdapter.notifyDataSetChanged();
                Toast.makeText(Main2Activity.this, "no"+iteamAdapter.getItemCount(), Toast.LENGTH_SHORT).show();

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
