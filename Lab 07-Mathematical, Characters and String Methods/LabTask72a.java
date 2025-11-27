import java.util.Scanner;

public class LabTask72a {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII-Code between(0-127): ");
        int ascii = input.nextInt();

        if (ascii >= 0 && ascii <= 127) {
            char character = (char) ascii;
            System.out.println("The character for ASCII code " + ascii + " is: " + character);
            } else {
            System.out.println("Invalid input! Please enter digit between and 0 anf 127");
            }
        input.close();
        }
    }
