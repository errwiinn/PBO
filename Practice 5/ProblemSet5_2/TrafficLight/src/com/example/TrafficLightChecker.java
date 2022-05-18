package com.example;

import java.util.Scanner;

public class TrafficLightChecker {

    public static void main(String args[]) {
        System.out.println("1. Red\n2. Orange\n3. Green");
        System.out.println("Choose current light:");
        Scanner sc = new Scanner(System.in);
        int currentlight = sc.nextInt();
        if (currentlight == 1) {
            System.out.println("Next light is green!");
        } else if (currentlight == 2) {
            System.out.println("Next light is red!");
        } else if (currentlight == 3) {
            System.out.println("Next light is orange!");
        } else {
            System.out.println("Invalid colour!");
        }
    }

}
