//SUM OF N NUMBERS
import java.util.Scanner;

public class LabTask61c {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//read the number of integers
        System.out.print("Enter the number of integers (N): ");
        int N = input.nextInt();
	int sum = 0;
//Read N integers and calculate their sum
	System.out.print("Enter " + N + " Integers:");
        for (int i = 0; i < N; i++) {
		sum += input.nextInt();
        	}
//print the sum

        System.out.println("Sum: " + sum);
        input.close();
	}
    }
