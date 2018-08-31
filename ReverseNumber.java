package Project1;

import java.util.Scanner;

public class ReverseNumber {

	static int n;
	public static class Number{
		public int num(int n) {
			
			int num = 0;
			
			try {
			while(n!=0) {
				
				num = num*10;
				num = num + n % 10;
				n = n/10;
				
			}
			System.out.println(num);
			}
			catch(Exception e) {}
			
			

			return 0;
		}
	}
	
	public static void main (String[]args) {
		
		System.out.println("Enter any Number ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		
		Number n1 = new Number();
		n1.num(n);
		
		
	}
}
