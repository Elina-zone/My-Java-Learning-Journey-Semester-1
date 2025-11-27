import java.util.Scanner;//import classes 
public class LabTask34{ 
public static void main(String[] args){ 
Scanner input = new Scanner(System.in); 
System.out.print("Enter the Minutes after MidNight = "); 
int minutes = input.nextInt(); //taking minutes as an input 
int hour = minutes / 60; 
minutes = minutes % 60; 
//converting minutes to hours 
//calculating remaining minutes 
System.out.println("NOW THE TIME IS = " + hour + " : " + minutes); 
input.close(); //closes the scanner 
} 
} 