package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public abstract class Person {
    // Constructor is special function when the object of class is created.(default,
    // constructor = init
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;

    public Person(int id) {
        this.id = id;
    }

    public Person(int id, String firstName, String lastName, LocalDate birthDate, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {

    }

    public abstract void display();
}
