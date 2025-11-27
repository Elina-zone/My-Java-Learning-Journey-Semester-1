import java.util.Scanner;  //import class
  public class LabTask32 {
      public static void main(String [] args) {
      Scanner input = new Scanner(System.in);

      System.out.println("Enter number of students (N):");  //Taking number of students
      int N = input.nextInt();

      System.out.println("Enter number of apples (K):");  //Taking number of apples
      int K = input.nextInt();

      int applesperstudents = K / N;   //calculating apples per students
      int remainingapples = K % N;      //calculating remaining apples
       
      System.out.println("apples per student:" + K / N);   //displaying results
      System.out.println("remaining apples:" + K % N);
      input.close();   //closes scanner
      }  
 }