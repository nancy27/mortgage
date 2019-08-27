package com.mortgage;


import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Principal($1K - $1M  : ");
        int principal = scanner.nextInt();

        while (!(principal >= 1000 && principal <= 1_000_000)) {
            System.out.println("Enter a value between 1000 and 1000000");
            principal = scanner.nextInt();
        }

        System.out.print("Enter your Annual Interest Rate : ");
        float annInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annInterestRate / 100 / 12;


        System.out.print("Enter your Period (years) : ");
        int period = scanner.nextInt();
        int noOfMonths = period * 12;

        double result = Math.pow((1 + monthlyInterestRate), noOfMonths);
        double numerator = monthlyInterestRate * result;
        double denominator = result - 1;
        double mortagae = principal * numerator / denominator;
        NumberFormat currencyMortagae = NumberFormat.getCurrencyInstance();
        System.out.println("your mortage is : " + currencyMortagae.format(mortagae));

    }
}