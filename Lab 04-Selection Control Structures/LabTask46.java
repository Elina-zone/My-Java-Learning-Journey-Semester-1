import java.util.Scanner;

public class LabTask46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number between(1-10): ");
        int number = input.nextInt();
        input.close();

        String romanNumeral;

        switch (number) {
            case 1:
                romanNumeral = "I";
                break;
            case 2:
                romanNumeral = "II";
                break;
            case 3:
                romanNumeral = "III";
                break;
            case 4:
                romanNumeral = "IV";
                break;
            case 5:
                romanNumeral = "V";
                break;
            case 6:
                romanNumeral = "VI";
                break;
            case 7:
                romanNumeral = "VII";
                break;
            case 8:
                romanNumeral = "VIII";
                break;
            case 9:
                romanNumeral = "IX";
                break;
            case 10:
                romanNumeral = "X";
                break;// exits the switch case to prevent checking unnecessary cases.

            default:// Executes when number does not match any case (not between 1-10).

                System.out.print("Error: Please enter a number between 1 and 10.");

                return;// Stops the program immediately if the number is out of range.
                       // The program does not proceed to the next lines.

        }
        System.out.println(" The roman numeral for " + number + " is: " + romanNumeral);

    }
}