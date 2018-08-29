package Project1;
import java.util.Scanner;

public class Alphabet {
	static char a;
	public static class alpha{
		public char alpha(char a) {
			
			if (a == 'a' || a == 'e'|| a == 'i'|| a == 'o' || a == 'u' || a =='A' || a == 'E' || a =='I' || a == 'O' || a == 'U' )
			{
				System.out.println("Given Alphabet is Vowel ");
			}
			
			else if(a>='a' && a<='z' || a>='A' && a<= 'Z') {
				System.out.println("Given Alphabet is Consonant");
			}
			
			else
				System.out.println("Entered Value is Not an Alphabet");
			
			return 0;
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any Alphabet ");
		
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		
		alpha a1 = new alpha();
		a1.alpha(a);
	}

}
