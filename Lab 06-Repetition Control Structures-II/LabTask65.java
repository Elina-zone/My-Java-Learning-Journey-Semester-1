import java.util.Scanner;
public class LabTask65 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	 
	// Get user input
	System.out.print("Enter the Year: ");           
        int year = input.nextInt();
        System.out.print("Enter 1st day of the year (0 for Sunday, 1 for Monday,...,6 for Saturday): ");
        int firstDay = input.nextInt();
	
	 // Array of month names
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };     
        
	 // Loop through all months
	for (int month = 0; month < 12; month++) {      
            int daysInMonth = 31; // Default days 
	
	// Set correct number of days in each month       
            if (month == 3 || month == 5 || month == 8 || month == 10) {     
                daysInMonth = 30; // April, June, September, November
            } else if (month == 1) {    // February
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
		
		// Leap year
                    daysInMonth = 29; 
                } else {
                    daysInMonth = 28;
		}
            }

	     // Print month header
            System.out.println("\n  " + months[month] + " " + year);        
            System.out.println("-----------------------------");
            System.out.println("Sun Mon Tue Wed Thu Fri Sat");
	    // Print spaces for the first day of the month
            for (int j = 0; j < firstDay; j++) {       
                System.out.print("    ");
            }
	    // Print all days of the month  
            for (int day = 1; day <= daysInMonth; day++) {        
                System.out.printf("%3d ", day);
                 // Move to a new line after every Saturday
		if ((firstDay + day) % 7 == 0) {       
                    System.out.println(); 
		}
            }
	     // Move to the next line for the next month
            System.out.println();    
            firstDay = (firstDay + daysInMonth) % 7;       // Update start day for the next month
        }
        input.close();
    }
}