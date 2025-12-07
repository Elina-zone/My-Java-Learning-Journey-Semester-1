//Write a Java program to keep accepting characters from user and store in a file. Display all the characters stored in a text file.
import java.io.*;
public class Activity112 {
    public static void main(String[] args) {
        InputStreamReader cin = null;
        try {
            cin = new InputStreamReader(System.in);
            OutputStream os = new FileOutputStream("test.txt");
            System.out.println("Enter characters, 'q' to quit.");
            char c;
            do {
                c = (char) cin.read();
                os.write(c);
            }
            while (c != 'q');
            os.close();
            System.out.println("The given data is as below");
            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((char) is.read());
            }
            is.close();
            }
            catch (IOException e) {
                System.out.println("Exception");
            }
        }
    }
    

