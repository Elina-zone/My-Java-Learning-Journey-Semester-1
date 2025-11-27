//Name: Aleena
//Reg no: FA25-BDS-006
//Submitted to: Mr.Khurram iqbal



//rock,paper,scissor game
import java.util.Scanner;
    public class LabTask51 {
	public static void main (String [] args) {
	
	Scanner sc = new Scanner(System.in);
//for computer choice
	int computerChoice;
	computerChoice = (int) (Math.random() * 3); // for generating ) 0,1,2
//get number for user
	System.out.println("Enter your choice (0 for Rock, 1 for Paper, 2 for Scissor):");
	int userChoice = sc.nextInt();

	System.out.println("Computer chose:" + computerChoice);	
	System.out.println("You chose:" + userChoice);

//Display choices
	if(userChoice == computerChoice) {
	         System.out.println("it's draw!");
	        }
	else if ((userChoice == 0 && computerChoice == 2) || (userChoice == 1 && computerChoice == 0) || (userChoice == 2 && computerChoice == 1)) 
		{System.out.println("You Win!");
		}
	else 
		{System.out.println("Computer Wins!");
	        }
	sc.close(); 
	}
   }