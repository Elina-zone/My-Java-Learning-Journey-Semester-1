import java.util.Scanner;

public class LabTask48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//ask user for month,day,year
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter the day (1-31): ");
        int day = input.nextInt();
        System.out.print("Enter the last two-digit year: ");
        int year = input.nextInt();
        input.close();

//check if the date is magic or not
        if (month * day == year) {
            System.out.println("The date is magic");
        } else {
            System.out.println("The date is not magic");
        }
    }
}