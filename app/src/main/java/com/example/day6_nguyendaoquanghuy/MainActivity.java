package com.example.day6_nguyendaoquanghuy;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.day6_nguyendaoquanghuy.databinding.ActivityMainBinding;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainMVP.View{

    ActivityMainBinding binding;

    MainMVP.Presenter presenter;

    /*ImageButton btnMenu;
    TextView tvEditHour,tvEditDay;
    TextView tvEditTag,tvEditWeek;
    Button btTune;
    Spinner spinner;*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
     //   setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);

        presenter = new MainPresenter(this);

     /*   btnMenu=findViewById(R.id.btnMenu);
        tvEditHour=findViewById(R.id.tvEditHour);
        tvEditDay=findViewById(R.id.tvEditDay);
        tvEditTag=findViewById(R.id.tvEditTag);
        tvEditWeek=findViewById(R.id.tvEditWeek);
        btTune=findViewById(R.id.btTune);
        spinner=findViewById(R.id.spinner);  */

        ArrayList<String> arrayType = new ArrayList<String>();
        arrayType.add("Work");
        arrayType.add("Friend");
        arrayType.add("Family");
        arrayType.add("BestFriend");

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,arrayType);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        binding.spinner.setAdapter(arrayAdapter);


        binding.btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PopupMenu popupMenu = new PopupMenu(getBaseContext(),v);
                MenuInflater menuInflater = popupMenu.getMenuInflater();
                menuInflater.inflate(R.menu.menu_main,popupMenu.getMenu());
                popupMenu.show();
            }
        });

        binding.tvEditHour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(FragmentEdithour.newInstance());
            }
        });

        binding.tvEditDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment(FragmentEditDay.newInstance());
            }
        });

        binding.btTune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getFragment2(FragmenttUNE.newInstance());
            }
        });




 /*       binding.tvEditTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] strings = {"Game","Android","Kotlin","AOC","Garena"};
                boolean[] booleans ={false,true,false,true,false};

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Chọn loại bạn muốn")
                        .setMultiChoiceItems(strings, booleans, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .create();
                alertDialog.show();
            }
        });             */

        binding.tvEditTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.clickEditTextEditTag();
            }
        });



 /*       binding.tvEditWeek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String[] strings = {"Monday","Tuesday","Wendnesday","Thursday","Friday","Saturday","Sunday"};
                boolean[] booleans ={false,true,false,true,false,true,false};

                AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Chọn ngày bạn muốn")
                        .setMultiChoiceItems(strings, booleans, new DialogInterface.OnMultiChoiceClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                            }
                        })
                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                                startActivity(intent);
                            }
                        })
                        .create();
                alertDialog.show();
            }
        });       */

     binding.tvEditWeek.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             presenter.clickEditTextEditWeek();
         }
     });




    }

    private void getFragment(Fragment fragment){
         getSupportFragmentManager().beginTransaction()
                 .replace(R.id.fragmentMain,fragment)
                 .commit();
    }

    private void getFragment2(Fragment fragment){
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment2,fragment)
                .commit();
    }

    @Override
    public void showMain() {

    }

    @Override
    public void showEditTag() {
        String[] strings = {"Game","Android","Kotlin","AOC","Garena"};
        boolean[] booleans ={false,true,false,true,false};

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Chọn loại bạn muốn")
                .setMultiChoiceItems(strings, booleans, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getBaseContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getBaseContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .create();
        alertDialog.show();
    }

    @Override
    public void showEditWeek() {
        String[] strings = {"Monday","Tuesday","Wendnesday","Thursday","Friday","Saturday","Sunday"};
        boolean[] booleans ={false,true,false,true,false,true,false};

        AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this)
                .setTitle("Chọn ngày bạn muốn")
                .setMultiChoiceItems(strings, booleans, new DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                    }
                })
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getBaseContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(getBaseContext(),MainActivity.class);
                        startActivity(intent);
                    }
                })
                .create();
        alertDialog.show();
    }
}