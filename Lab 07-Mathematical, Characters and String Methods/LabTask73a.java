import java.util.Scanner;

public class LabTask73a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal Number Between(0-15): ");
        int number = input.nextInt();
        	if (number >= 0 && number <= 15) {
           	String hexNumber = Integer.toHexString(number).toUpperCase();
            	System.out.println("The hex value is: " + hexNumber);
        	} else {
                System.out.println("Invalid input! Please enter number between 0 and 15");
                }
        input.close();
        }
    }
