package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 7 Solution
 *  Copyright 2021 Rebecca Pina Partidas
 */

// Libraries
import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Conversion constant
        final double conversion = 0.09290304;

        // Calculates area of a room in square feet and square meter
        System.out.print("What is the length of the room in feet? ");
        double length = input.nextDouble();

        System.out.print("What is the width of the room in feet? ");
        double width = input.nextDouble();

        System.out.format("You entered dimensions of %.0f feet by %.0f feet. \nThe area is \n", length, width);

        double f2 = length * width;
        double m2 = f2 * conversion;

        System.out.format("%.0f square feet\n", f2);
        System.out.format("%.3f square meters\n", m2);
    }
}
