package com.example;

import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {

        System.out.println("1. Red\n2. Orange\n3. Green");
        System.out.println("Choose current light:");
        Scanner sc = new Scanner(System.in);
        int currentlight = sc.nextInt();
        switch (currentlight) {
            case 1:
                System.out.println("Next light is green!");
                break;
            case 2:
                System.out.println("Next light is red!");
                break;
            case 3:
                System.out.println("Next light is orange!");
                break;
            default:
                System.out.println("Invalid colour!");
        }
    }

}
