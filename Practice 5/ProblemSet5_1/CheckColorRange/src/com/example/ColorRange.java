package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wavelength:");
        int num = sc.nextInt();
        if (num >= 380 && num < 450) {
            System.out.println("Colour is violet!");
        } else if (num >= 450 && num < 495) {
            System.out.println("Colour is blue!");
        } else if (num >= 495 && num < 570) {
            System.out.println("Colour is green!");
        } else if (num >= 570 && num < 590) {
            System.out.println("Colour is yellow!");
        } else if (num >= 590 && num < 620) {
            System.out.println("Colour is orange!");
        } else if (num >= 620 && num < 750) {
            System.out.println("Colour is red1");
        } else {
            System.out.println("The entered wavelength is not part of visible spectrum");
        }
    }
}

