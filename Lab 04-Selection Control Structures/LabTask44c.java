import java.util.Scanner;

public class LabTask44c {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the integer: ");
        int x = input.nextInt();
	input.close();
       
//sign function
        if (x > 0) {
            System.out.println("1");
        } else if (x < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
} 