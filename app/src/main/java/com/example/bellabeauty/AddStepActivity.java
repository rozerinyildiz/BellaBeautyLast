package com.example.bellabeauty;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.example.bellabeauty.Fragments.AddStepHomeFragment;

public class AddStepActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_step);

        getSupportFragmentManager().beginTransaction().replace(R.id.addStep_frameLayout,new AddStepHomeFragment()).commit();


    }





}