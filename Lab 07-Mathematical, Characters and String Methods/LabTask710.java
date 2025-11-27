import java.util.Scanner;

public class LabTask710{
    public static void main (String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String s = sc.nextLine();

	//In the first line, print the third character of this string.
	System.out.println(s.charAt(2));

	//In the second line, print the second to last character of this string.
	System.out.println(s.charAt(s.length() - 2));

	//In the third line, print the first five characters of this string.
	System.out.println(s.substring(0, 5));

	//In the fourth line, print all but the last two characters of this string. 
	System.out.println(s.substring(0, s.length() - 2));

	//In the fifth line, print all the characters of this string with even indices.
	for (int i = 0; i < s.length(); i += 2) {
	System.out.print(s.charAt(i));
	}
	System.out.println();
 
	//In the sixth line, print all the characters of this string with odd indices.
	for (int i = 1; i < s.length(); i += 2) {
	System.out.print(s.charAt(i));
	}
	System.out.println();
 
	//In the seventh line, print all the characters of the string in reverse order. 
	for (int i = s.length()-1; i >= 0; i--) {
	System.out.print(s.charAt(i));
	}
	System.out.println();
 
	//In the eighth line, print every second character of the string in reverse order, starting from the last one. 
	for (int i = s.length()-1; i >= 0; i -= 2) {
	System.out.print(s.charAt(i));
	}
 	System.out.println();

	//In the ninth line, print the length of the given string. 
	System.out.println(s.length());

	sc.close();
	}
    }