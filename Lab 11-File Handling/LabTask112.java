//Write a Java program to accept all the data stored in a file in the previous task. Sort this data in ascending order and display on screen.
import java.io.*;
import java.util.*;

public class LabTask112 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        try {
            Scanner reader = new Scanner(new File("data.txt"));

            while (reader.hasNextLine()) {
                String line = reader.nextLine().trim();
                if (!line.isEmpty()) {
                    numbers.add(Integer.parseInt(line));
                }
            }
            reader.close();

            Collections.sort(numbers); // sort ascending

            System.out.println("Numbers in ascending order:");
            for (int num : numbers) {
                System.out.println(num);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found! Make sure data.txt exists.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format in file.");
        }
    }
}
