import java.util.Scanner;

public class LabTask83 {
    public static void displaySortedNumbers(double num1, double num2, double num3) {
	double a; 
	double b; 
	double c;

        if (num1 <= num2 && num1 <= num3) {         
            a = num1;

            if (num2 <= num3) {
		b = num2;
                c = num3;
            } else {
                b = num3;
                c = num2;
            }
        } else if (num2 <= num1 && num2 <= num3) {  
            a = num2;

            if (num1 <= num3) {
                b = num1;
                c = num3;
            } else {
                b = num3;
                c = num1;
            }
        } else {                         
            a = num3;

            if (num1 <= num2) {
                b = num1;
                c = num2;
            } else {
                b = num2;
                c = num1;
            }
        }

        System.out.println("Numbers in increasing order are: " + a + " " + b + " " + c);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        displaySortedNumbers(a, b, c);
    }
}
