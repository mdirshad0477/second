package com.example.via.second;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class dailer extends AppCompatActivity implements View.OnClickListener {
    EditText editText;
    Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnstar,btn0,btnhash,btnbackspace,btnclear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dailer);
        btnone.setSoundEffectsEnabled(true);
        btntwo.setSoundEffectsEnabled(true);
        btnthree.setSoundEffectsEnabled(true);
        btnfour.setSoundEffectsEnabled(true);
        btnfive.setSoundEffectsEnabled(true);
        btnsix.setSoundEffectsEnabled(true);
        btnseven.setSoundEffectsEnabled(true);
        btneight.setSoundEffectsEnabled(true);
        btnnine.setSoundEffectsEnabled(true);
        btnstar.setSoundEffectsEnabled(true);
        btn0.setSoundEffectsEnabled(true);
        btnhash.setSoundEffectsEnabled(true);
        btnbackspace.setSoundEffectsEnabled(true);
        btnclear.setSoundEffectsEnabled(true);


        editText= (EditText) findViewById(R.id.et);
        btnone=(Button) findViewById(R.id.btn1);
        btntwo=(Button) findViewById(R.id.btn2);
        btnthree=(Button) findViewById(R.id.btn3);
        btnfour=(Button) findViewById(R.id.btn4);
        btnfive=(Button) findViewById(R.id.btn5);
        btnsix=(Button) findViewById(R.id.btn6);
        btnseven=(Button) findViewById(R.id.btn7);
        btneight=(Button) findViewById(R.id.btn8);
        btnnine=(Button) findViewById(R.id.btn9);
        btnstar=(Button) findViewById(R.id.btnstr);
        btn0=(Button) findViewById(R.id.btnzero);
        btnhash=(Button) findViewById(R.id.btnhas);
        btnbackspace=(Button) findViewById( R.id.btnback);
        btnclear=(Button) findViewById(R.id.btnclr);

        btnone.setOnClickListener(this);
        btntwo.setOnClickListener(this);
        btnthree.setOnClickListener(this);
        btnfour.setOnClickListener(this);
        btnfive.setOnClickListener(this);
        btnsix.setOnClickListener(this);
        btnseven.setOnClickListener(this);
        btneight.setOnClickListener(this);
        btnnine.setOnClickListener(this);
        btnstar.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnhash.setOnClickListener(this);
        btnbackspace.setOnClickListener(this);
        btnclear.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn1:
                editText.setText(editText.getText().toString()+btnone.getText().toString());
                break;
            case R.id.btn2:
                editText.setText(editText.getText().toString()+btntwo.getText().toString());
                break;
            case  R.id.btn3:
                editText.setText(editText.getText().toString()+btnthree.getText().toString());
                break;
            case R.id.btn4:
                editText.setText(editText.getText().toString()+btnfour.getText().toString());
                break;
            case R.id.btn5:
                editText.setText(editText.getText().toString()+btnfive.getText().toString());
                break;
            case R.id.btn6:
                editText.setText(editText.getText().toString()+btnsix.getText().toString());
                break;
            case R.id.btn7:
                editText.setText(editText.getText().toString()+btnseven.getText().toString());
                break;
            case R.id.btn8:
                editText.setText(editText.getText().toString()+btneight.getText().toString());
                break;
            case R.id.btn9:
                editText.setText(editText.getText().toString()+btnnine.getText().toString());
                break;
            case R.id.btnstr:
                editText.setText(editText.getText().toString()+btnstar.getText().toString());
                break;
            case R.id.btnzero:
                editText.setText(editText.getText().toString()+btn0.getText().toString());
                break;
            case R.id.btnhas:
                editText.setText(editText.getText().toString()+btnhash.getText().toString());
                break;


            }

        }


    }


