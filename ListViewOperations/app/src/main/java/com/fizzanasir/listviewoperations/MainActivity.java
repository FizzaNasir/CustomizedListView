package com.fizzanasir.listviewoperations;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ListView lstview;
    EditText inputTask;
    Button adTask;
    ArrayList<String> tasks;
    ArrayAdapter<String> adaptor;
    String task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstview=findViewById(R.id.tasks);
        inputTask=findViewById(R.id.txt);
        task=  inputTask.getText().toString();
        adTask= findViewById(R.id.addtask);
        adTask.setOnClickListener(this);
        tasks=new ArrayList<String>();
        adaptor=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tasks);
    }

    @Override
    public void onClick(View view) {
        tasks.add(task);
        lstview.setAdapter(adaptor);
    }
}