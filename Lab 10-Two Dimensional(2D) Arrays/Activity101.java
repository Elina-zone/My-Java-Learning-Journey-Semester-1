// Program to find sum of each row in a 2D array
import java.util.Scanner;

public class Activity101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter array elements of row: " + (i + 1));
            for (int j = 0; j < 4; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("The given 2-D array is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        int sum;
        for (int i = 0; i < 3; i++) {
            sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];

            }
            System.out.println("Sum of row" + (i + 1) + " is " + sum);
        }
        input.close();
    }
}

