import java.util.Scanner;

public class LabTask73b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexa-decimal digit: ");
        String hexDigit = input.next().toUpperCase();

        int decimal = Integer.parseInt(hexDigit, 16);  // convert hexa to decimal

        String binary = Integer.toBinaryString(decimal);  // Java does not have a binary data type,
                                                          // so we use String to keep the format intact.
                                                          // convert decimal to binary
        System.out.println("The binary value is: " + binary);
        input.close();
    }
}
