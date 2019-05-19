package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p4_findid extends AppCompatActivity {

    Button btnfindid;
    Button btnmakeuser;
    Button btnfindpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p4_findid);
        btnfindid = findViewById(R.id.btnfindid);

        btnmakeuser = findViewById(R.id.btnmakeuser);
        btnmakeuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomakeuser = new Intent(getApplicationContext(),p3_makeuser.class);
                startActivity(gomakeuser);


            }
        });


        btnfindpwd = findViewById(R.id.btnfindpwd);
        btnfindpwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gofindpwd = new Intent(getApplicationContext(),p5_findpwd.class);
                startActivity(gofindpwd);
            }
        });

    }
}
