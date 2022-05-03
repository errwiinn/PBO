package input01;

import javax.swing.JOptionPane;

public class Input01 {

    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("type");
        System.out.println(input);

        //Parse the input as an int.
        //Print its value +1
        String input2 = JOptionPane.showInputDialog("Type");
        int input3 = Integer.parseInt(input2);
        System.out.println("Value: " + (input3 + 1));

        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int input4 = Integer.parseInt(JOptionPane.showInputDialog("type me:"));
    }
}
