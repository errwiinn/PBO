package jfo7.pkg1;

public class PrisonTest {

    public static void main(String[] args) {
        //exercise 1
        Prisoner bubba = new Prisoner();
        Prisoner twitch = new Prisoner();

        System.out.println(bubba == twitch);//false

        //exercise 2
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.sentence = 4;

        twitch.name = "Twitch";
        twitch.height = 1.73;
        twitch.sentence = 3;

        System.out.println(bubba == twitch);//false

        bubba = twitch;
        System.out.println(bubba == twitch);//true

        //exercise 3
        bubba.name = new String("Bubba");
        twitch.name = new String("Bubba");
        System.out.println(bubba.name == twitch.name);
        bubba.name = "Bubba";
        twitch.name = "Bubba";
        System.out.println(bubba.name == twitch.name);

    }
}
