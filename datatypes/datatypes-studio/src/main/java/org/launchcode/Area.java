package org.launchcode;

import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area =  3.14;
        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        System.out.println("The area of a circle of radius " + radius + " is: " + Circle.getArea(radius));
        input.close();
    }
}
