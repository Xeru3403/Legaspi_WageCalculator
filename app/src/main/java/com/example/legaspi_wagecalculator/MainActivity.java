package com.example.legaspi_wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText employee,hourinfo;
    Button FullTime,PartTime,Probationary,Calculate;
    TextView typeofemployee;
    UmU Fuu = new UmU();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FullTime = findViewById(R.id.FullTime);
        Probationary = findViewById(R.id.Probationary);
        PartTime = findViewById(R.id.PartTime);
        Calculate = findViewById(R.id.Calculate);
        employee = findViewById(R.id.employeeinfo);
        hourinfo = findViewById(R.id.hourinfo);
        typeofemployee = findViewById(R.id.choose);


        FullTime.setOnClickListener(this);
        Probationary.setOnClickListener(this);
        PartTime.setOnClickListener(this);
        Calculate.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.FullTime:
                Fuu.setWorkerType("Regular");
                typeofemployee.setText("Employee type: Regular");
                break;
            case R.id.Probationary:
                Fuu.setWorkerType("Probationary");
                typeofemployee.setText("Employee type: Probationary");
                break;
            case R.id.PartTime:
                Fuu.setWorkerType("Part time");
                typeofemployee.setText("Employee type: Part-time");
                break;
            case R.id.Calculate:
                if (Fuu.getWorkerType() == "") {
                } else {
                    Fuu.setEmployee(String.valueOf(typeofemployee.getText()));
                    Fuu.setPartTime(Double.parseDouble(hourinfo.getText().toString()));


                    Intent intent = new Intent(this, reporter.class);
                    intent.putExtra("Name", Fuu.getEmployee());
                    intent.putExtra("Type", Fuu.getWorkerType());
                    intent.putExtra("Hours", Fuu.getPartTime());
                    startActivity(intent);
                }
                break;
        }
    }
    }
