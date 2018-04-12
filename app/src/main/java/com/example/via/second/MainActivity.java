package com.example.via.second;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.BackgroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout LL1,LL2;
    Button btn, btnlogin ,btndail;
    String a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LL1 = (LinearLayout) findViewById(R.id.idLL1);
        LL2 = (LinearLayout) findViewById(R.id.idLL2);
        btn = (Button) findViewById(R.id.TOGLE);
        btnlogin = (Button) findViewById(R.id.btnGoIntent);
        btndail=(Button) findViewById(R.id.btndail);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);

            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(MainActivity.this, Intent_Activity.class);
                i2.putExtra("Name", "Irsaad");
                startActivity(i2);


            }
        });
        btndail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i3 = new Intent(MainActivity.this, dailer.class);
                i3.putExtra("name", "md irshad");
                startActivity(i3);
            }
        });
    }

    }

