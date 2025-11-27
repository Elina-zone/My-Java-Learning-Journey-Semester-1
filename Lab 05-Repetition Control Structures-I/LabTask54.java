
import java.util.Scanner;

public class LabTask64 {
    public static void main (String [] args) {
	Scanner input = new Scanner(System.in);
//to keep track of the sequence length
	int digitCount = 0;  
	System.out.print("Enter number (ends with 0) : ");
//its an infinite loop, its only stop when the break statement is encountered
	while (true) {
	int N = input.nextInt();
	if (N == 0) {
		break;
		}
//increament sequence length
		digitCount++;
		}
	System.out.println("Length of the sequence is: " + digitCount);
	input.close();
	}
    }
	