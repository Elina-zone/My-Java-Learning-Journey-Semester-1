import java.util.Scanner;

public class LabTask62 {
    public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the integer: ");
	int N = input.nextInt();
	input.close();
//to avoid over flow
	long factorial = 1;

	for (int i = 1; i <= N; i++) {
		factorial *= i;  //multiply factorial by i
		}
	System.out.println("Factorial of " + N + " is: " + factorial);
	}
    }