//import classes 
import java.util.*; 
 public class LabTask31{ 
   public static void main(String[] args){ 
   Scanner input = new Scanner(System.in); 
   System.out.println("Enter any  Amount in Decimal = "); 
   //taking input 
   double amount = input.nextDouble();
   //calculating cents 
   double cents = amount * 100; 
   //calculating dollars 
   double dollars = cents / 100; 
   double remainingCents = cents % 100;
   //calculating quarters
   double quarters = remainingCents / 25; 
   remainingCents = remainingCents % 25;
   //calculating dimes 
   double dimes = remainingCents / 10; 
   remainingCents = remainingCents % 10; 
   //calculating nickels
   double nickels = remainingCents / 5;  
   //calculating pennis 
   double pennis = remainingCents % 5; 
   //also written as remainingCents = remainingCents % 5; 
   //showing outputs 
   System.out.println("Cents = " + cents); 
   System.out.println("Dollars = " + dollars); 
   System.out.println("Quarters = " + quarters); 
   System.out.println("Dimes = " + dimes); 
   System.out.println("Nickels = " + nickels); 
   System.out.println("Pennis = " + pennis); 
   //showing outputs 
   input.close(); //showing outputs                
   } 
}