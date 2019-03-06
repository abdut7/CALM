package com.example.sathyajith.calm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class StationSearch extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView tv;
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_station_search);
        tv=(TextView)findViewById(R.id.textView);
        sp=(Spinner)findViewById(R.id.spinner);
        String  d[]={"ALAPUZHA","ERNAKULAM","IDUKKI","KANNUR","KASARGOD","KOLLAM","KOTTAYAM","KOZHIKODE","MALAPPURAM","PALAKKAD","PATHANAMTHITTA","THIRUVANTHPURAM","THRISSUR","WAYANAD"};
        ArrayAdapter<String> ad=new ArrayAdapter<>(this,android.R.layout.activity_list_item);
        sp.setAdapter(ad);
        sp.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}



