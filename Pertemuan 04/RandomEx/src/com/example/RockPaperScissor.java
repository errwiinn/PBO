package com.example;

import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        String result;
        Random rand = new Random();
        int random = rand.nextInt(3) + 1;
        if (random == 1) {
            result = "Rock";
        } else if (random == 2) {
            result = "Scissor";
        } else {
            result = "Paper";
        }
        System.out.println(result);
    }
}
