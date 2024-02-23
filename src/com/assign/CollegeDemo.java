package com.assign;

class College {
    String collegeName;
    String address;
    String[] departments;
    Faculty[] facultyList;
    static final String MY_COLLEGE = "XYZ College";

    // Constructor for College class
    public College(String collegeName, String address, String[] departments, Faculty[] facultyList) {
        this.collegeName = collegeName;
        this.address = address;
        this.departments = departments;
        this.facultyList = facultyList;
    }

    // Member function to display college details
    public void displayCollegeDetails() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Address: " + address);
        System.out.println("Departments: " + String.join(", ", departments));
        System.out.println("Faculty List:");
        for (Faculty faculty : facultyList) {
            faculty.display();
        }
    }
}

class Department extends College {
    int totalDepartments;
    String departmentName;
    String hodName;

    // Constructor for Department class
    public Department(String collegeName, String address, String[] departments, Faculty[] facultyList,
                      int totalDepartments, String departmentName, String hodName) {
        super(collegeName, address, departments, facultyList);
        this.totalDepartments = totalDepartments;
        this.departmentName = departmentName;
        this.hodName = hodName;
    }

    // Member function to display department details
    public void display() {
        System.out.println("\nDepartment Name: " + departmentName);
        System.out.println("Total Departments: " + totalDepartments);
        System.out.println("HOD Name: " + hodName);
    }
}

class Faculty extends Department {
    int totalFaculty;
    String facultyName;
    int yearsWorked;

    // Constructor for Faculty class
    public Faculty(String collegeName, String address, String[] departments, Faculty[] facultyList,
                   int totalDepartments, String departmentName, String hodName,
                   int totalFaculty, String facultyName, int yearsWorked) {
        super(collegeName, address, departments, facultyList, totalDepartments, departmentName, hodName);
        this.totalFaculty = totalFaculty;
        this.facultyName = facultyName;
        this.yearsWorked = yearsWorked;
    }

    // Member function to display faculty details
    public void display() {
        super.display();
        System.out.println("Total Faculty: " + totalFaculty);
        System.out.println("Faculty Name: " + facultyName);
        System.out.println("Years Worked: " + yearsWorked);
    }
}

public class CollegeDemo {
    public static void main(String[] args) {
        // Creating an array of departments
        String[] departments = {"Computer Science", "Electrical Engineering", "Physics"};

        // Creating an array of faculty
        Faculty[] facultyList = {
                new Faculty("XYZ College", "123 Main Street", departments,
                        null, 3, "Computer Science", "Dr. Smith", 10, "John Doe", 5),
                new Faculty("XYZ College", "123 Main Street", departments,
                        null, 3, "Electrical Engineering", "Dr. Johnson", 8, "Jane Smith", 3)
        };

        // Creating a Department object
        Department department = new Department("XYZ College", "123 Main Street", departments, facultyList,
                departments.length, "Computer Science", "Dr. Smith");

        // Creating a College object
        College college = new College("XYZ College", "123 Main Street", departments, facultyList);

        // Displaying details
        department.display();
        System.out.println("\n--------------------\n");
        college.displayCollegeDetails();
    }
}

