package com.example.bellabeauty.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bb.R;

public class AddStepHomeFragment extends Fragment {



    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_add_step_home, container, false);

        Button btnCleanser = (Button)view.findViewById(R.id.cleanser);
        Button btnMoisturizer = (Button)view.findViewById(R.id.moisturizer);
        Button btnSunProtection = (Button)view.findViewById(R.id.sunProtection);
        

        btnCleanser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.addStepHome_frameLayout, new CleanserFragment());
                fr.commit();
            }
        });
        btnMoisturizer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.addStepHome_frameLayout, new MoisturizerFragment());
                fr.commit();
            }
        });
        btnSunProtection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.addStepHome_frameLayout, new SunProtectionFragment());
                fr.commit();
            }
        });

        return view;
    }

}