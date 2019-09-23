package com.lambton;

import java.time.LocalDate;

public class Faculty extends Person {

    private String designation;
    private float salary;
    private String specialization;

    public Faculty(int id, String firstName, String lastName, LocalDate birthDate, String gender, String designation, float salary, String specialization) {
        super(id, firstName, lastName, birthDate, gender);

        this.designation = designation;
        this.salary = salary;
        this.specialization = specialization;
    }


    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void display() {
        System.out.println("designation: " + getDesignation());
        System.out.println("First Name: " + getSalary());
        System.out.println("Last Name: " + getSpecialization());

    }
}
