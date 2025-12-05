
//lab 10 (Graded task 1)
// Program to find row and column with maximum sum in a 2D array
import java.util.Scanner;

public class LabTask101 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];
        // Input elements into a array
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Elements of row " + (i + 1));
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
        // row sum
        int maxRowSum = Integer.MIN_VALUE;
        int maxRowIndex = -1;       
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 4; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum > maxRowSum) {
                maxRowSum = rowSum;
                maxRowIndex = i;
            }
        }
        // coloumn sum
        int maxColSum = Integer.MIN_VALUE;
        int maxColIndex = -1;
        for (int j = 0; j < 4; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += arr[i][j];
            }
            if (colSum > maxColIndex) {
                maxColSum = colSum;
                maxColIndex = j;
            }
        }
        System.out.println("\nRow with maximum sum: Row " + (maxRowIndex + 1) + " (Sum = " + maxRowSum + ")");
        System.out.println("Column with maximum sum: Column " + (maxColIndex + 1) + " (Sum = " + maxColSum + ")");
        input.close();
    }
}
