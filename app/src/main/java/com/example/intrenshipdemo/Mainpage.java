package com.example.intrenshipdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.intrenshipdemo.databinding.ActivityMainpageBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Mainpage extends AppCompatActivity  {


    ActivityMainpageBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainpageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        replacefragment(new home());
        binding.bottomnavview.setBackground(null);

        binding.bottomnavview.setOnItemSelectedListener(item -> {
            if (item.getItemId()==R.id.hm)
            {
                replacefragment(new home());
            }
            else if (item.getItemId()==R.id.his) {
                replacefragment(new History());
            }
            else if (item.getItemId()==R.id.fav){
                replacefragment(new Favourites());
            }
            else if (item.getItemId()==R.id.prof) {
                replacefragment(new Profile());
            }
            else if (item.getItemId()==R.id.cart) {
                replacefragment(new Cart());
            }
        return true;



        });

    }

    private void replacefragment(Fragment fragment) {
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}