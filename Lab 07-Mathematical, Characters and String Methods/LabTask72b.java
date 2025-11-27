import java.util.Scanner;

public class LabTask72b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);

        int unicode = (int) character;
        System.out.println("The Unicode For the " +  character + " is:" + unicode);
        input.close();
    }
}
