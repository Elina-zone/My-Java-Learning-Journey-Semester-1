import java.util.Scanner;

public class LabTask21 {
    public static void main (String [] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.print("Enter the num1:");
	int num1 = sc.nextInt();
	System.out.print("Enter the num2:");
	int num2 = sc.nextInt();
	System.out.print("Enter the num3:");
	int num3 = sc.nextInt();

	double average = (num1 + num2 + num3) / 3;

	System.out.println("Average: " + average);
	sc.nextInt();
	}
    }