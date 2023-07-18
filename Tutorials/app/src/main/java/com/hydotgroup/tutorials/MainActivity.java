package com.hydotgroup.tutorials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //Declaration Location
   private ListView CitiesList;
   private Spinner studentSpinner, staticStudentSpinnerr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        studentSpinner = findViewById(R.id.studentSpiinner);

     ArrayList<String> student = new ArrayList<>();
     student.add("Solomon");
     student.add("Sheila");
     student.add("Anabel");

     ArrayAdapter<String> studentAdapter = new ArrayAdapter<>(
             this,
             android.R.layout.simple_spinner_dropdown_item,
             student
     );
     studentSpinner.setAdapter(studentAdapter);
        studentSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Hello "+student.get(position), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




        staticStudentSpinnerr = findViewById(R.id.studentSpin);
     staticStudentSpinnerr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
         @Override
         public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
             Toast.makeText(MainActivity.this, staticStudentSpinnerr.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
         }

         @Override
         public void onNothingSelected(AdapterView<?> parent) {

         }
     });



        CitiesList = findViewById(R.id.CitiesList);

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Accra");
        cities.add("Kumasi");
        cities.add("Kasoa");
        cities.add("Koforiidua");

      ArrayAdapter<String> cityAdapter = new ArrayAdapter<>(
              this,
              android.R.layout.simple_list_item_1,
              cities
      );

      CitiesList.setAdapter(cityAdapter);


      CitiesList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              Toast.makeText(MainActivity.this, cities.get(position)+" Selected", Toast.LENGTH_SHORT).show();
          }
      });






    }




}
