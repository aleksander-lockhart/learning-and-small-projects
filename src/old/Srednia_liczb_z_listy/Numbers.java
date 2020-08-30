package testing.kodilla;

import java.util.Random;

public class Numbers {

    public static void main(String args[]) {
        int summ = 0;

        int[] numbers = new int[20];
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers[i] = random.nextInt(50);
        }
        for (int i = 0; i < numbers.length; i++) {
            summ = summ + numbers[i];
            System.out.println(numbers[i]);
        }
        System.out.println("Srednia: " + summ / numbers.length);
    }
}
