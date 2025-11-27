import java.util.Scanner;

public class LabTask81a {
	//MAIN METHOD
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an interger");
        long number = input.nextLong();
        int result = sumDigit(number);
        System.out.println("Sum of digits :" + result);
        input.close();
    }
	//long method for sum of integers
    public static int sumDigit(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;    // extract last digit and store it in sum
            n /= 10;   // remove last digit
            }
        return sum;
    }
}
