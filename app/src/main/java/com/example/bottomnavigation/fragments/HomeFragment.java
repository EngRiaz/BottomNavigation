package com.example.bottomnavigation.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.bottomnavigation.MainActivity2;
import com.example.bottomnavigation.R;

public class HomeFragment extends Fragment {
    Context context;

    TextView txtName,txtNext;


    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        txtName = view.findViewById(R.id.txt_name);
        txtNext=view.findViewById(R.id.txt_next);

   txtName.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(getActivity(), MainActivity2.class);
            startActivity(intent);
        }
    });
        return view;
}
}