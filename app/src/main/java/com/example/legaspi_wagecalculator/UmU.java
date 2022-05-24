package com.example.legaspi_wagecalculator;

public class UmU{
    public double getOvertime() {
        return Overtime;
    }

    public void setOvertime(double overtime) {
        Overtime = overtime;
    }

    public double getNormal() {
        return normal;
    }

    public void setNormal(double normal) {
        this.normal = normal;
    }

    public double getProbationary() {
        return probationary;
    }

    public void setProbationary(double probationary) {
        this.probationary = probationary;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getEmployee() {
        return Employee;
    }

    public void setEmployee(String employee) {
        Employee = employee;
    }

    public String getWorkerType() {
        return WorkerType;
    }

    public void setWorkerType(String workerType) {
        WorkerType = workerType;
    }

    public double getPartTime() {
        return PartTime;
    }

    public void setPartTime(double partTime) {
        PartTime = partTime;
    }
    private double Overtime, normal, probationary, total, PartTime;
    private String Employee,
            WorkerType = "";

}
