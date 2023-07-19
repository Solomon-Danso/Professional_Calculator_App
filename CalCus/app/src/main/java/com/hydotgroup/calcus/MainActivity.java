package com.hydotgroup.calcus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText ed1;
    String op = "+";
   String oldNumber = "";
    boolean isNewOp = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.theZero);
    }

    public void nummberEvent(View view) {
        if (isNewOp){
            ed1.setText("");
        }
        isNewOp = false;
        String number = ed1.getText().toString();
        int id = view.getId();
        if (id==R.id.bu7){
            number+= "7";
        }
        else if(id==R.id.bu8){
            number+= "8";
        }
        else if(id==R.id.bu9){
            number+= "9";
        }
        else if(id==R.id.bu4){
            number+= "4";
        }
        else if(id==R.id.bu5){
            number+= "5";
        }
        else if(id==R.id.bu6){
            number+= "6";
        }
        else if(id==R.id.bu1){
            number+= "1";
        }
        else if(id==R.id.bu2){
            number+= "2";
        }
        else if(id==R.id.bu3){
            number+= "3";
        }
        else if(id==R.id.bu0){
            number+= "0";
        }
        else if (id==R.id.budot) {
            number+= ".";
        }
        else if (id==R.id.PlusMinus) {
            number = "-"+number;
        }


        ed1.setText(number);
    }

    public void operatorEvent(View view) {
        isNewOp = true;
        oldNumber = ed1.getText().toString();
        int id = view.getId();
        if(id==R.id.buPlus){
            op = "+";
        }
        else if(id==R.id.Divide){
            op = "/";
        }
        else if(id==R.id.Multiply){
            op = "*";
        }
        else if(id==R.id.buMinus){
            op = "-";
        }
    }


    public void equalEvent(View view) {
        String newNumber = ed1.getText().toString();
        double result = 0.0;
        if(op =="+"){
            result = Double.parseDouble( oldNumber) + Double.parseDouble(newNumber);
        }
       else if(op =="-"){
            result = Double.parseDouble( oldNumber) - Double.parseDouble(newNumber);
        }

        else if(op =="*"){
            result = Double.parseDouble( oldNumber) * Double.parseDouble(newNumber);
        }

        else if(op =="/"){
            result = Double.parseDouble( oldNumber) / Double.parseDouble(newNumber);
        }

        ed1.setText(result+" ");

    }

    public void acEvent(View view) {
        ed1.setText("0");
        isNewOp = true;
    }

    public void percentEvent(View view) {
        double number = Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(number+"");
        isNewOp = true;
    }
}