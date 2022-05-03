package practice7;

import java.util.Random;

public class Game {

    public void swipeCard(Card card) {
        if (!card.setCreditBalance(-3)) {
            return;
        }
        Random rand = new Random();
        int ticketwon = rand.nextInt(30);
        card.setTicketBalance(ticketwon);
        System.out.println("Card no: " + card.getNo());
        System.out.println("Ticket won: " + ticketwon);
        System.out.println("Current ticket: " + card.getTicketBalance());
    }
}
