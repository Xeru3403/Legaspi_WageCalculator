package com.example.legaspi_wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class reporter extends AppCompatActivity {
    TextView TotalWage, RegularWage, HoursRendered;
    UwU Fuu=new UwU();
    UmU Fuu1=new UmU();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporter);

        Intent intent = getIntent();
        Fuu1.setEmployee(intent.getStringExtra("Name"));
        Fuu1.setEmployee(intent.getStringExtra("Type"));
        Fuu1.setPartTime(intent.getDoubleExtra("Hours", Fuu1.getPartTime()));



        RegularWage = findViewById(R.id.RegularWage);
        HoursRendered = findViewById(R.id.HoursRendered);
        TotalWage = findViewById(R.id.TotalWage);


        double part = Fuu.solveWC(Fuu1.getPartTime());
        double regular = Fuu.solveReg(Fuu1.getEmployee(), Fuu1.getPartTime(), part);
        double overtime = Fuu.solveTime(Fuu1.getEmployee(), part);
        double all = Fuu.solveTotal(part, overtime);


        HoursRendered.setText("Hours rendered: " + Fuu1.getPartTime());
        RegularWage.setText("Regular Wage: " + regular);
        TotalWage.setText(String.valueOf(all));
    }
    }
