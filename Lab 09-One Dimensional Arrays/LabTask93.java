//program to copy contents of one array into another in the reverse order.
import java.util.Scanner;

public class LabTask93 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];  // Original array
        int[] arr2 = new int[5]; // Reverse copy array
        // Input array elements from user
        System.out.println("Enter 5 integers for the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // Print original array
        System.out.println("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        // Copy into arr2 in reverse order
        for (int i = 0, j = arr.length - 1; i < arr2.length; i++, j--) {
            arr2[i] = arr[j];
        }
        // Print reversed array
        System.out.println("Reversed copy array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        sc.close();
    }
}

/*public class LabTask93 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");

        }
        System.out.println();
        int[] arr2 = new int[5];
        for (int i = 0, j = 4; i < arr2.length; i++, j--) {
            arr2[i] = arr[j];
            System.out.print(arr2[i] + " ");
        }
    }
} */

