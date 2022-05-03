package pertemuan.pkg10;

public class lat2 {

    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;
        while (counter < 100) {
            counter++;
            if (counter % 10 == 0) {
                continue;
            } else {
                sum += counter;
            }
        }
        System.out.println("Sum of 1-99: " + sum);
    }
}
