package com.hydotgroup.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Forms(View view) {
        EditText ed1 = findViewById(R.id.editTextText5);
        EditText ed2 = findViewById(R.id.editTextText6);
        EditText ed3 = findViewById(R.id.editTextText7);

        TextView txt1 = findViewById(R.id.textView6);
        TextView txt2 = findViewById(R.id.textView7);
        TextView txt3 = findViewById(R.id.textView8);

        txt1.setText("First name: "+ed1.getText().toString());
        txt2.setText("Last name: "+ed2.getText().toString());
        txt3.setText("Email: "+ed3.getText().toString());

    }
}