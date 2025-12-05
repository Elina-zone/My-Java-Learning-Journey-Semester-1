import java.util.Scanner;

public class LabTask103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix1 = new int[3][4];   // 3x4 matrix              A=3x4   if columns of 1st matrix=row of 2nd matrix then multiply
        int[][] matrix2 = new int[4][3];   // 4x3 matrix              
        int[][] result = new int[3][3];   // result 3x3 matrix       

        //taking input
        System.out.println("Enter elements for 3x4 matrix A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements for 4x3 matrix B:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix Multiplication (3x4 × 4x3 = 3x3)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0;
                for (int k = 0; k < 4; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Display Result
        System.out.println("Resultant 3x3 Matrix (A × B):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
