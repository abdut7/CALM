package com.example.sathyajith.calm;

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
    private List<Missingmodel> missingList;
    private RecyclerView recyclerView;
    private MissingAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_missing_search);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        missingList = new ArrayList<Missingmodel>();

            mAdapter = new MissingAdapter(missingList, getApplicationContext());

        Missingmodel m=new Missingmodel("abdu","10","info","info"



        );
        missingList.add(m); try{
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        }catch (Exception r){
            Toast.makeText(this, "error"+r, Toast.LENGTH_SHORT).show();
        }

        recyclerView.setAdapter(mAdapter);
        Toast.makeText(this, "trse", Toast.LENGTH_SHORT).show();
        makeItem();






    }
private  void makeItem(){

        Missingmodel m2=new Missingmodel("abdu","10","info","info");
    missingList.add(m2);
        missingList.add(m2);



    mAdapter.notifyDataSetChanged();

}

}
