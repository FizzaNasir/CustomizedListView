package com.example.app;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public abstract class MainActivity<button1, button> extends AppCompatActivity {
    public Button btn2, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    btn2 = (Button) findViewById(R.id.button2);
    //Redirect to second activity
        btn2.setOnClickListener(view -> openLearnActivity());
}
    public void openLearnActivity() {
        Intent intent = new Intent(this, LearnActivity.class);
        startActivity(intent);

    }

   btn1 = (Button) findViewById(R.id.button1);
//    button2.setOnClickListener(view -> openLearnActivity());




        }

