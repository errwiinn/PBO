package practice8;

public class Team {

    private String name;
    private int totalwin, totalloss, tie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalWin(int x) {
        totalwin += x;
    }

    public void setTotalLoss(int x) {
        totalloss += x;
    }

    public void setTotalTie(int x) {
        tie += x;
    }

    public static void scoring(Team yourteam, Team opponentTeam, int yourscore, int opponentscore) {
        if (yourscore > opponentscore) {
            yourteam.setTotalWin(1);
            opponentTeam.setTotalLoss(1);
        } else if (yourscore < opponentscore) {
            opponentTeam.setTotalWin(1);
            yourteam.setTotalLoss(1);
        } else {
            opponentTeam.setTotalTie(1);
            yourteam.setTotalTie(1);
        }
    }
}
