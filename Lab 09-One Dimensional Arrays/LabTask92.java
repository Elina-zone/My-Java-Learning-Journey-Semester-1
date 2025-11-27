public class LabTask92 {
    public static void main(String[] args) {
        // Initialize and declare array with 10 fixed elements
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call modify function
        modify(arr);
    }
    public static void modify(int[] x) {
        int[] modified = new int[10];

        // Multiply each element by 3
        for (int i = 0; i < x.length; i++) {
            modified[i] = x[i] * 3;
        }

        // Print modified array
        System.out.println("Modified array:");
        for (int i = 0; i < modified.length; i++) {
            System.out.print(modified[i] + " ");
        }
    }
}

/* import java.util.Scanner;

public class LabTask92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];  // array of 10 elements

        System.out.println("Enter 10 integers for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call modify function
        modify(arr);

        sc.close();
    }

    public static void modify(int[] x) {
        // Multiply each element by 3 directly in the same array
        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] * 3;
        }

        System.out.println("Modified array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
    }
}
*/