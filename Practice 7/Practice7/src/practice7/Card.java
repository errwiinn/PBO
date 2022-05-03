package practice7;

public class Card {

    private int creditBalance, ticketBalance, cardNo;

    public Card(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getNo() {
        return cardNo;
    }

    public boolean setCreditBalance(int z) {
        if ((creditBalance + z) > 0) {
            creditBalance += z;
            return true;
        } else {
            return false;
        }
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public boolean setTicketBalance(int z) {
        if ((ticketBalance + z) > 0) {
            ticketBalance += z;
            return true;
        } else {
            return false;
        }
    }

    public int getTicketBalance() {
        return ticketBalance;
    }
}
