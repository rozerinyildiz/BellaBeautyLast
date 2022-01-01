package com.example.bellabeauty.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bb.AddStepActivity;
import com.example.bb.R;

public class RoutinesFragment extends Fragment {

    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_routines, container, false);

        Button morning = (Button) view.findViewById(R.id.morning);
        Button night = (Button) view.findViewById(R.id.night);
        Button addStepBtn = (Button) view.findViewById(R.id.addStepBtn);

        morning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new MorningFragment());
            }
        });
        night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new NightFragment());
            }
        });

        addStepBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),AddStepActivity.class);
                startActivity(intent);
            }
        });
        return view;
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.routines_frameLayout,fragment);
        fragmentTransaction.commit();

    }
}