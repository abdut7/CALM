package com.example.sathyajith.calm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MissingSearch extends AppCompatActivity  {
    private ArrayList<Missingmodel> missingList;
    private RecyclerView recyclerView;
    private MissingAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_search);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
       startActivity(new Intent(this,Main2Activity.class));
missingList=new ArrayList<Missingmodel>();
            mAdapter = new MissingAdapter(missingList, getApplicationContext());



        Missingmodel m2=new Missingmodel("abdu","10","info","info");
        missingList.add(0,m2);
        Missingmodel m3=new Missingmodel("abdus","10ee","inefo","ienfo");
        missingList.add(1,m3);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());



        recyclerView.setAdapter(mAdapter);



        mAdapter.notifyDataSetChanged();






    }
private  void makeItem(){



}

}
