Chapter 5 
- The switch in the View interface will give an error, change it to an if else statement 
- protected void onCreate(Bundle savedInstanceState) this will be where all the ui element will be initialised
- In the right way, we will initialised the variables first then use it like the example below


<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity"
android:padding="10dp"
>
<EditText
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:hint="Enter Your Details"
android:layout_centerHorizontal="true"
android:layout_centerVertical="true"
android:id="@+id/edit1"
/>

<Button
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="Submit"
android:id="@+id/Clicker"
android:layout_below="@+id/edit1"
android:layout_marginTop="10dp"
android:layout_centerHorizontal="true"
android:background="@color/black"
android:textColor="@color/white"
android:textSize="20sp"


    />

    <TextView
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@+id/Clicker"
        android:textColor="@color/red"
        android:text="The Text"
        android:textAlignment="center"
        android:layout_marginTop="10dp"
        android:id="@+id/txt1"


        />

</RelativeLayout>

package com.hydotgroup.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//Declaration Location
public TextView text1;
public EditText edit1;
public Button btn1;

// Usage Location
@Override
public void onClick(View v) {
int id = v.getId();
if(id==R.id.Clicker){
text1.setText(edit1.getText());
Toast.makeText(this, "You have Clicked Me", Toast.LENGTH_SHORT).show();
}
}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate Location

        text1 = findViewById(R.id.txt1);
        text1.setOnClickListener(this);

        edit1 = findViewById(R.id.edit1);
        edit1.setOnClickListener(this);

        btn1 = findViewById(R.id.Clicker);
        btn1.setOnClickListener(this);



    }




}
