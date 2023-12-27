package com.example.intrenshipdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delivery_partner extends AppCompatActivity {


    private Button locate,locate1,locate2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_partner);

        locate=findViewById(R.id.locate);
        locate1=findViewById(R.id.locate1);
        locate2=findViewById(R.id.locate2);

        locate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Delivery_partner.this, Deliverymap.class));
            }
        });
        locate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Delivery_partner.this, Deliverymap.class));
            }
        });
        locate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Delivery_partner.this, Deliverymap.class));
            }
        });
    }
}