package practice7;

import java.util.Scanner;

public class Terminal {

    public void addBalance(Card card, int x) {
        card.setCreditBalance(x);
    }

    public void transferCredit(Card cardSender, Card cardReceiver, int x) {
        if (cardSender.setCreditBalance(-x)) {
            cardReceiver.setCreditBalance(x);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    public void requestPrize(Card card) {
        System.out.println("1. Food(5 ticket)");
        System.out.println("2. Doll(20 ticket)");
        System.out.println("3. Book(50 ticket)");
        Scanner scan = new Scanner(System.in);
        System.out.print("Select prize: ");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                if (card.setTicketBalance(-5)) {
                } else {
                    System.out.println("Balance insufficient!");
                }
                break;
            case 2:
                if (card.setTicketBalance(-20)) {
                } else {
                    System.out.println("Balance insufficient!");
                }
                break;
            case 3:
                if (card.setTicketBalance(-50)) {
                } else {
                    System.out.println("Balance insufficient!");
                }
                break;
        }
    }
}
