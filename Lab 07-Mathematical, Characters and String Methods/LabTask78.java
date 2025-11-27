import java.util.Scanner;

public class LabTask78 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();  

        int first = st.indexOf('h');
        int last = st.lastIndexOf('h');

        String result = st.substring(0, first) + st.substring(last + 1);
        System.out.println(result);
        }
  }