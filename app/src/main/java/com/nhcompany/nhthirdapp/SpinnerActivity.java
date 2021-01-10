package com.nhcompany.nhthirdapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class SpinnerActivity extends AppCompatActivity {
    Spinner spinner;
    ArrayList<String> names ;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);


spinner = findViewById(R.id.spinner);
        names = new ArrayList<>();
        names.add("hajer");
        names.add("salah");
        names.add("hajer");
        names.add("salah");
        names.add("hajer");
        names.add("salah");

        adapter = new ArrayAdapter<String>(SpinnerActivity.this , android.R.layout.simple_list_item_1 , android.R.id.text1,names);
        spinner.setAdapter(adapter);
    }
}
