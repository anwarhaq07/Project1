package Project1;

import java.util.Scanner;

public class QuadraticEquation {

	static int a,b,c;
	static double root1,root2,d;
	
	public static class root{
		public int root(int a, int b,int c) {
			
			d = b * b - 4 * a * c;
			
			if (d > 0) {
				
				System.out.println("Roots are real and unequal");
				
				root1 = (- b + Math.sqrt(d))/(2 * a);
				
				root2 = (- b - Math.sqrt(d))/(2 * a);
				
				System.out.println("First root is "+root1);
				System.out.println("Second root is "+root2);
				
			}
			
			else if(d == 0) 
			{
				System.out.println("Roots are real and equal");
				
				root1 = (b + Math.sqrt(d)/(2 * a));
				
				System.out.println("Root is "+root1);
				
			}
			else
			
				System.out.println("Roots are imaginary");
			
			return 0;
			
		}
	}
	
	
	public static void main(String[]args) {
		
		System.out.println("Enter any three integers : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		root r1 = new root();
		r1.root(a, b, c);
		
		
	}
	
}
