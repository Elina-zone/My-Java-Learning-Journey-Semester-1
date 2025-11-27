import java.util.*;
public class LabTask23 {
   public static void main(String [] args) {

   final int SECRET = 5;
   final double RATE = 12.5;
   Scanner input = new Scanner(System.in);

   double hoursWorked;
   System.out.print("Enter the hours worked: ");
   hoursWorked = input.nextDouble();
   
   String name = "Mustafa";
   
   int num1 = 13;
   int num2 = 28;
   int result = num1 * num2;

   double wages = hoursWorked * RATE;
   System.out.println("Name: " + name);
   System.out.println("Salary: " + wages);
   System.out.println("Pay Rate: " + RATE);
   input.close();
      }
   }
