package com.nhcompany.nhthirdapp.advanced;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.nhcompany.nhthirdapp.MainActivity;
import com.nhcompany.nhthirdapp.R;

import java.util.ArrayList;

public class ListView2 extends AppCompatActivity {
    ListView listview;
    ArrayList<String> names ;
    ArrayAdapter<String> adapter;
    EditText editText;
    ImageView imageView;
    Button goToSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        listview=findViewById(R.id.list2);
        goToSpinner = findViewById(R.id.gotospinner);

        names = new ArrayList<>();
        names.add("hajer");
        names.add("salah");
        names.add("hajer");
        names.add("salah");
        names.add("hajer");
        names.add("salah");

        adapter = new ArrayAdapter<String>(ListView2.this , R.layout.contact_view , R.id.contactname ,names);
        listview.setAdapter(adapter);
        // to show toast on each item in the list view !!
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ListView2.this , "item "+position+" clicked" , Toast.LENGTH_SHORT).show();
            }
        });

        editText = findViewById(R.id.editText);
        imageView = findViewById(R.id.imageView);

        // to write a name on the edit text and added in the list at the same time !!
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
                editText.getText().clear();


            }
        });

        goToSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ListView2.this , SpinnerActivity2.class);
                startActivity(intent);
            }
        });
    }
}
