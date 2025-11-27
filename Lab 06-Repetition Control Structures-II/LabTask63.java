import java.util.Scanner;

public class LabTask63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int greaterNumbers = 0;
        Integer prev = null;  // Integer is a wrapper class(it can hold null values),
                               // whereas int is a primitive data type and cannot be null.
        System.out.print("Enter the Numbers (Ends with 0): ");

        while (true) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            if (prev != null && num > prev) {
                greaterNumbers++;
            }
            prev = num;
        }
        System.out.println("Number of Elements Greater than previous numbers: " + greaterNumbers);
        input.close();
    }
}
