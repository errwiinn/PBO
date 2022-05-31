package userstory;

import java.util.Scanner;

public class UserStory {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input nama: ");
        String nama = sc.nextLine();
        System.out.print("Input tahun lahir: ");
        int tahun = sc.nextInt();
        int umur = 2022 - tahun;
        System.out.print("Input tinggi badan (cm): ");
        int tinggibadan = sc.nextInt();
        System.out.print("Input berat badan (kg): ");
        int beratbadan = sc.nextInt();
        System.out.print("Input askot: ");
        String kota = sc.nextLine();
        System.out.println("Hai, namaku " + nama + ". \nUmurku " + umur + " tahun.");
        System.out.println("Aku berasal dari "+kota+". Tinggiku "+tinggibadan+" cm.");
        System.out.println("Berat badanku "+beratbadan+" kg.");
    }

}
