package com.assign;

import java.util.Scanner;

class Student {
    // Public data member
    public String name;

    // Private data members
    private long id;
    private int marks;

    // Constructor to set default values
    public Student() {
        this.id = 211001000000L; // default id
        this.marks = 0; // default marks
    }

    // Setter method for id
    public void setId(long lastFourDigits) {
        // Using the last four digits entered by the user to construct the full id
        this.id = 211001000000L + lastFourDigits;
    }

    // Getter method for id
    public long getId() {
        return id;
    }

    // Setter method for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter method for marks
    public int getMarks() {
        return marks;
    }
}

public class SMain {
    public static void main(String[] args) {
        // Creating two Student objects
        Student student1 = new Student();
        Student student2 = new Student();

        // Taking input for student1
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter last four digits of ID for Student 1:");
        long lastFourDigits1 = scanner.nextLong();
        student1.setId(lastFourDigits1);

        System.out.println("Enter name for Student 1:");
        student1.name = scanner.next();

        System.out.println("Enter marks for Student 1:");
        int marks1 = scanner.nextInt();
        student1.setMarks(marks1);

        // Taking input for student2
        System.out.println("\nEnter last four digits of ID for Student 2:");
        long lastFourDigits2 = scanner.nextLong();
        student2.setId(lastFourDigits2);

        System.out.println("Enter name for Student 2:");
        student2.name = scanner.next();

        System.out.println("Enter marks for Student 2:");
        int marks2 = scanner.nextInt();
        student2.setMarks(marks2);

        // Displaying information for both students
        System.out.println("\nStudent 1 Details:");
        System.out.println("Name: " + student1.name);
        System.out.println("Full ID: " + student1.getId());
        System.out.println("Marks: " + student1.getMarks());

        System.out.println("\nStudent 2 Details:");
        System.out.println("Name: " + student2.name);
        System.out.println("Full ID: " + student2.getId());
        System.out.println("Marks: " + student2.getMarks());
    }
}

