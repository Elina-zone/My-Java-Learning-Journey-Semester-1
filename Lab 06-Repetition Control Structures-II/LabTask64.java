import java.util.Scanner;

public class LabTask64 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repeat = true; // boolean var to control loop rep
        while (repeat) { // Loop continue until user choose to exit

            // Display pattern options
            System.out.println("Select a Pattern to print(1-5): ");

            System.out.println("1) Rectangle of * ");

            System.out.println("2) Right-Angle triangle of * ");

            System.out.println("3) Mirrored Right- Angle triangle of *");

            System.out.println("4) Pyramid of * ");

            System.out.println("5) Number pyramid ");

            System.out.print("Enter The choice: ");

            int choiceOfUser = input.nextInt(); // read user choice

	 // Execute corresponding method based on user choice
            
	    switch (choiceOfUser) {
                case 1:
                    printRectangle(); // call method to print rectangle
                    break;
                case 2:
                    printRightTriangle(); // call method to print right-angled triangle
                    break;
                case 3:
                    printMirroredTriangle(); // call method to print mirrored triangle
                    break;
                case 4:
                    printPyramid(); // call method to print pyramid
                    break;
                case 5:
                    printNumberPyramid();// call method to print numberPyramid
                    break;
                default: // handle invalid input
                    System.out.println("Invalid choice! Try Again");
                    continue;// restart the loop
		  }

            // Ask user if they want to continue
            System.out.print("Do you want to print Another Pattern? (yes/no): 	");

            String responseOfUser = input.next(); // read response(yes/no

            if (!responseOfUser.equalsIgnoreCase("yes")) {// If user enters anything other than "yes"

                repeat = false;// exit loop

            }

        }

        input.close();

        System.out.println("Program terminated."); // Indicate program termination, if user response will be no.

    }

    // Method 1/Case1

    public static void printRectangle() {

        for (int i = 1; i <= 4; i++) {

            System.out.print("* * * * * * * * * *\n");

        }

    }

    // Method 2/ Case2

    public static void printRightTriangle() {

        for (int i = 1; i <= 5; i++) { // loop for rows

            // loop for printing stars

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    // Method3/Case3

    public static void printMirroredTriangle() {

        for (int i = 1; i <= 5; i++) { // ”Outer loop”, controlling rows 

            for (int j = 4; j >= i; j--) { // ”inner loop”, the number of spaces 

                System.out.print("  ");// two spaces for better allignment

            }

            // printing stars

            for (int k = 1; k <= i; k++) {

                System.out.print("* ");

            }

            System.out.println();

        }

    }

    // Method4/case4

    public static void printPyramid() {

        for (int i = 1; i <= 5; i++) { // ”outer loop”, controlling number of rows

            for (int j = 4; j >= i; j--) { // printing spaces

                System.out.print(" ");

            }

            for (int k = 1; k <= (2 * i - 1); k++) {

                System.out.print("*");

            }

            System.out.println();

        }

    }

    // method5/case5

    public static void printNumberPyramid() {

        for (int i = 1; i <= 5; i++) { // outer loop

            for (int j = 1; j <= i; j++) { // inner loop

                System.out.print(i); // printing i (numbers)

            }

            System.out.println();

        }

    }

}