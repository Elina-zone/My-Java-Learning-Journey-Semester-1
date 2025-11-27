import java.util.Scanner;

public class LabTask79 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        int first = s.indexOf('h');
        int last = s.lastIndexOf('h');

        // Replace only the middle part between first and last 'h'
        String mid = s.substring(first + 1, last).replace('h', 'H');

        String result = s.substring(0, first + 1) + mid + s.substring(last);
        System.out.println(result);
    }
}