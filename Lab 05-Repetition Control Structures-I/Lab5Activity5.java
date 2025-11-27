import java.util.Scanner;

import java.util.Scanner;

public class Lab6Activity5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max, number;
        number = input.nextInt();
        max = number;
        do {
            number = input.nextInt();

            if (number > max)
                max = number;
        } while (number != 0);
        {
            System.out.println("Max is: " + max + " and Number is " + number);
        }
        input.close();
    }
}
