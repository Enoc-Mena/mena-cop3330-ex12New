/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.ex12;
import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {

        double principle, interestRate, years;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        principle = scan.nextDouble();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter the rate of interests: ");
        interestRate = scan2.nextDouble();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        years = scan3.nextDouble();

        double newInterestRate = interestRate / 100;

        double simpleInterest = principle * (1 + (newInterestRate * years));

        System.out.print("After " + years + " years at " + interestRate + "%, the investment will be worth $" + simpleInterest + ".");

    }

}
