package com.amanjh;
class Employee {
    private int emp_code;
    private String name;
    private String designation;
    private double salary;

    // Default constructor
    public Employee() {
        this.emp_code = 0;
        this.name = "";
        this.designation = "";
        this.salary = 0;
    }

    // Constructor with emp_code, name, and designation
    public Employee(int emp_code, String name, String designation) {
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;
        setSalaryBasedOnDesignation();
    }

    // Constructor with emp_code, name, designation, and salary
    public Employee(int emp_code, String name, String designation, double salary) {
        this.emp_code = emp_code;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Private method to set salary based on designation
    private void setSalaryBasedOnDesignation() {
        switch (designation.toLowerCase()) {
            case "clerk":
                this.salary = 5000;
                break;
            case "peon":
                this.salary = 2000;
                break;
            case "manager":
                this.salary = 10000;
                break;
            default:
                this.salary = 1000;
        }
    }

    // Display method to print employee information
    public void display() {
        System.out.println("Employee Code: " + emp_code);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: Rs. " + salary);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        // Using default constructor
        Employee emp1 = new Employee();
        System.out.println("Employee 1 Information:");
        emp1.display();

        // Using constructor with emp_code, name, and designation
        Employee emp2 = new Employee(101, "John Doe", "Clerk");
        System.out.println("Employee 2 Information:");
        emp2.display();

        // Using constructor with emp_code, name, designation, and salary
        Employee emp3 = new Employee(102, "Jane Smith", "Manager", 12000);
        System.out.println("Employee 3 Information:");
        emp3.display();
    }
}

