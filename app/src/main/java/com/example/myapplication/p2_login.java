package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class p2_login extends AppCompatActivity {

    ImageView logoimage;
    TextView EtextL;
    EditText EtextR;

    TextView PtextL;
    EditText PtextR;


    Button btnlogin;
    Button btnEfind;
    Button btnPfind;
    Button btnMake;
    Button btneasyM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p2_activity_login);


        logoimage  = findViewById(R.id.logoImage);
        EtextL = findViewById(R.id.Eidl);
        EtextR = findViewById(R.id.Eidr);
        PtextL = findViewById(R.id.pwdl);
        PtextR = findViewById(R.id.pwdr);


        btnlogin = findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomain = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(gomain);
            }
        });
        btnEfind = findViewById(R.id.btnEfind);
        btnPfind = findViewById(R.id.btnPfind);
        btnMake  = findViewById(R.id.btnMake);
        btnMake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gomakeuser = new Intent(getApplicationContext(),p3_makeuser.class);
                startActivity(gomakeuser);
            }
        });
        btneasyM = findViewById(R.id.btnkakao);




    }
}
