//Write a Java program to accept 10 integer values from user. Save this data in a file.
import java.io.*;
import java.util.Scanner;

public class LabTask111 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 integer values:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        try {
            PrintWriter writer = new PrintWriter("data.txt");
            for (int num : numbers) {
                writer.println(num); // save each number on a separate line
            }
            writer.close();
            System.out.println("Data saved successfully to data.txt.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
