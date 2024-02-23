package com.assign;

import java.util.Scanner;

class TicketCounter {
    private int totalPassengers;
    private double totalCash;

    // Constructor to initialize totals to 0
    public TicketCounter() {
        this.totalPassengers = 0;
        this.totalCash = 0.0;
    }

    // Method for paying passenger
    public void payingPassenger() {
        totalPassengers++;
        totalCash += 50.0;
        System.out.println("Paying passenger added. Rs. 50 collected.");
    }

    // Method for child passenger
    public void childPassenger() {
        totalPassengers++;
        System.out.println("Child passenger added. No charge for children.");
    }

    // Method to display totals
    public void display() {
        System.out.println("\nTotal Passengers: " + totalPassengers);
        System.out.println("Total Cash Collected: Rs. " + totalCash);
    }
}

public class TicketCounterDemo {
    public static void main(String[] args) {
        TicketCounter ticketCounter = new TicketCounter();
        Scanner scanner = new Scanner(System.in);

        char choice;

        do {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add Paying Passenger");
            System.out.println("2. Add Child Passenger");
            System.out.println("3. Display Totals and Exit");

            choice = scanner.next().charAt(0);

            switch (choice) {
                case '1' -> ticketCounter.payingPassenger();
                case '2' -> ticketCounter.childPassenger();
                case '3' -> ticketCounter.display();
                default -> System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != '3');

        scanner.close();
    }
}

