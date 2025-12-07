//This activity shows that how to read data from file saved in previous activity.
import java.io.*;
import java.util.Scanner;

public class Activity116 {
    public static void main(String [] args) {
        
        try {
            File Obj = new File("C:\\Users\\PC\\OneDrive\\Desktop\\Lab 11-File Handling\\myfile.txt");
            Scanner Reader = new Scanner(Obj);
            while (Reader.hasNext()) {
                //reading 1st
                int rno = Reader.nextInt();
                String name = Reader.next();
                int marks = Reader.nextInt();
                //then print
                System.out.println("R. No=" + rno);
                System.out.println("Name=" + name);
                System.out.println("Marks=" + marks);
                
            }
            Reader.close();
        } 
        catch (FileNotFoundException e) {
            System.out.println("An Error has occurred.");
        }
    }    
}