import java.util.Scanner;

public class LabTask82 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("The reverse of the integer is: " + reverse(num));

        if (isPalindrome(num)) {
            System.out.println("The integer is a palindrome.");
        } else {
            System.out.println("The integer is not a palindrome.");
	}
	input.close();
}
	// Method to reverse an integer
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
    // Method to check if number is palindrome
    public static boolean isPalindrome(int number) {

        return number == reverse(number);
    }
}
