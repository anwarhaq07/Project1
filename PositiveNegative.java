package Project1;

import java.util.Scanner;

public class PositiveNegative {

	static int a;
	
	public static class pos{
		public int neg(int a) {
			
			if (a>0) {
				System.out.println("Entered Value is Positive");
				
			}else if (a == 0){
				System.out.println("Entered Value is neither positive nor negative");
			
			}else if(a<0) {
				System.out.println("Entered value is negative");
			}
			
			
			return 0;
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any integer");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		pos p1 = new pos();
		p1.neg(a);
		
	}
}
