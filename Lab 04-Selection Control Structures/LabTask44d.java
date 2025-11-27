import java.util.Scanner;

public class LabTask44d {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        input.close();
//minimum of three integers
        int min = x; // assume x is min

        if (y < min) {
            min = y;
        }if (z < min) {
            min = z;
        }
        System.out.println("The smallest number is: " + min);
    }
}
