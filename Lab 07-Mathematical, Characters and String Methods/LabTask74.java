public class LabTask74 {
    public static void main(String[] args) {
        char character = (char) ('A' + (int) (Math.random() * 26));
        // (int)Math.random()*26 generate a random number between 0-26
        // The ASCII code for A is 65
        // (char) will convert it again in alphabet
        System.out.println("Random Upper-Case letter: " + character);
        }
    }
