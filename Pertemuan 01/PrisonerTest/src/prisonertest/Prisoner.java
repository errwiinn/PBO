package prisonertest;

public class Prisoner {

    private String name;
    public double height;
    public int sentence;
    public String kota;
    public static int umur = 10;
    public int tinggi;

    public void tampilkan() {
        System.out.println(umur);
        System.out.println(tinggi);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Prisoner(String name, double height, int sentence) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    public Prisoner(String name, double height, int sentence, String kota) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.kota = kota;
    }

}
