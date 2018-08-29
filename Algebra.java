package Project1;
import java.util.Scanner;

public class Algebra {
	static int a,b,c;
	
	
	
	
	
	// ADDITION
	public static class addition{
		public static int add(int a, int b) {
			
			c = a + b;
			
			return c;
		}
		
	}
		
		//SUBSTRACTION
		public static class substraction{
			public static int sub(int a, int b) {
			
				c = a - b;
				
				
				return c;
			}
		}
		
		//DIVISION
		public static class division{
			public static int div(int a, int b) {
				
				c = a/b;
				
				return c;
			}
		}
		
		
	
		//MULTIPLICATION
		public static class multiplication{	
			public static int mul(int a, int b) {
			
			c = a * b;
			
			return c;
		}
		
	}
		public static void main(String[] args) {
			
			System.out.println("Enter The Numbers");
			
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			
			
			
			addition a1 = new addition();
			a1.add(a, b);
			System.out.println("Adding Values "+ c);
			
			substraction s1 = new substraction();
			s1.sub(a,b);
			System.out.println("Substracting values "+ c);
			
			multiplication m1 = new multiplication();
			m1.mul(a, b);
			System.out.println("Multipling Values "+ c);
			
			division d1 = new division();
			d1.div(a, b);
			System.out.println("Dividing Values "+ c);
			
			
		}

}
