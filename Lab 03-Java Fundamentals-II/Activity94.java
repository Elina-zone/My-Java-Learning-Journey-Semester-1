
import java.util.Scanner;

public class Activity94 {
//Main Method

    public static void main (String [] args) {
//Menu option
        Scanner input = new Scanner (System.in);
        System.out.println(" Enter a number to choose menu : ");
        System.out.println(" 1 : for input and display the Array \n 2 : For searching Element in an Array ");
        System.out.println(" 3 : for largest and smallest element int Array ");
        System.out.println(" 4 : for copy data to another Array ");

        int a = input.nextInt();

// condition checking
        switch (a) {
// for input and Display
            case 1: {
                int [] a1 = new int [1];
                int [] array = (Input(a1));
                display (array);
                break;
            }
            case 2: {
                int [] a1 = new int [1];
                int [] array1 = (Input(a1));
                System.out.println(" Enter number for search");
                int searchkey = input.nextInt();
                search(array1, searchkey);
                break;
            }
// for largest and smallest in the Array
            case 3: {
                int [] a1 = new int [1];
                int [] array11 = (Input(a1));
                largest (array11);
                smallest (array11);
                break;
            }
// for copying to new array
            case 4: {
                int [] a1 = {1};
                int [] array1 = (Input(a1));
                int [] copied = new int [10];
                copydata (array1, copied);
                break;
            }
            default:
                System.out.println(" You Enter invalid number");
        }
    }
// Input array method

    public static void main (String [] args) {
        int [] array1 = new int [10];
        Scanner input = new Scanner (System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("A [" + i + ] = ");
            array1 [1] = input.nextInt();
        }  
        return array1; 
    }


    public static void main display(int [] A) {
        for (int j = 0; j < 10; j++) {
            System.out.println(" A[" + j + "j" + A [j]])}
        }
                
