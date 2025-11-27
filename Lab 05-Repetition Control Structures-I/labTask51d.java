//SUM OF N CUBES
import java.util.Scanner;

public class labTask61d {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter (N): ");
        int N = input.nextInt();
        int sum = 0;
//calculate sum of cubes from 1^3 to N^3
	for (int i = 1; i <= N; i++) {

	sum += (int) (Math.pow(i, 3));
	}
	System.out.println("Sum of cubes:" + sum);
	}
    }