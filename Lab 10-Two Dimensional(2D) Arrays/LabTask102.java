
// prime number in each row and column of 2D array
import java.util.Scanner;

public class LabTask102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];
        // Input elements into the array
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Elements of row: " + (i + 1));
            for (int j = 0; j < 4; j++) {
                arr[i][j] = input.nextInt();
            }
        }
        // Display the array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        // Count prime numbers in each row
        int maxRowPrimes = 0;
        int rowIndex = -1;
        
        for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 0; j < 4; j++) {
                if (isPrime(arr[i][j])) {
                    count++;
                }
            }
            
            if (count > maxRowPrimes) {
                maxRowPrimes = count;
                rowIndex = i;
            }
        }

        // Count prime numbers in each column
        int maxColPrimes = 0;
        int colIndex = -1;

        for (int j = 0; j < 4; j++) {
            int count = 0;
            for (int i = 0; i < 3; i++) {
                if (isPrime(arr[i][j])) {
                    count++;
                }
            }
            if (count > maxColPrimes) {
                maxColPrimes = count;
                colIndex = j;
            }
        }

        System.out.println("\nResult:");
        if (maxRowPrimes > maxColPrimes) {
            System.out.println("Row " + (rowIndex + 1) + " has the most prime numbers: " + maxRowPrimes);
        } else if (maxColPrimes > maxRowPrimes) {
            System.out.println("Column " + (colIndex + 1) + " has the most prime numbers: " + maxColPrimes);
        } else {
            System.out.println("Both a row and a column have the same maximum number of primes: " + maxRowPrimes);
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
