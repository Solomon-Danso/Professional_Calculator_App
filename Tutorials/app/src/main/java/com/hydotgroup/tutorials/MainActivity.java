package com.hydotgroup.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.btn1);


    }
    public void clickMe(View v){
        Toast.makeText(this, "I have clicked on the button", Toast.LENGTH_LONG).show();
        EditText editText = findViewById(R.id.edit1);


        TextView txt = findViewById(R.id.txt1);
        txt.setText("Name: "+editText.getText().toString());


           }

}