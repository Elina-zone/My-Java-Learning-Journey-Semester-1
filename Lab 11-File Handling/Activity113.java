//This activity shows that how you can write data of different type to a file using PrintWriter class.
import java.io.*;
public class Activity113 {
    public static void main(String[] args) {
        int rno = 101;
        String name = "Muzaffar";
        int marks = 88;
        try {
            FileOutputStream fos = new FileOutputStream("d:\\myfile.txt");
            PrintWriter writer = new PrintWriter (fos);

            writer.println(rno);
            writer.println(name);
            writer.println(marks);
            System.out.println("Successfully written.");
            writer.close();
        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
        }
    }
}
