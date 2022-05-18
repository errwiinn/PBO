package practice8;

import java.util.*;
import javax.swing.JOptionPane;

public class Game {
    
    private int score;
    private Team yourteam, team1, team2, team3;
    private ArrayList<Team> team;
    Random rand = new Random();
   
    
    public Game() {
        naming();
        startGame();
    }

    private void naming() {
        team1.setName("Appala");
        team2.setName("Apollo");
        team3.setName("Alpella");
        team = new ArrayList();
        team.add(yourteam);
        team.add(team1);
        team.add(team2);
        team.add(team3);
    }
    
    private void startGame() {
        int opponent = rand.nextInt(3) + 1;
        int opponentscore, yourscore;
        switch (opponent) {
            case 1:
                System.out.println("Your opponent: " + team1.getName());
                JOptionPane.showMessageDialog(null, "Get ready!");
                if (Scheduler.getTemp() >= 20 && Scheduler.getTemp() <= 25) {
                    yourscore = rand.nextInt(3);
                    opponentscore = rand.nextInt(3);
                } else if (Scheduler.getTemp() > 25 && Scheduler.getTemp() <= 30) {
                    yourscore = rand.nextInt(5) + 1;
                    opponentscore = rand.nextInt(5) + 1;
                } else {
                    yourscore = rand.nextInt(7) + 2;
                    opponentscore = rand.nextInt(7) + 2;
                }
                System.out.println("Your team score: " + yourscore);
                System.out.println("Your enemy score: " + opponentscore);
                Team.scoring(yourteam, team1, yourscore, opponentscore);
                break;
            case 2:
                System.out.println("Your opponent: " + team2.getName());
                JOptionPane.showMessageDialog(null, "Get ready!");
                if (Scheduler.getTemp() >= 20 && Scheduler.getTemp() <= 25) {
                    yourscore = rand.nextInt(3);
                    opponentscore = rand.nextInt(3);
                } else if (Scheduler.getTemp() > 25 && Scheduler.getTemp() <= 30) {
                    yourscore = rand.nextInt(5) + 1;
                    opponentscore = rand.nextInt(5) + 1;
                } else {
                    yourscore = rand.nextInt(7) + 2;
                    opponentscore = rand.nextInt(7) + 2;
                }
                System.out.println("Your team score: " + yourscore);
                System.out.println("Your enemy score: " + opponentscore);
                Team.scoring(yourteam, team2, yourscore, opponentscore);
                break;
            case 3:
                System.out.println("Your opponent: " + team3.getName());
                JOptionPane.showMessageDialog(null, "Get ready!");
                if (Scheduler.getTemp() >= 20 && Scheduler.getTemp() <= 25) {
                    yourscore = rand.nextInt(3);
                    opponentscore = rand.nextInt(3);
                } else if (Scheduler.getTemp() > 25 && Scheduler.getTemp() <= 30) {
                    yourscore = rand.nextInt(5) + 1;
                    opponentscore = rand.nextInt(5) + 1;
                } else {
                    yourscore = rand.nextInt(7) + 2;
                    opponentscore = rand.nextInt(7) + 2;
                }
                JOptionPane.showMessageDialog(null, "Good job!");
                System.out.println("Your team score: " + yourscore);
                System.out.println("Your enemy score: " + opponentscore);
                Team.scoring(yourteam, team3, yourscore, opponentscore);
                break;
        }
    }
    
    public void printStatement() {
        for (Team t : team) {
            System.out.println("Team: " + t.getName());
        }
    }
}
