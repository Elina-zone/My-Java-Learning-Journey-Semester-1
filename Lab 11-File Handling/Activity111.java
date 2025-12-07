//Write a Java program to store a character array in a text file. Display all the characters stored in a text file.
import java.io.*;
public class Activity111 {

    public static void main (String [] args) {
        try {
            char ch [] = {'j' , 'a' , 'v' , 'a'};
            OutputStream os = new FileOutputStream("test.txt");
            for (int i = 0; i < ch.length; i++) {
                os.write( ch[i]);
            }
            os.close();

            InputStream is = new FileInputStream ("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
            System.out.println((char)is.read() + "");
            //system.out.print(is.read() + " ");
        }
        is.close();
        }
        catch (IOException e) {
            System.out.println("Exception");
        }
    }
}    