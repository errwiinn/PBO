package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner scan = new Scanner(System.in);

        //Find and print the sum of three integers entered by the user
        int angka1, angka2, angka3;
        angka1 = scan.nextInt();
        angka2 = scan.nextInt();
        angka3 = scan.nextInt();
        int sum = angka1 + angka2 + angka3;
        System.out.println("Sum: " + sum);

        //Remember to close the Scanner
        scan.close();
    }
}
