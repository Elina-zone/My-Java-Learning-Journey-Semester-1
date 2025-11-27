import java.util.Scanner;

public class Assignment1Question11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Ask the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        int number = input.nextInt();
//Extract digits one by one using division and modulus
        int digit1 = number % 10;
        int digit2 = (number / 10) % 10;
        int digit3 = (number / 100) % 10;
        int digit4 = (number / 1000) % 10;
        int digit5 = (number / 10000) % 10;
//Combine digits in reverse order
        int reverse = (digit1 * 10000) + (digit2 * 1000) + (digit3 * 100) + (digit4 * 10) + digit5;
//Display the reversed number
        System.out.println("The Reversed Order Number: " + reverse);
        input.close();
        }
    }                                                                                                                         