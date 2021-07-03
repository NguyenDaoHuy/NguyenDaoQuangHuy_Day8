package com.example.day6_nguyendaoquanghuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.day6_nguyendaoquanghuy.databinding.EditHourBinding;

public class FragmentEdithour extends Fragment {

//    Button btEditHourOK,btEditHourCancel;
    EditHourBinding binding;

    public static FragmentEdithour newInstance() {

        Bundle args = new Bundle();

        FragmentEdithour fragment = new FragmentEdithour();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.edit_hour,container,false);

        View view = binding.getRoot();

    //    btEditHourCancel=view.findViewById(R.id.btEditHourCancel);
    //    btEditHourOK=view.findViewById(R.id.btEditHourOK);

        binding.btEditHourOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        binding.btEditHourCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
