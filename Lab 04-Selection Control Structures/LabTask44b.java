import java.util.Scanner;

    public class LabTask44b {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//maximum of two numbers
        System.out.print("Enter two integer:");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        // we can also use Math.max function to find smaller number
        if (a > b) {
            System.out.println("greater number:" + a);
        } else {
            System.out.println("greater number:" + b);
        }
    }
}
