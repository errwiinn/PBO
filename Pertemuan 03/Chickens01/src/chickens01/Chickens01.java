package chickens01;

public class Chickens01 {

    public static void main(String[] args) {
        //Put yout code here
        int eggsPerChicken, chickenCount, totalEggs;
        eggsPerChicken = 5;
        chickenCount = 3;
        totalEggs = eggsPerChicken * chickenCount;
        chickenCount++;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        chickenCount = chickenCount / 2;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        System.out.println(totalEggs);


        totalEggs = 0;
        eggsPerChicken = 4;
        chickenCount = 8;
        totalEggs = eggsPerChicken * chickenCount;
        chickenCount++;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        chickenCount = chickenCount / 2;
        totalEggs = totalEggs + (eggsPerChicken * chickenCount);
        System.out.println(totalEggs);
    }
}
