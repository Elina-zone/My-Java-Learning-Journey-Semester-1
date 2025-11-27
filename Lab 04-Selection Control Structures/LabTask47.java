import java.util.Scanner;

public class LabTask47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//input for 1st rectangle
        System.out.print("Enter the length, Width of 1st rectangle: ");
        double length1 = input.nextDouble();
        double width1 = input.nextDouble();
//input for 2nd rectangle
        System.out.print("Enter the length, Width of 2nd rectangle: ");
        double length2 = input.nextDouble();
        double width2 = input.nextDouble();
        input.close();
//calulating areas
        double area1 = length1 * width1;
        double area2 = length2 * width2;
//comparing and display outputs
        if (area1 > area2) {
            System.out.println("Area of 1st rectangle is greater");
        } else if (area2 > area1) {
            System.out.println("Area of 2nd rectangle is greater");
        } else {
            System.out.println("Areas are same");
        }
    }
}
