/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;
import java.lang.Math;


public class Interestcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the principal:");
        String principalString = input.nextLine();

        double principal = Double.parseDouble(principalString);

        System.out.print("Enter the rate of interest:");
        String rateString = input.nextLine();

        double rate = Double.parseDouble(rateString);

        System.out.print("Enter the number of years:");
        String yearsString = input.nextLine();

        double years = Double.parseDouble(yearsString);

        System.out.print("Enter the number of times the interest is compounded per year:");
        String compoundString = input.nextLine();

        int compound = Integer.parseInt(compoundString);

        double total = Math.ceil((principal * Math.pow(1 + (rate/100)/compound, compound * years)) * 100)/100;

        System.out.printf("$%.2f invested at %.2f percentage for %.2f years compounded %d times per year is %.2f", principal, rate, years, compound, total);



    }
}