//Name: Aleena
//FA25-BDS-006
//Programming Fundamentals Assignment no#3


import java.util.Scanner;

public class Assignment3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        do {
            System.out.println("******************************************");
            System.out.println("*        PROGRAMMING FUNDAMENTALS        *");
            System.out.println("*----------------------------------------*");
            System.out.println("*       My Coding Java Assignment 3      *");
            System.out.println("*----------------------------------------*");
            System.out.println("*  Select the task you'd like to explore *");
            System.out.println("*      (Options range from 1 to 5)       *");
            System.out.println("*                                        *");
            System.out.println("*   1. Matrix Multiplication             *");
            System.out.println("*   2. Binary Matrix Inspection          *");
            System.out.println("*   3. Character Sorting Array           *");
            System.out.println("*   4. Array Manipulation Toolkit        *");
            System.out.println("*   5. Energy Grid Balancing             *");
            System.out.println("*                                        *");
            System.out.println("*   Press 0 to terminate the program     *");
            System.out.println("******************************************");
            System.out.print("Your selection: ");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    matrixMultiplication();
                    break;
                case 2:
                    binaryMatrixAnalysis();
                    break;
                case 3:
                    charArraySorting();
                    break;
                case 4:
                    arrayOperationsMenu();
                    break;
                case 5:
                    energyGridOptimization();
                    break;
                case 0:
                    System.out.println("Exiting the system... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose between 0 and 5.");
            }
        } while (userChoice != 0);
    }

    // Question 1
    public static void matrixMultiplication() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter rows of matrix A:");
        int r1 = scanner.nextInt();
        System.out.println("Enter columns of matrix A:");
        int c1 = scanner.nextInt();

        System.out.println("Enter rows of matrix B:");
        int r2 = scanner.nextInt();
        System.out.println("Enter columns of matrix B:");
        int c2 = scanner.nextInt();
// Check multiplication condition
        if (c1 != r2) {
            System.out.println("Matrix multiplication not posssible!");
            return;
        }
