import java.util.Scanner;

public class LabTask61a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
// input two integers A and B
        System.out.print("Enter A: ");
        int A = input.nextInt();
        System.out.print("Enter B: ");
        int B = input.nextInt();
        input.close();
	if (A > B) {
		System.out.println("Invalid input: A should be less than or equal to B ");
                }
	else {
	for (int i = A; i <= B; i++) {
		System.out.println(i + " ");
                }
        }
     }
 }
