package com.fizzanasir.customized_listview;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.fizzanasir.customized_listview.MainActivity;
import com.fizzanasir.customized_listview.R;
import com.fizzanasir.customized_listview.Students;

import java.util.ArrayList;

public class MyAdaptor extends ArrayAdapter<Students> {
    public MyAdaptor(@NonNull Context context, ArrayList<Students> arrayList)
    {
        super(context, 0, arrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        Students students= getItem(position);
        convertView=LayoutInflater.from(getContext()).inflate(R.layout.student_view, parent);

    TextView textViewName=convertView.findViewById(R.id.name);
    TextView textViewRollnum=convertView.findViewById(R.id.rollnum);
    TextView textViewsec=convertView.findViewById(R.id.sec);
        ImageView imgv=convertView.findViewById(R.id.img);
        textViewName.setText(students.getName());
        textViewRollnum.setText(students.getRollNumber());
        textViewsec.setText(students.getSection());
        imgv.setImageResource(students.getImageId());

        textViewName.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
//                                                Log.d("Name", students.getName());
//                                                Intent intent=new Intent(this, MainActivity.class); //we are inside a class and not in an activity
                                                //therefore we cant write this
                                                Intent intent=new Intent(getContext(), MainActivity.class);
                                                getContext().startActivity(intent);
                                            }
                                        }
        );

        //same for roll num and image and sec
    return convertView;
    }
}