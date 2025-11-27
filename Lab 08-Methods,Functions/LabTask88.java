import java.util.Scanner;

public class LabTask88 {
	//Main Method 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = input.next();
        System.out.println("Number of vowels in the string: " + vowelWord(str));
        input.close();
    }

    public static int vowelWord(String st) {
        int count = 0;
        st.toLowerCase();

        for (int i = 0; i < st.length(); i++) {
            char letter = st.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
        return count;
    }

}
