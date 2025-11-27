import java.util.Scanner;

public class LabTask54 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Years of service: ");
        int serviceYears = input.nextInt();
       
	if (serviceYears < 3) {
            System.out.println("Not eligible for a bonus.");
        } else {
// Ask for the performance rating if eligible
            System.out.println("Enter performance rating (1, 2, or 3): ");
	    int rating = input.nextInt();
	if (rating == 3) {
                System.out.println("your bonus is 10000$");
	} else if (rating == 2) {
                System.out.println("your bonus is 5000$");
	} else if (rating == 1) {
                System.out.println("your bonus is 2000$");
	} else {
                System.out.println("Invalid rating! Please enter 1, 2, or 3.");
            }
        }
        input.close();
    }
}
