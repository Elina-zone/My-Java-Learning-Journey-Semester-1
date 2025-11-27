import java.util.Scanner;

public class LabTask86{
    public static void main(String [] args){
	Scanner sc = new Scanner(System.in); 
	System.out.print("Enter a single word: ");
	String word = sc.nextLine();
	capitalizeLower_case_word(word);
		
	System.out.print("Enter a string: ");
	String st = sc.nextLine();
	String result = capitalize(st);
	System.out.print("Output: " + result);
	}

	public static void capitalizeLower_case_word(String word){
		System.out.println(Character.toUpperCase(word.charAt(0)) + word.substring(1));
		}
	
	public static String capitalize(String st){
		String result = "";
		for(int i = 0; i<=st.length()-1; i++){
			if((i == 0) || (st.charAt(i-1) == ' ')){
			result += Character.toUpperCase(st.charAt(i));
			}
			else {
			result += st.charAt(i);
			}
		}
		return result;
	}
    }