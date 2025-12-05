// Program to find transpose of matrix using 2D array
/*public class Activity103 {
    public static void main(String[] args) {
        int matrix1 [][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        // creating another matrix to store transpose of a matrix1
        int matrix2 [][] = new int[4][3];  //4 rows and 3 columns

        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix1[i][j] + "\t");
            }
            System.out.println();
        }
        matrix2 = transpose(matrix1);
        System.out.println("Transpose of given Matrix is:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix2[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int [] [] transpose(int [] [] matrix) {
        int [] [] trans = new int [4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                trans[i][j] = matrix[j][i];
            }
        }
        return trans;
    }
}*/












import java.util.Scanner;

public class Activity103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements of row: " + (i + 1));
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("The entered 2-D array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("The transpose of the entered 2-D array is: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i] + "\t");
            }
            System.out.println();
        }
        input.close();
    }
}
