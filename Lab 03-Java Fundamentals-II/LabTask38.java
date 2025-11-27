import java.util.Scanner;       //import classes
    public class LabTask38{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	int number;
	System.out.print("Enter a number between 0 and 1000 = " );
	number = input.nextInt();      //taking input
	int first = number / 10;        //breaking the more digit value to single digit
	int second = number % 10;
	int third = first % 10;
	int fourth = first / 10;
	int sum = second + third + fourth;       //taking sum of all digits
	System.out.print("Sum of them as individually is = " + sum );     //displaying outputs
	input.close();      //closes the scanner
	}
   }