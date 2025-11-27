//'Pseudo Code' of labTask56
//DISPLAY "Enter the weight of the package:"
//Input weight

//If weight <= 2
    //rate  = 1.10 * weight
//Else if weight > 2 AND weight <= 6
    //rate = 2.20 * weight
//Else if weight > 6 AND weight <= 10
    //rate  = 3.70 * weight
//Else
    //rate = 3.80 * weight
//Display "The shipping charge is: $" + charge


//java program
import java.util.Scanner;

public class LabTask55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// Ask user for package weight
        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = input.nextDouble();

        double rate;

// Check conditions and calculate rates
        if (weight <= 2) {
           rate = 1.10 * weight;
        } else if (weight > 2 && weight <= 6) {
           rate = 2.20 * weight;
        } else if (weight > 6 && weight <= 10) {
            rate = 3.70 * weight;
        } else {
            rate = 3.80 * weight;
        }

// Display the result
        System.out.println("The shipping rate is: $" + rate);

        input.close();
    }
}



      
