import java.util.Scanner;

public class LabTask62 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int evenDigits = 0;

        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                evenDigits++;
            }
        }
        System.out.print("Even Digits: " + evenDigits);
        input.close();
    }
}
