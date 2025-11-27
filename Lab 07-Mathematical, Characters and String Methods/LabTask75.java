import java.util.Scanner;

public class LabTask75 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        String reversed = new StringBuilder(string).reverse().toString();
        // StringBuilder is mutable→allows modification without creating new objects.
        if (string.equalsIgnoreCase(reversed)) {
            System.out.println(string + " is a palindrome");
        } else {
            System.out.println(string + " is not a palindrome");
            }
        input.close();
        }
    }
// StringBuilder modifies strings without creating new objects (better
// performance).
// .reverse() reverses the string in place.
// .toString() converts StringBuilder back to a normal String.
