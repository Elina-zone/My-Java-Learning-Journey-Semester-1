import java.util.Scanner;

public class Assignment1Question5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	System.out.print("Enter the number of solar units: ");
        int su = input.nextInt();
	
	System.out.print("Enter the number of electricity units: ");
        int eu = input.nextInt();

	int totalUnits = su + eu;
	int solarPrice = totalUnits * 7;
	int electricPrice = totalUnits * 60;
	int saving = electricPrice - solarPrice;

	System.out.println("Total Units:" + totalUnits);
	System.out.println("Solar Price:" + solarPrice);
	System.out.println("electric Price:" + electricPrice);
	System.out.println("Savings:" + saving);
	input.close();
	}
    }
