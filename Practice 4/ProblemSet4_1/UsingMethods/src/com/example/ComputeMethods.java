package com.example;

import java.util.Random;

public class ComputeMethods {

    public double fToC(double degreesF) {
        double degreesC = 5 / 9 * (degreesF - 32);
        return degreesC;
    }

    public double hypotenuse(int a, int b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }

    public int roll() {
        Random rand = new Random();
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;
        return roll1 + roll2;
    }
}
