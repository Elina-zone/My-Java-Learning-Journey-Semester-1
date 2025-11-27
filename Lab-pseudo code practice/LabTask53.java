//entering an integer telling whether it is positive,even,negative,odd,zero
import java.util.Scanner;
    public class LabTask53 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();

	if (num > 0) {
        if (num % 2 == 0) { 
		System.out.println("The Number is positive and Even Number"); 	
	} else {
		System.out.println("The Number is positive and odd Number");
		}
 	} else if (num < 0) {
		System.out.println("The number is Negative");
        } else {
		System.out.println("The number is zero");
	input.close();
        }
    }
}

			

		
