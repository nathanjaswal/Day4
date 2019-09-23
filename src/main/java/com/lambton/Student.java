package com.lambton;

import java.time.LocalDate;
import java.util.Date;

public class Student extends Person {

    private String courseName;
    private int currentSemester;

    public Student(int id, String firstName, String lastName, LocalDate birthDate, String gender, String courseName, int currentSemester) {
        super(id, firstName, lastName, birthDate, gender);
        this.courseName = courseName;
        this.currentSemester = currentSemester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCurrentSemester() {
        return currentSemester;
    }

    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }


    @Override
    public void display() {
        System.out.println("ID: " + getId());
        System.out.println("First Name: " + getFirstName());
        System.out.println("Last Name: " + getLastName());
        System.out.println("Birth Date: " + getBirthDate());
        System.out.println("Gender: " + getGender());
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Current Semester: " + this.currentSemester);

    }
}
