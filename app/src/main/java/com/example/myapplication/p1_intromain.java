package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class p1_intromain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p1_intromain);
        ImageView introimg = findViewById(R.id.introimg);
        Button strbtn = findViewById(R.id.strbtn);
        strbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gologin = new Intent(getApplicationContext(), p2_login.class);
                startActivity(gologin);
            }
        });

    }
}
