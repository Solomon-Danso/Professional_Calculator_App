package com.hydotgroup.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    //Declaration Location
private CheckBox Harry,Sweety,Baby;
private RadioGroup maritalStatus;
private RadioGroup rdgrp;
private ProgressBar progressBar,progressBar2;

    @Override
    public void onClick(View v) {
        int id  = v.getId();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Harry = findViewById(R.id.Harry);
        Baby = findViewById(R.id.Baby);
        Sweety = findViewById(R.id.Sweety);
        rdgrp = findViewById(R.id.rdGroup);
        progressBar = findViewById(R.id.progBar);
        progressBar2 = findViewById(R.id.progBar2);

        Thread thread = new Thread(new Runnable(){
            @Override
            public void run(){
               for(int i=0; i<10; i++ ){
                   progressBar2.incrementProgressBy(10);
                   SystemClock.sleep(500);

               }
            }
        });
        thread.start();





        //Check to see the default radio button checked

        int checkedId = rdgrp.getCheckedRadioButtonId();
        if(checkedId==R.id.rbMarried){
            Toast.makeText(MainActivity.this, "Aware ye de", Toast.LENGTH_SHORT).show();
        } else if (checkedId==R.id.rbSingle) {
            Toast.makeText(MainActivity.this, "Loneliness will finish you kwata kwata", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this, "Mo na mo bre", Toast.LENGTH_SHORT).show();
        }


        //Based on what the user clicks, perform this action
        rdgrp.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbMarried){
                    Toast.makeText(MainActivity.this, "Aware ye de", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                } else if (checkedId==R.id.rbSingle) {
                    Toast.makeText(MainActivity.this, "Loneliness will finish you kwata kwata", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    Toast.makeText(MainActivity.this, "Mo na mo bre", Toast.LENGTH_SHORT).show();
                }
            }
        });


        if(Harry.isChecked()){
            Toast.makeText(this, "Greetings Harry", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Oh Harry", Toast.LENGTH_SHORT).show();
        }
        Harry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
              if(isChecked){
                  Toast.makeText(MainActivity.this, "Hello Harry", Toast.LENGTH_SHORT).show();
              }
              else{
                  Toast.makeText(MainActivity.this, "Bye Harry", Toast.LENGTH_SHORT).show();
              }
            }
        });





    }




}
