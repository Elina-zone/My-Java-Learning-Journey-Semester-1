import java.util.Scanner;
   public class DeskCalculation {
     public static void main(String [] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter a number of students in class A:");
     int a = input.nextInt();
     System.out.println("Enter a number of students in class B:");
     int b = input.nextInt();
     System.out.println("Enter a number of students in class C:");
     int c = input.nextInt();

     int desksA = (a + 1) / 2;
     int desksB = (b + 1) / 2;
     int desksC = (c + 1) / 2;

     int totalDesks = desksA + desksB + desksC;
     System.out.println("Number of totalDesks:" + totalDesks);
     input.close();
     }
  }