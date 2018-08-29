package Project1;

import java.util.Scanner;

public class FloatingNumbers {

	static float a ,b,c;
	
	public static class multiply{
		public static float mul(float a, float b) {
		
			c = a*b;
			
			return c;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter any two decimal values :");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextFloat();
		b = sc.nextFloat();
		
		multiply m1 = new multiply();
		m1.mul(a, b);
		
		System.out.println("Multiplied Value :"+c);
		
	}
	
}
