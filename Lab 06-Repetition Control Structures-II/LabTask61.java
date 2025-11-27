import java.util.Scanner;

public class LabTask61 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;   // Initialize max with the smallest possible integer value
        System.out.print("Enter the Intergers(Ends with 0): ");
        while (true) {
		int num = input.nextInt();// Read an integer from user input
                if (num == 0) {  // If the input is 0, terminate the loop
                break;
                }
                if (num > max) { // Update max if the current number is greater
                max = num;   // update the max variable
                }
	}
        System.out.println("Largest element in the sequence : " + max);
        input.close();
        }
    }
