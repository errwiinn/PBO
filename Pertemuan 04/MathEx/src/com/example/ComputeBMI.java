package com.example;

import java.util.Scanner;
import java.lang.Math;

public class ComputeBMI {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight = scan.nextDouble();
        double height = scan.nextDouble();
        double bmi = weight / Math.pow(height, 2) * 703;
        System.out.println("Your Body Mass Index: " + bmi);
    }
}
