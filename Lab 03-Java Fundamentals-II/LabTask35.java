import java.util.Scanner; 
public class LabTask35{ 
//import classes 
public static void main(String[] args){ 
Scanner input = new Scanner(System.in); 
System.out.print("Enter the total amount of milk produced in the morning"); 
double  production = input.nextDouble(); //taking amount  of milk in liters 
double milkCartons = production / 3.78; 
//milk cartons required 
System.out.println("The number of milk cartons needed to hold milk = " + milkCartons); 
double cost = production * 0.38; 
//cost of milk per litter 
System.out.println("Cost of milk is =$ " + cost); 
double profit = milkCartons * 0.27; //profit given per carton 
System.out.println("Profit =$ " + profit); 
input.close(); //closes the scanner 
} 
}