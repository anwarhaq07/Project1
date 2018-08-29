package Project1;

import java.util.Scanner;

public class EvenOdd {
	
	static int a;
	
	public static class Numbers{
		public static int num(int a) {
			
			if(a%2 == 0) {
				
				System.out.println("Entered Value is Even");
				
			}else 
			{
				System.out.println("Entered Value is Odd");
			}
			
			return 0;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("Enter any Integer Value : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		Numbers n1 = new Numbers();
		n1.num(a);
	}

}
