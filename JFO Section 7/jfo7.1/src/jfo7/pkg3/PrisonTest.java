package jfo7.pkg3;

public class PrisonTest {

    public static void main(String[] args) {
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);
        Prisoner p02 = new Prisoner("Twitch", 1.71, 3);
        System.out.println(p01.name);
        System.out.println(p02.name);
    }
}
