package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class p5_findpwd extends AppCompatActivity {

    Button btnfindid;
    Button btnmakeuser;
    Button btnfindpwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p5_findpwd);

        btnfindpwd = findViewById(R.id.btnfindpwd);

        btnmakeuser = findViewById(R.id.btnmakeuser);
        btnmakeuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomakeuser = new Intent(getApplicationContext(),p3_makeuser.class);
                startActivity(gomakeuser);

            }
        });

        btnfindid = findViewById(R.id.btnfindid);
        btnfindid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gofindid = new Intent(getApplicationContext(),p4_findid.class);
                startActivity(gofindid);
            }
        });

    }
}
