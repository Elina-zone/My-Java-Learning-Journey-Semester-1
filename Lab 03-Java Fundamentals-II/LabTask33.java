import java.util.Scanner; 
   public class LabTask33{ 
   //import classes 
     public static void main(String[] args){ 
     Scanner input = new Scanner(System.in); 
     System.out.print("Enter the students in First  Classroom = "); 
     int first = input.nextInt(); 
     //number of students in first class  
     System.out.print("Enter the students in Second  Classroom = "); 
     int second = input.nextInt(); //number of students in second class 
     System.out.print("Enter the students in Third  Classroom = "); 
     int third = input.nextInt(); 
     //number of students in 3rd class 
     int deskRequired = (first + second + third + 1) / 2; //calculating required desk 
     System.out.println("The Smallest possible number of Desks are = " + deskRequired); 
     input.close(); //closes the scanner
     }
  }
