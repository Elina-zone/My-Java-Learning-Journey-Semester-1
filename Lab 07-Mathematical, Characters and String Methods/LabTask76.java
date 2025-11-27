import java.util.Scanner;

public class LabTask76 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String st = input.nextLine();    

        int space = st.indexOf(' '); // find the space between the two words

        // extracting the both words
        String word1 = st.substring(0, space);
        String word2 = st.substring(space + 1);

        // out for swapped order
        System.out.println(word2 + " " + word1);
	input.close();
        }
}