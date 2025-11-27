import java.util.Scanner;

    public class LabTask44a {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//minimum of two numbers
        System.out.print("Enter two integer:");
        int a = input.nextInt();
        int b = input.nextInt();
        input.close();
        // we can also use Math.min function to find smaller number
        if (a < b) {
            System.out.println("smaller number:" + a);
        } else {
            System.out.print("smaller number:" + b);
        }
    }
}
