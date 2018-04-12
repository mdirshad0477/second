package com.example.via.second;

import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.security.Provider;
import java.util.jar.Attributes;

public class Intent_Activity extends AppCompatActivity implements View.OnClickListener{
   Button bmail,bcall,bmessage,bgooglebrowse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_);
        bmail=(Button) findViewById(R.id.btnMail);
        bcall=(Button) findViewById(R.id.btnCall);
        bmessage=(Button) findViewById(R.id.btnMsg);
        bgooglebrowse=(Button) findViewById(R.id.btnGoogle);
        bmail.setOnClickListener(this);
        bcall.setOnClickListener(this);
        bmessage.setOnClickListener(this);
        bgooglebrowse.setOnClickListener(this);

          Intent intent=getIntent();
          String str=intent.getStringExtra("Name");
          Toast.makeText(this,str,Toast.LENGTH_LONG).show();


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btnMail:
                Intent intent= new Intent(Intent.ACTION_SENDTO);
                intent.setData(Uri.parse("mailTo"));
                intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"mdirshad0477@gmail.com"});
                intent.putExtra(intent.EXTRA_SUBJECT, "andriod demo");
                startActivity(Intent.createChooser(intent,"Email via"));
                break;
            case  R.id.btnCall:
                String phone="8521661109";
                Intent intent1=new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel",phone,null));
                startActivity(intent1);
                break;
            case  R.id.btnMsg:
                String number= "8861559686";
                Intent i2=new Intent(Intent.ACTION_VIEW,Uri.fromParts( "sms", "8521661109",null ));
                startActivity(i2);
                break;
            case R.id.btnGoogle:
                String url ="http://www.google.com";
                Intent i3=new Intent(Intent.ACTION_VIEW);
                startActivity(i3);
                break;

        }

        Toast.makeText(this, "",Toast.LENGTH_LONG).show();
    }
}
