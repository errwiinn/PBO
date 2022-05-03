package practice8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Scheduler {

    private static int tempday;
    private int coldcount = 0, day = 0;
    private ArrayList<Integer> temp;

    public static int getTemp() {
        return tempday;
    }

    public Scheduler() {
        temp = new ArrayList();
        startMatch();
    }

    private void startMatch() {
        while (true) {
            tempday = Integer.parseInt(JOptionPane.showInputDialog("Masukkan suhu: "));
            if (tempday < 20) {
                coldcount++;
                day++;
                System.out.println("Too cold to play");
                if (coldcount == 3) {
                    break;
                }
                temp.add(tempday);
                continue;
            }
            temp.add(tempday);
            coldcount = 0;
            day++;
            Game game1 = new Game();
            Game game2 = new Game();
            if (day > 10) {
                break;
            }
        }
      
        double averageTemp = 0;
        for (int totaltemp : temp) {
            averageTemp += totaltemp;
        }
        System.out.println("Average temp: " + (averageTemp /= temp.size()));
    }
}
