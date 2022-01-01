package com.example.bellabeauty.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bb.R;

public class ProductsFragment extends Fragment {
    View view;

    ImageButton btn1;
    ImageButton btn2;
    ImageButton btn3;
    Button ingredients;
    Button comments;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_products, container, false);
        btn1 = (ImageButton) view.findViewById(R.id.btn1);
        btn2 = (ImageButton) view.findViewById(R.id.btn2);
        btn3 = (ImageButton) view.findViewById(R.id.btn3);
        ingredients = view.findViewById(R.id.ingredients);
        comments = view.findViewById(R.id.comments);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setVisibility(View.GONE);
                btn3.setVisibility(View.GONE);
                replaceFragment(new Btn1Fragment());
                ingredients.setVisibility(View.VISIBLE);
                comments.setVisibility(View.VISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setVisibility(View.GONE);
                btn3.setVisibility(View.GONE);
                replaceFragment(new Btn1Fragment());
                ingredients.setVisibility(View.VISIBLE);
                comments.setVisibility(View.VISIBLE);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn2.setVisibility(View.GONE);
                btn1.setVisibility(View.GONE);
                replaceFragment(new Btn1Fragment());
                ingredients.setVisibility(View.VISIBLE);
                comments.setVisibility(View.VISIBLE);
            }
        });

        ingredients.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new IngredientsFragment());
            }
        });comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                replaceFragment(new CommentFragment());
            }
        });

        return view;
    }

    private void replaceFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.products_frameLayout,fragment);
        fragmentTransaction.commit();

    }
}