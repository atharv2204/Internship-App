package com.example.intrenshipdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class activity_login extends AppCompatActivity {


    private EditText mail,password;
    private RelativeLayout logbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mail=findViewById(R.id.mail);
        password=findViewById(R.id.pass);

        logbtn=findViewById(R.id.login);

        logbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mail.getText().toString().equals("admin") && password.getText().toString().equals("admin123") ){

                    startActivity(new Intent(activity_login.this, adminHome.class));
                    //Admin activity
                }

                else if (mail.getText().toString().equals("User") && password.getText().toString().equals("User123")){

                    //Customer
                    startActivity(new Intent(activity_login.this, Mainpage.class));

                }  else if (mail.getText().toString().equals("Delivery")&& password.getText().toString().equals("Delivery123")){

                    startActivity(new Intent(activity_login.this,Delivery_partner.class));

                    //Delivery Boy
                }

                else
                {
                    Toast.makeText(activity_login.this,"Error Occured",Toast.LENGTH_SHORT);
                }
            }
        });


    }
}