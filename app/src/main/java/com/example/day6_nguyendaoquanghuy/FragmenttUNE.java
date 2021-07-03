package com.example.day6_nguyendaoquanghuy;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.day6_nguyendaoquanghuy.databinding.EditTuneBinding;

public class FragmenttUNE extends Fragment implements TunePresenter.View{
    EditTuneBinding binding;

    TunePresenter.Presenter presenter;

    //    Button btFromFile,btFromDefaults;

    public static FragmenttUNE newInstance() {

        Bundle args = new Bundle();

        FragmenttUNE fragment = new FragmenttUNE();
        fragment.setArguments(args);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        binding = DataBindingUtil.inflate(inflater,R.layout.edit_tune,container,false);

        View view = binding.getRoot();

        presenter = new PresenterTune(this);


 /*       btFromFile=view.findViewById(R.id.btFromFile);
        btFromDefaults=view.findViewById(R.id.btFromDefaults); */

    /*    binding.btFromFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[]strings = {"JPG","PND","CR2","CR3","ABC"};

                AlertDialog alertDialog=new AlertDialog.Builder(getContext())
                        .setTitle("Chọn 1 loại file ảnh ")
                        .setSingleChoiceItems(strings, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(),strings[which],Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cencal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .create();
                alertDialog.show();
            }
        });        */

        binding.btFromFile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickFromFile();
            }
        });

  /*      binding.btFromDefaults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[]strings = {"SamSungTune","NokiaTune","CucGachTune","NexusTune","PeepTune"};

                AlertDialog alertDialog=new AlertDialog.Builder(getContext())
                        .setTitle("Chọn 1 loại ")
                        .setSingleChoiceItems(strings, 0, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getContext(),strings[which],Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cencal", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .create();
                alertDialog.show();
            }
        });     */

        binding.btFromDefaults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickFromDefaults();
            }
        });


        return view;
    }

    @Override
    public void showFromFile() {
        String[]strings = {"JPG","PND","CR2","CR3","ABC"};

        AlertDialog alertDialog=new AlertDialog.Builder(getContext())
                .setTitle("Chọn 1 loại file ảnh ")
                .setSingleChoiceItems(strings, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),strings[which],Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cencal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .create();
        alertDialog.show();
    }

    @Override
    public void showFromDefaults() {
        String[]strings = {"SamSungTune","NokiaTune","CucGachTune","NexusTune","PeepTune"};

        AlertDialog alertDialog=new AlertDialog.Builder(getContext())
                .setTitle("Chọn 1 loại ")
                .setSingleChoiceItems(strings, 0, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(),strings[which],Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cencal", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .create();
        alertDialog.show();
    }
}
