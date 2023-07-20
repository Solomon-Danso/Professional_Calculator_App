package com.hydotgroup.hycalc23;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ed1;
    boolean startTheCalculator = true;
    String Operator = "+";
    String OldNumber = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = findViewById(R.id.theZero);
    }

    public void numberEvent(View view) {
        if(startTheCalculator){
            ed1.setText("");
        }
        startTheCalculator = false;
        String currentNumber = ed1.getText().toString();
        int Id = view.getId();
        if(Id==R.id.num1){
            currentNumber = currentNumber+"1";
        }
        else if (Id==R.id.num2) {
            currentNumber = currentNumber+"2";
        }
        else if (Id==R.id.num3) {
            currentNumber = currentNumber+"3";
        }
        else if (Id==R.id.num4) {
            currentNumber = currentNumber+"4";
        }
        else if (Id==R.id.num5) {
            currentNumber = currentNumber+"5";
        }
        else if (Id==R.id.num6) {
            currentNumber = currentNumber+"6";
        }
        else if (Id==R.id.num7) {
            currentNumber = currentNumber+"7";
        }
        else if (Id==R.id.num8) {
            currentNumber = currentNumber+"8";
        }
        else if (Id==R.id.num9) {
            currentNumber = currentNumber+"9";
        }
        else if (Id==R.id.num0) {
            currentNumber = currentNumber+"0";
        }
        else if (Id==R.id.dot) {
            currentNumber = currentNumber+".";
        }
        else if (Id==R.id.PlusMinus) {
            currentNumber = "-"+currentNumber;
        }
        ed1.setText(currentNumber);

    }

    public void ACEvent(View view) {
        ed1.setText("0");
        startTheCalculator = true;
    }


    public void operationEvent(View view) {
        startTheCalculator = true;
        OldNumber = ed1.getText().toString();
        int Id = view.getId();
        if(Id==R.id.divide){
            Operator = "/";
        }
        else if (Id==R.id.multiply) {
            Operator = "*";
        }
        else if (Id==R.id.subtract) {
            Operator = "-";
        }
        else if (Id==R.id.plus) {
            Operator = "+";
        }
    }

    public void equalEvent(View view) {
        String NewNumber = ed1.getText().toString();
        double result = 0.0;
        if(Operator=="+"){
            result = Double.parseDouble(OldNumber) + Double.parseDouble(NewNumber);
        }

        else if(Operator=="-"){
            result = Double.parseDouble(OldNumber) - Double.parseDouble(NewNumber);
        }

        else if(Operator=="*"){
            result = Double.parseDouble(OldNumber) * Double.parseDouble(NewNumber);
        }

        else if(Operator=="/"){

            if ( Double.parseDouble(NewNumber) == 0) {
                Toast.makeText(this, "You cannot divide by 0", Toast.LENGTH_LONG).show();
                ed1.setText("0");
            } else {
                result = Double.parseDouble(OldNumber) / Double.parseDouble(NewNumber);

            }

        }





        ed1.setText(result+"");
    }

    public void PlusMinus(View view) {
    }

    public void thePercent(View view) {
        double number = Double.parseDouble(ed1.getText().toString())/100;
        ed1.setText(number+"");
    }
}