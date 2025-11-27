import java.util.Scanner;

public class Lab6Activity3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int SENTINEL = -999;
        int number; // variable to hold number
        int sum = 0; // hold the sum of the numbers
        int count = 0; // variable to hold the total
        System.out.println("Enter Positive integers " + "ending with" + SENTINEL);
        number = input.nextInt();

        while (number != SENTINEL) {
            sum = sum + number;
            count++;
            number = input.nextInt();
        }
        System.out.printf("The sum of  %d  " + "number = %d%n", count, sum);

        if (count != 0) {
            System.out.printf("The average = %d%n", (sum / count));
        } else {
            System.out.println("No Input");
        }
        input.close();
    }
}
