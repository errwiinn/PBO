package processingname;

import java.util.Scanner;

public class ProcessName {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        int space = name.indexOf(" ");
        String lastName = name.substring(space);
        char firstName = name.charAt(0);
        System.out.println("Your name:" + lastName + ", " + firstName + ".");

    }
}
