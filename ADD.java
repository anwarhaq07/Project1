package Project1;
import java.util.Scanner;
public class ADD {
	static int a,b,c;
	public static class addition{
		public static int add(int a, int b) {
			c = a+b;
			
			return c;
		}
		
		
	}
	public static void main(String[] args) {
		
		System.out.println("Enter any two integers :");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		
		
		addition a1 = new addition();
		a1.add(a, b);
		
		System.out.println("The Added Value is "+c);
		
		
		
	}

}
