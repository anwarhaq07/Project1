package Project1;
import java.util.Scanner;

public class Palindrome {
	
	public static void main(String[]args) {
		
		String s;
		String rev ="";
		
		System.out.println("Enter any String ");
		
		Scanner sc = new Scanner(System.in);
		
		s = sc.nextLine();
		try {
		for(int i = s.length()-1; i<=s.length(); i--) {
			
			char ch = s.charAt(i);
			
			 rev = rev + ch;
		} 
		}catch(Exception e) {
		System.out.println("Reverse of a given String is "+ rev+"\n");
		
		}

	if(s.equals(rev)) {
		
		System.out.println("Entered string is palindrome\n");
		
	}
	else 
		
		System.out.println("Entered String is not a palindrome");
	
	
	}
	
	

}
