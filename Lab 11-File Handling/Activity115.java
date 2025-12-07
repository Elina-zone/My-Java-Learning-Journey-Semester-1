//This activity shows that how to read data from user and save in file.
import java.io.*;
import java.util.Scanner;

public class Activity115 {
    public static void main (String [] args) { 
        Scanner input = new Scanner(System.in);
        int rno;
        String name;
        int marks;
        
        try {
            FileOutputStream fos = new FileOutputStream("d:\\myfile.txt");
            PrintWriter writer = new PrintWriter(fos);
        
            while(true) { 
                System.out.println("Enter Roll Number ");
                rno = input.nextInt();
                
                if (rno == 0)
                    break;
                System.out.print("Name: ");
                name = input.next();
                System.out.println("Enter Marks: ");
                marks = input.nextInt();
                writer.println(rno);
                writer.println(name);
                writer.println(marks);
            }
            System.out.println("Successfully written.");
            writer.close();
        }
        catch (IOException e) {  
            System.out.println("An error has occurred.");
        }
    }
}