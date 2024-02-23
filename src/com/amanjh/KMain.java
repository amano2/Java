package com.amanjh;

import java.text.DecimalFormat;

class Measurement {
    private double km;
    private double meter;
    private double millimeter;

    // Constructor
    public Measurement(double km, double meter, double millimeter) {
        this.km = km;
        this.meter = meter;
        this.millimeter = millimeter;
    }

    // Method to round off kilometers
    public double roundOffKilometer() {
        return Math.round(km);
    }

    // Method to round off meters
    public double roundOffMeter() {
        return Math.round(meter);
    }

    // Method to round off millimeters
    public double roundOffMillimeter() {
        return Math.round(millimeter);
    }
}

public class KMain {
    public static void main(String[] args) {
        // Creating an instance of Measurement
        Measurement measurement = new Measurement(12.345, 678.901, 2345.678);

        // Displaying the original values
        System.out.println("Original Values:");
        System.out.println("Kilometer: " + measurement.roundOffKilometer() + " km");
        System.out.println("Meter: " + measurement.roundOffMeter() + " m");
        System.out.println("Millimeter: " + measurement.roundOffMillimeter() + " mm");
        System.out.println();

        // Displaying the rounded off values
        System.out.println("Rounded Off Values:");
        System.out.println("Kilometer: " + measurement.roundOffKilometer() + " km");
        System.out.println("Meter: " + measurement.roundOffMeter() + " m");
        System.out.println("Millimeter: " + measurement.roundOffMillimeter() + " mm");
    }
}

