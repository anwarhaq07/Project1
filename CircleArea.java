package Project1;

import java.util.Scanner;

public class CircleArea {
	
	static double r, A;
	
	public static class area{
		public double circle(double r) {
			
			A = (Math.PI) * r * r;
			
			return A;
		}
	}
	
	
	
	public static void main(String[]args) {
		
		System.out.println("Enter radius of a Circle");
		
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		
		area a1 = new area();
		a1.circle(r);
		
		System.out.println("Area of a circle for given radius is "+A);
		
	}

}
