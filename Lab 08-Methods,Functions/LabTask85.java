import java.util.Scanner;

public class LabTask85 {
    // method to count letters
    public static int countLetters(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is a letter capital or small
            if (Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
	// main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ask user to enter a string
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Call the method and display the result
        int letters = countLetters(str);
        System.out.println("The number of letters in the string: " + letters);
    }
}