import java.util.Scanner;

public class LabTask61b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        int A = input.nextInt();
        System.out.print("Enter B: ");
        int B = input.nextInt();
        input.close();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.println(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.println(i + " ");
            }
        }
    }
}
