package com.example.intrenshipdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class adminHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home);
    }

    public void ord_req(View view) {
        Intent intent = new Intent(adminHome.this,orders.class);
        startActivity(intent);
    }

    public void live_ord(View view) {
        Intent intent = new Intent(adminHome.this,activity_current.class);
        startActivity(intent);
    }

    public void admin_his(View view) {
        Intent intent = new Intent(adminHome.this,activity_order_historyadmin.class);
        startActivity(intent);
    }

    public void addProduct(View view) {
        Intent intent = new Intent(adminHome.this,Admin_addProducts.class);
        startActivity(intent);
    }
}