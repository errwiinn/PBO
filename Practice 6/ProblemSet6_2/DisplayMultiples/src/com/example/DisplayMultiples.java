package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 0; i < 12; i++) {
            long result = num * (i + 1);
            System.out.println(num + " * " + (i + 1) + " = " + result);
        }
    }

}
