package com.fizzanasir.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview=findViewById(R.id.fruits);
        ArrayList<String> fruitList = new ArrayList<String>();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Peach");
        fruitList.add("Apricot");
        fruitList.add("Cherry");

        ArrayAdapter<String> adaptor=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, fruitList);
        listview.setAdapter(adaptor);

    }
}