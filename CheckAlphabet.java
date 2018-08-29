package Project1;
import java.util.Scanner;

public class CheckAlphabet {
	
	static char a;
	
	public static class alpha{
		public char alph(char a) {
			
			if(a >= 'a' && a<='z' || a >= 'A' && a <='z') {
				System.out.println("Entered value is alphabet");
				
			}else
				System.out.println("Entered value is not an alphabet");
			
			return 0;
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any alphabet");
		
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		
		alpha a1 = new alpha();
		a1.alph(a);
	}

}
