package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 110022;

        int enteredpin = 0;
        while (enteredpin != pin) {
            System.out.print("Enter pin: ");
            enteredpin = sc.nextInt();
            if (enteredpin != pin) {
                System.out.println("Your pin is wrong!");
            }
        }
    }
}