// Create matrices
        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = scanner.nextInt();

        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = scanner.nextInt();        

        // Multiply matrices
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) { 
                for (int k = 0; k < c1; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("Result Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
    
        // Question 2
    public static void binaryMatrixAnalysis() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of square matrix:");  //Ask Matrix Size
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];  //Create Matrix
        // initialize with random 0s and 1s
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = (int) (Math.random() * 2);  //Math.random() returns 0.0 to <1 //Math.random() * 2 gives 0.0 to <2 //(int) converts it to 0 or 1
        // print the genrated matrix                                              
        System.out.println("Generated Matrix:");
        for (int i = 0; i < matrix.length; i++) {              
           for (int j = 0; j < matrix[i].length; j++) {       
            System.out.print(matrix[i][j] + " ");
            }
        System.out.println();       
                               
        }
        int sum, uniformCount = 0;

        for (int i = 0; i < size; i++) {
            sum = 0;
            for (int j = 0; j < size; j++) {
                sum += matrix[i][j];
            }
            if (sum == size) {
                System.out.println("All 1s in row " + (i + 1));
                uniformCount++;
            } else if (sum == 0) {
                System.out.println("All 0s in row " + (i + 1));
                uniformCount++;
            }
        }
        if (uniformCount == 0)
            System.out.println("No uniform rows");

        uniformCount = 0;
        for (int j = 0; j < size; j++) {
            sum = 0;
            for (int i = 0; i < size; i++) {
                sum += matrix[i][j];
            }
            if (sum == size) {
                System.out.println("All 1s in column " + (j + 1));
                uniformCount++;
            } else if (sum == 0) {
                System.out.println("All 0s in column " + (j + 1));
                uniformCount++;
            }
        }
        if (uniformCount == 0)
            System.out.println("No uniform columns");

        sum = 0;
        for (int i = 0; i < size; i++)
            sum += matrix[i][i];
        if (sum == size)
            System.out.println("All 1s in main diagonal");
        else if (sum == 0)
            System.out.println("All 0s in main diagonal");
        else
            System.out.println("No uniform entries in main diagonal");

        sum = 0;
        for (int i = 0; i < size; i++)
            sum += matrix[i][size - 1 - i];
        if (sum == size)
            System.out.println("All 1s in sub diagonal");
        else if (sum == 0)
            System.out.println("All 0s in sub diagonal");
        else
            System.out.println("No uniform entries in sub diagonal");
    }

    // Question 3
    public static void charArraySorting() {
        char[] charList = new char[10];
        for (int i = 0; i < charList.length; i++) {
            charList[i] = (char) (Math.random() * 3 + 97);
        }

        System.out.println("Original Array:");
        for (char ch : charList)
            System.out.print(ch + " ");
        System.out.println();

        for (int i = 0; i < charList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < charList.length; j++) {
                if (charList[j] < charList[minIndex])
                    minIndex = j;
            }
            char temp = charList[i];
            charList[i] = charList[minIndex];
            charList[minIndex] = temp;
        }

        System.out.println("Sorted Array:");
        for (char ch : charList)
            System.out.print(ch + " ");
        System.out.println();
    }

    // Question 4
    public static void countOccurrences(int[] dataArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value to count:");
        int target = scanner.nextInt();
        int count = 0;
        for (int val : dataArray)
            if (val == target)
                count++;
        System.out.println(target + " appears " + count + " times");
    }

    public static void partitionArray(int[] dataArray) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pivot:");
        int pivot = scanner.nextInt();
        int[] resultArray = new int[dataArray.length];
        int index = 0;
        for (int val : dataArray)
            if (val < pivot)
                resultArray[index++] = val;
        resultArray[index++] = pivot;
        for (int val : dataArray)
            if (val > pivot)
                resultArray[index++] = val;

        System.arraycopy(resultArray, 0, dataArray, 0, dataArray.length);
        System.out.println("Partitioned Array:");
        for (int val : dataArray)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void countDuplicates(int[] dataArray) {
        System.out.println("Frequency of Elements:");
        for (int i = 0; i < dataArray.length; i++) {
            int frequency = 0;
            for (int val : dataArray)
                if (val == dataArray[i])
                    frequency++;
            System.out.println(dataArray[i] + " occurs " + frequency + " times");
        }
    }

    public static void circularSumArray(int[] dataArray) {
        int[] result = new int[dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            result[i] = dataArray[(i + 1) % dataArray.length] + dataArray[(i + 2) % dataArray.length];
        }
        System.out.println("Circular Sum Array:");
        for (int val : result)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void shiftArrayLeft(int[] dataArray) {
        int[] result = new int[dataArray.length];
        for (int i = 0; i < dataArray.length; i++) {
            result[i] = dataArray[(i + 2) % dataArray.length];
        }
        System.out.println("Left-Shifted Array:");
        for (int val : result)
            System.out.print(val + " ");
        System.out.println();
    }

    public static void arrayOperationsMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array length:");
        int length = scanner.nextInt();
        int[] values = new int[length];

        System.out.println("Enter array values:");
        for (int i = 0; i < length; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println("Choose Operation:");
        System.out.println("1) Count Occurrences");
        System.out.println("2) Partition");
        System.out.println("3) Count Duplicates");
        System.out.println("4) Circular Sum");
        System.out.println("5) Left Shift by 2");
        System.out.println("0) Exit");
        int operation = scanner.nextInt();

        switch (operation) {
            case 1:
                countOccurrences(values);
                break;
            case 2:
                partitionArray(values);
                break;
            case 3:
                countDuplicates(values);
                break;
            case 4:
                circularSumArray(values);
                break;
            case 5:
                shiftArrayLeft(values);
                break;
        }
    }

    // Question 5
    public static void energyGridOptimization() {
        Scanner scanner = new Scanner(System.in);
        int[][] grid = new int[3][3];
        int threshold = 200;

        System.out.println("Enter energy values for each 3x3 sector:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Original Grid:");
        for (int[] row : grid) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }

        int[][] optimized = new int[3][3];
        int[] dx = { -1, 1, 0, 0 };
        int[] dy = { 0, 0, -1, 1 };

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                optimized[i][j] = grid[i][j];
                if (grid[i][j] >= threshold) {
                    for (int d = 0; d < 4; d++) {
                        int ni = i + dx[d];
                        int nj = j + dy[d];
                        if (ni >= 0 && ni < 3 && nj >= 0 && nj < 3) {
                            optimized[i][j] = grid[ni][nj];
                            break;
                        }
                    }
                }
            }
        }

        System.out.println("Optimized Grid:");
        for (int[] row : optimized) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}
