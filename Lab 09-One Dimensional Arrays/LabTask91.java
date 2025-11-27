import java.util.*;

public class LabTask91 {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        int [] response = new int [40];
        int [] answer = new int [2]; //answer[0] for awful, answer[1] for excellent (2 is lye store kiya kiyun 2 count nhin hoga sirf 0,1)
        System.out.println("Enter response");

        for (int i = 0; i < response.length; i++)
        {
            response [i] = input.nextInt();
            if (response [i] == 1)
            {
                answer [0]++;
            }
            else if (response [i] == 10)
            {
                answer [1]++;
            }
        }
        System.out.println("Awful responses are: " + answer[0]);
        System.out.println("Excellent responses are: " + answer[1]);
        System.out.println("The responses are ");
        for (int i = 0; i < response.length; i++)
        {
            System.out.println(response[i] + " ");
        }
        input.close();
    }
} 


