import java.util.Scanner;

public class LabTask65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Initialize max with the smallest possible integer value
        int max = Integer.MIN_VALUE; 
        System.out.print("Enter the Intergers(Ends with 0): ");
        while (true) {
//Read an integer from user input
		int num = input.nextInt();
//If the input is 0, terminate the loop
        if (num == 0) {
                break;
                }
//Update max if the current number is greater
	if (num > max) {
                max = num; //update the max variable
                }
        }
        System.out.println("Largest element in the sequence : " + max);
        input.close();
        }
    }
