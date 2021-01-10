package com.nhcompany.nhthirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listview;
    ArrayList<String> names ;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview=findViewById(R.id.list);

        names = new ArrayList<>();
        names.add("hajer");
        names.add("salah");                            
        names.add("rawan");
        names.add("salah");
        names.add("tasneem");
        names.add("salah");

        adapter = new ArrayAdapter<String>(MainActivity.this , android.R.layout.simple_list_item_1 , android.R.id.text1,names);
        listview.setAdapter(adapter);
    }
}
