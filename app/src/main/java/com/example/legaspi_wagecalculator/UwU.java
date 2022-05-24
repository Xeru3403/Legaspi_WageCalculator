package com.example.legaspi_wagecalculator;

public class UwU {public double solveWC(double Greater){
    double WorkProgress;
    if (Greater > 40) {
        WorkProgress = Greater - 40;
    } else {
        WorkProgress = 0;
    }
    return WorkProgress;
}

    public double solveReg(String WorkerType, double Greater, double WorkProgress){
        double FullTime;
        if (WorkerType.equals("FullTime")){
            FullTime = (Greater - WorkProgress) * 120;
        } else if (WorkerType.equals("Probationary")){
            FullTime = (Greater - WorkProgress) * 80;
        } else {
            FullTime = (Greater - WorkProgress) * 60;
        }
        return FullTime;
    }

    public double solveTime(String WorkerType, double WorkProgress){
        double Greater;
        if (WorkerType.equals("Regular")){
            Greater = WorkProgress * 180;
        } else if (WorkerType.equals("Probationary")){
            Greater = WorkProgress * 140;
        } else {
            Greater = WorkProgress * 110;
        }
        return Greater;
    }

    public double solveTotal(double NormalWage, double Greater){
        return NormalWage + Greater;
    }
}
