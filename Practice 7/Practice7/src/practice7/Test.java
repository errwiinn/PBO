package practice7;

public class Test {
    
    public static void main(String[] args) {
        Card card1 = new Card(123);
        Card card2 = new Card(124);
        Terminal terminal1 = new Terminal();
        
        card1.setCreditBalance(20);
        System.out.println(card1.getCreditBalance());
        terminal1.transferCredit(card1, card2, 30);
        System.out.println(card1.getCreditBalance());
        System.out.println(card2.getCreditBalance());
        Game game1 = new Game();
        game1.swipeCard(card1);
        terminal1.requestPrize(card1);
    }
    
}
