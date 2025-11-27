import java.util.Scanner;

public class LabTask87 {
    // Method to print an n-by-n matrix of random 0s and 1s
    public static void printMatrix(int n) {
        for (int i = 0; i < n; i++) {             // Rows
            for (int j = 0; j < n; j++) {            // Columns
                int value = (int)(Math.random() * 2); // Random 0 or 1
                System.out.print(value + " ");
            }
            System.out.println();     // Move to the next line after each row
        }
    }
    // Main method (test program)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        printMatrix(n); // Display the matrix
    }
}