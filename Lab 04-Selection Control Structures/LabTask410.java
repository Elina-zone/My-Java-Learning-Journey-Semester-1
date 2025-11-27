import java.util.Scanner;

public class LabTask410 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//ask user enter number of books
        System.out.print("Enter the number (0-4): ");
        int book = input.nextInt();
        input.close();
//variable to store the points earned
        String point;
//using switch case
        switch (book) {
            case 0:
                point = "0 points";
                break;
            case 1:
                point = "5 points";
                break;
            case 2:
                point = "15 points";
                break;
            case 3:
                point = "30 points";
                break;
            case 4:
                point = "60 points";
                break;
            default: //if input is not between 0-4
                System.out.print("The number is out of range");
                return; 
        }
//results
        System.out.print("She purchased " + book + " books" + " She earned " + point);
    }
}
