package com.fizzanasir.customized_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Students> myList=new ArrayList<>();
        myList.add(new Students("Fizza", "ASDF", "Alpha", R.drawable.a1));
        myList.add(new Students("Iffah", "ASDF", "Alpha", R.drawable.a2));
        myList.add(new Students("Fizza", "ASDF", "Alpha", R.drawable.a3));
        myList.add(new Students("Amna", "ASDF", "Alpha", R.drawable.a4));
        listView=findViewById(R.id.stlist);
        MyAdaptor myadapt=new MyAdaptor(this, myList);
        listView.setAdapter(myadapt);
    }

}