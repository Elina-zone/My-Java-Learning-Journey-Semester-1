public class LabTask84 {

    // Method to return the number of days 
    public static int numberOfDaysInAYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) { //Divisible by 4 leap year 
									//and Divisible by 100 not leap year
									// but divisible by 400 leap year
            return 366; // leap year
        } else {
            return 365; // not leap year
        }
    }
    // Main method to check from 2000 to 2020
    public static void main(String[] args) {
        for (int year = 2000; year <= 2020; year++) {
            int days = numberOfDaysInAYear(year);
            System.out.println("The Year " + year + " has " + days + " days");
        }
    }
}
