import java.util.Scanner;

public class LabTask49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // user for coin counts
        System.out.print("Enter the number of dimes: ");
        int dimes = scanner.nextInt();

        System.out.print("Enter the number of quarters: ");
        int quarters = scanner.nextInt();

        System.out.print("Enter the number of pennies: ");
        int pennies = scanner.nextInt();

        System.out.print("Enter the number of nickels: ");
        int nickels = scanner.nextInt();

        // result
        if (pennies * nickels * quarters * dimes == 100) {
            System.out.println("Congratulations! You have WON the game.");
	    }
	else if (pennies * nickels * quarters * dimes > 100) {
            System.out.println("That's more than one dollar. Try again!");
	    }
	else {
            System.out.println("That's less than one dollar. Try again!");
		}
	 scanner.close();
	}
    }



