package Project1;

import java.util.Scanner;

public class LargestNumber {
	static int a,b,c;
	public static class large{
		public int largest(int a, int b, int c) {
			
			if(a>b && a>c) {
				System.out.println(a+" is greater");
				
			}
			else if(b>a && b>c) {
				System.out.println(b+" is greater");
			}
			
			else if(a == b && b == c && a == c) {
				System.out.println("All  values are Equal");
				
			}
			else 
				System.out.println(c+" is greater");
		
			return 0;
			
			
		}
		
		
	}
	
	
	public static void main(String[]args) {
		
		System.out.println("Enter any three integers");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		large l1 = new large();
		l1.largest(a, b, c);
		
	}
}
