import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] fractions = {1.57, 7.654, 9.986};

        String[] timeOfDay = {"Morning", "Day", "Evening", "Night"};


        System.out.println("Задание 2");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);

            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < fractions.length; i++) {
            System.out.print(fractions[i]);

            if (i != fractions.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < timeOfDay.length; i++) {
            System.out.print(timeOfDay[i]);

            if (i != timeOfDay.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Задание 3");

        for (int i = numbers.length -1; i >= 0; i--) {
            System.out.print(numbers[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = fractions.length -1; i >= 0; i--) {
            System.out.print(fractions[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = timeOfDay.length -1; i >= 0; i--) {
            System.out.print(timeOfDay[i]);

            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Задание 4");

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i]++;
            }
        }
        System.out.print(Arrays.toString(numbers));

        // if (i != numbers.length - 1) {
        //  System.out.print(", ");
            }
        }


