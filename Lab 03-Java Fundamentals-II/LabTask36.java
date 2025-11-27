import java.util.Scanner;     //import classes
    public class LabTask36{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter Pay Rate for an Hour = ");
	double payRate = input.nextDouble();       //taking pay rate per hour by user
	System.out.println("Enter Number of hours you worked each a week = ");
	int hours = input.nextInt();         //taking hours worked in one week
	double beforeTax = payRate * hours;      //calculating income without tax
	double afterTax = beforeTax - (beforeTax * (14.0/100.0));       //calculating income with tax
	double spendonClothes = afterTax * (10.0/100.0);
	double schoolSpend = afterTax * (1.0/100.0);
	double savingBond = afterTax * (25.0 / 100.0);
	double parentSpend = savingBond * 0.50;
	 //displaying outputs
	System.out.printf("Your income before tax = %.2f\n" ,beforeTax);
	System.out.printf("Your income after tax = %.2f\n" ,afterTax);
	System.out.printf("Money spend on clothes = %.2f\n" ,spendonClothes);
	System.out.printf("Money you spend on school accessories = %.2f\n" ,schoolSpend);
	System.out.printf("Money spend on saving bonds = %.2f\n" ,savingBond);
	System.out.printf("Money spend by parents is = %f$ ",parentSpend);
	input.close();     //closes the scanner
	}
    }