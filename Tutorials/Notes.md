# Chapter 1
Create Your First App 
- Choose an empty activity 
- The application name must be unique for every app 
- Define the path to save your project 
- In the project section in android studio, select android view to easily see the files and folders 
- AndroidManifest.xml defines the general settings for your app
- The resource (res) folder stores all the static files like images and the rest 
- Gradle is a build tool to handle all the combination of every file. we use gradle to integrate third party tools and also build final apks 
- The profiler tool displays the memory our application is consuming 
- The logcat tool displays all the logs in our application
- The build tool displays all the build information
- An activity can be defined as a page to some extent 
Layout 
- Without constraint, the application will be floating 
- Every UI element must have an ID which must be unique because we are going to use that in the MainActivity.java file

# Chapter 2
- Every ui has their equivalent class
  TextView txt = findViewById(R.id.textView);
  txt.setText("Solomon");
- R stands for resources 
- setText changes the default text to a different one
  <Button
  android:id="@+id/myFirstButton"
  android:layout_width="wrap_content"
  android:layout_height="wrap_content"
  android:text="Button"
  app:layout_constraintBottom_toBottomOf="parent"
  app:layout_constraintEnd_toEndOf="parent"
  app:layout_constraintHorizontal_bias="0.712"
  app:layout_constraintStart_toStartOf="parent"
  app:layout_constraintTop_toBottomOf="@+id/textView"
  app:layout_constraintVertical_bias="0.503"
  android:onClick="btnClick"/>
- The onClick will run the btnClick class defined in the java file

Challenge 1
* activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
xmlns:app="http://schemas.android.com/apk/res-auto"
xmlns:tools="http://schemas.android.com/tools"
android:layout_width="match_parent"
android:layout_height="match_parent"
tools:context=".MainActivity">


    <EditText
        android:id="@+id/editTextText5"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="First Name"
        android:inputType="text"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.442"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.087" />

    <EditText
        android:id="@+id/editTextText6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="Last Name"
        android:inputType="text"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.442"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextText5"
        app:layout_constraintVertical_bias="0.081" />

    <EditText
        android:id="@+id/editTextText7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:ems="10"
        android:hint="user@company.com"
        android:inputType="text"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.442"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextText6"
        app:layout_constraintVertical_bias="0.091" />

    <TextView
        android:id="@+id/textView6"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="First name: "
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.439"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/editTextText7"
        app:layout_constraintVertical_bias="0.091" />

    <TextView
        android:id="@+id/textView7"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Last name: "
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.439"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView6"
        app:layout_constraintVertical_bias="0.097" />

    <TextView
        android:id="@+id/textView8"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Email: "
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.439"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView7"
        app:layout_constraintVertical_bias="0.137" />

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Register"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.746"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toBottomOf="@+id/textView8"
        app:layout_constraintVertical_bias="0.465"
        android:onClick="Forms"
        />

</androidx.constraintlayout.widget.ConstraintLayout>

* MainActivity.java
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