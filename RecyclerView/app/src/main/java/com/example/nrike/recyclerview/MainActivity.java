package com.example.nrike.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.*;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //RelativeLayout
    //--------------------------------------------------------
    RecyclerView rv ;
    LinearLayoutManager llm;
    RVAdapter adapter;

    public void setUI(){
        rv = (RecyclerView)findViewById(R.id.rv);
        llm = new LinearLayoutManager(this);
    }

    //List
    //--------------------------------------------------------
    List<Object> objects;

    public void newObjects(){
        objects = new ArrayList<>();
        objects.add(new Object("Android","1","Enrique"));
        objects.add(new Object("Android","2","Mara"));
        objects.add(new Object("IOS","3","Pablo"));
        objects.add(new Object("IOS","4","Mara"));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setUI();

        newObjects();

        adapter = new RVAdapter(objects);
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);

        //To notify changes
        //adapter.notifyDataSetChanged();
    }
}
