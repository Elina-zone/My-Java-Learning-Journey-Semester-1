import java.util.Scanner;
public class LabTask81b {

	//Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        int result = reverse(number);
        System.out.println(result);
        input.close();
    }
	//method for reversing the number
    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
