package com.nhcompany.nhthirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class GridView extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> names;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        //gridView =findViewById(R.id.gridView1);
        names = new ArrayList<>();

        names.add("hajer");
        names.add("salah");
        names.add("rawan");
        names.add("salah");
        names.add("tasneem");
        names.add("salah");

        adapter = new ArrayAdapter<String>( GridView.this, android.R.layout.simple_list_item_1 , android.R.id.text1 , names);
        //gridView.setAdapter(adapter);

    }
}
