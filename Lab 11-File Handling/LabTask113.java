//Write a Java program to accept all the data stored in a file in the previous task (Lab Task1). Remove all the prime numbers from this data and save again in the same file.
import java.io.*;
import java.util.*;

public class LabTask113 {

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        try {
            // Read all numbers from file
            Scanner reader = new Scanner(new File("data.txt"));
            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (!line.isEmpty()) {
                    numbers.add(Integer.parseInt(line));
                }
            }
            reader.close();

            // Remove prime numbers
            numbers.removeIf(LabTask113::isPrime);

            // Save back to file
            PrintWriter writer = new PrintWriter("data.txt");
            for (int num : numbers) {
                writer.println(num);
            }
            writer.close();

            System.out.println("Prime numbers removed. Updated data saved to data.txt.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Make sure data.txt exists.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
