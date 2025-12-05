// Program to initialize a 3x3 2D array with natuarl numbers starting
// from 11 and count the number of prime numbers in the given array 
import java.util.Scanner;

public class Activity102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19},{20, 21, 22}};
        System.out.println("The given 2-D array is: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "\t");
            System.out.println();
            }
        }
        // Input elements into a array
        System.out.println("The prime numbers in 2D array are...");
        int n = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (isPrime(arr[i][j])) {
                    System.out.print(arr[i][j] + "\t");
                    n++;
                }
            }
        }
        System.out.println("Total prime numbers = " + n);
        input.close();
    }
    public static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= n / 2; i++) 
            if (n % i == 0) {
                prime = false;
                break;
            }
        return prime;
    }
}        