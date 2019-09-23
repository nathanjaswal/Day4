package com.lambton;

import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class MainExample {
    public static void main(String[] args) {
        Person p1;
        Student s1 = new Student(1,
                                 "Nitin",
                                 "Jaswal",
                                  LocalDate.now(),
                                 "Male",
                                 "MADT",
                                 1);
        p1 = s1;
        p1.display();

        Faculty f1 = new Faculty(1,
                "Nitin",
                "Jaswal",
                LocalDate.now(),
                "Male",
                "Professor",
                (float)100.00, "Comp");

        p1 = f1;
        p1.display();

    }
}
