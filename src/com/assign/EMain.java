package com.assign;

class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Employee extends Member {
    String specialization;
}

class Manager extends Member {
    String department;
}

public class EMain {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee();
        employee.name = "John Doe";
        employee.age = 30;
        employee.phoneNumber = "123-456-7890";
        employee.address = "456 Main Street";
        employee.salary = 50000.0;
        employee.specialization = "Software Development";

        // Displaying Employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);
        employee.printSalary();
        System.out.println();

        // Creating a Manager object
        Manager manager = new Manager();
        manager.name = "Jane Smith";
        manager.age = 35;
        manager.phoneNumber = "987-654-3210";
        manager.address = "789 Oak Street";
        manager.salary = 80000.0;
        manager.department = "Human Resources";

        // Displaying Manager details
        System.out.println("Manager Details:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
        manager.printSalary();
    }
}
