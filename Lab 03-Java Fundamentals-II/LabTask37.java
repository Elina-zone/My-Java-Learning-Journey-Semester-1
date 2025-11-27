import java.util.Scanner;    //import classes
    public class LabTask37{
        public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Number of seats sold in \'A\' Category Cost $20= ");
	int categoryA = input.nextInt();       //input number of seats sold in Category A
	System.out.println("Enter Number of seats sold in \'B\' Category Cost $15= ");
	int categoryB = input.nextInt();      //input number of seats sold in Category B
	System.out.println("Enter Number of seats sold in \'C\' Category Cost $10=");
	int categoryC = input.nextInt();      //input number of seats sold in Category C
	System.out.println("Enter Number of seats sold in \'D\' Category Cost $5= ");
	int categoryD = input.nextInt();      //input number of seats sold in Category D
	double totalIncome = (categoryA * 20) + (categoryB * 15) + (categoryC * 10) + (categoryD * 5);      //calculating total income
	System.out.print("Total income After all solds = $" + totalIncome);     //showing outputs
	input.close();     //closes the scanner
	}
    }