import java.util.Scanner;

public class LabTask63 {
   public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the Intergers (N): ");
	int N = input.nextInt();
	int zeroCount = 0;
//read N numbers and count zeros
	System.out.print("Enter " + N + " Integers: ");
	
	for (int i = 0; i < N; i++) {
		if (input.nextInt() == 0) {
		zeroCount++;     //increament zero count if number is zero
		}
	}
	System.out.println("The Number of zeros: " + zeroCount);
	input.close();
	}
    }