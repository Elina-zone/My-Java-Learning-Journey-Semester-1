import java.util.Scanner;

public class LabTask45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integer: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();
        input.close();

        if (x == y && y == z) {
            System.out.println("output:" + 3);
        } else if (x == y || y == z || x == z) {
            System.out.println("output:" + 2);
        } else {
            System.out.println("output:" + 0);
        }
    }
}
