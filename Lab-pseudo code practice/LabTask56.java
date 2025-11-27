//'Pseudo Code' of LabTask56

//Set packagePrice = 99 
//Display "Enter the number of packages purchased:" 
//INPUT QUANTITY
//If quantity >= 10 AND quantity <= 19 
         //discountRate = 0.20
//Else if quantity >= 20 AND quantity <= 49 
         //discountRate = 0.30 
//Else if quantity >= 50 AND quantity <= 99 
          //discountRate = 0.40
//Else if quantity >= 100 
          //discountRate = 0.50 
//Else 
          //discountRate = 0.0 
//subtotal = packagePrice * quantity
//discountAmount = subtotal * discountRate 
//total = subtotal - discountAmount 
//DISPLAY "Discount Amount: $" + discountAmount 
//DISPLAY "Total Price After Discount: $" + total


//java program
import java.util.Scanner;

public class LabTask56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   // Package price
        double packagePrice = 99;
   // Ask user for number of packages
        System.out.print("Enter the number of packages purchased: ");
        int quantity = input.nextInt();
        double discountRate;
   // Check discount conditions
        if (quantity >= 10 && quantity <= 19) {
            discountRate = 0.20;
        } else if (quantity >= 20 && quantity <= 49) {
            discountRate = 0.30;
        } else if (quantity >= 50 && quantity <= 99) {
            discountRate = 0.40;
        } else if (quantity >= 100) {
            discountRate = 0.50;
        } else {
            discountRate = 0.0;
        }
   // Calculate amounts
        double subtotal = packagePrice * quantity;
        double discountAmount = subtotal * discountRate;
        double total = subtotal - discountAmount;
   // Display results
        System.out.println("Discount Amount: $" + discountAmount);
        System.out.println("Total Price After Discount: $" + total);

        input.close();
    }
}

