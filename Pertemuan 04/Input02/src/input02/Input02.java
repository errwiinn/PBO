package input02;

import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null,
                "Halo semua",
                "Judul",
                2);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Hello",
                "Judul",
                2,
                null,
                null,
                "mm");
        
        
        String[] acceptableValues = {"tidak", "iya"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "Kamu suka saya?",
                "Judul",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
                
    }
}
