package com.example.day6_nguyendaoquanghuy;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.day6_nguyendaoquanghuy.databinding.EditDayBinding;

public class FragmentEditDay extends Fragment{

//    Button btEditHDayOK,btEditDayCancel;

    EditDayBinding binding;

    public static FragmentEditDay newInstance() {

        Bundle args = new Bundle();

        FragmentEditDay fragment = new FragmentEditDay();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding= DataBindingUtil.inflate(inflater,R.layout.edit_day,container,false);
        View view = binding.getRoot();

    //    btEditDayCancel=view.findViewById(R.id.btEditDayCancel);
    //    btEditHDayOK=view.findViewById(R.id.btEditDayOK);

        binding.btEditDayOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        binding.btEditDayCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
