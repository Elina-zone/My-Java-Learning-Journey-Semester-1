import java.util.Scanner;

public class LabTask77 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("Enter a word with letter f: ");
        String s = input.nextLine(); 

        int first = s.indexOf('f');
        int last = s.lastIndexOf('f');

        // Only print if at least one 'f' exists
        if (first != -1) {
            
            if (first == last)
                System.out.println(first);
            else
                System.out.println(first + " " + last);
        }
    }
}