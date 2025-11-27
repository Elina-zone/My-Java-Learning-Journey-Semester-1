import java.util.Scanner;

public class Lab6Activity4 {
	static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
//declare the variables
        int num; // variable to store the random number
        int guess; // variable to store the numbers
//guessed by the user
	boolean done; //boolean variable to control the loop
        num = (int) (Math.random() * 100);
	done = false;

	while (!done) {
		System.out.print("Enter an integer greater"+" than or equal to 0 and "+" less than 100: ");
        	guess = input.nextInt();
		System.out.println();
	if (guess == num) {
		System.out.println("You guessed the "+" correct number.");
		done = true;
	} //line12
	else if (guess < num)
		System.out.println("Your guess is "+" lower than" + " the number.\n" + "Guess again!");
	else //line 15
		System.out.println("Your guess is "+" higher than" + " the number.\n" + "Guess again!");
		
	} //end while
    }
  }
		
		
