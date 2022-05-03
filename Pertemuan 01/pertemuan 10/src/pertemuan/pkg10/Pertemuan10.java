package pertemuan.pkg10;

import java.util.Scanner;

public class Pertemuan10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numInput = 10, input = 0, sum = 0, stopLoop = 999;
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < numInput; i++) {
            input = in.nextInt();
            if (input == stopLoop) {
                break;
            }
            sum += input;
        }
        System.out.println("Sum of input is: " + sum);
    }

}
