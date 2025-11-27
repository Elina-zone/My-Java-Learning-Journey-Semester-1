import java.util.Scanner;

public class Assignment1Question10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Input the required information  a)Total miles driven per day.
        System.out.print("Enter total miles driven per day: ");
        int milesPerDay = input.nextInt();

//b)Cost per gallon of gasoline
        System.out.print("Enter cost per gallon of gasoline (Rs.): ");
        int costPerGallon = input.nextInt();

//c)Average miles per gallon
        System.out.print("Enter average miles per gallon (mpg) of your car: ");
        int milesPerGallon = input.nextInt();

//d)Parking fees per day
        System.out.print("Enter parking fees per day (Rs.): ");
        int parkingFees = input.nextInt();

//e)Tolls per day
        System.out.print("Enter tolls per day (Rs.): ");
        int tolls = input.nextInt();

//Calculate fuel used per day in gallons
        int gallonsUsed = milesPerDay / milesPerGallon;

//Calculate cost of fuel per day
        int fuelCost = gallonsUsed * costPerGallon;                                                       

//Total daily driving cost (fuel + parking + tolls)
        int totalDailyCost = fuelCost + parkingFees + tolls;

//Display the output
        System.out.println("Fuel cost per day:" + fuelCost);
        System.out.println("Parking fees per day:" + parkingFees);
        System.out.println("Tolls per day:" + tolls);
        System.out.println("Total cost per day of driving alone:" + totalDailyCost);
        input.close();
        }
     }                                                                                                 