/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Geena-Maria van Dijk
 */


package org.example;

import java.util.Scanner;

public class RectangleArea {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet? ");
        int lengthFt = input.nextInt();

        System.out.println("What is the width of the room in feet? ");
        int widthFt = input.nextInt();

        int areaFt = lengthFt * widthFt;

        double conv = 0.09290304;

        double areaMet = areaFt * conv;

        System.out.println("The area is");
        System.out.println(areaFt + " square feet");
        System.out.printf("%.3f square meters", areaMet);






    }//End of method
}//End of class
