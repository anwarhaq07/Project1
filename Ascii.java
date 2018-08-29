package Project1;
import java.util.Scanner;


public class Ascii {

	static char a;
	 static int c;
	public static class ascci{

		public static int cast(char a) {

			  c = a;
			 
			  return  c;
		}
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Enter any character : ");
		
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(a);
		sc.close();
		
		ascci as = new ascci();
		as.cast(a);
		
		System.out.println("Ascci Value For "+ a +" is " + c);
		
	}
	
}
