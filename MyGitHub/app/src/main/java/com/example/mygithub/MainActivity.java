package com.example.mygithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.net.Uri;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view)
            {
                gotoUrl();
            }
        }
        );
    }
    public void gotoUrl(){
        Uri uri= Uri.parse("https://github.com/BSEF19A520");
        startActivity(new Intent(Intent.ACTION_VIEW , uri));

    }
}