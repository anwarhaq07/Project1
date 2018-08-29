package Project1;
import java.util.Scanner;

public class SumNaturalNumber {

	static int n;
	
	public static class sum{
		public int sum(int n) {
			
			int a;
			
			a = (n *(n + 1))/2;
			
			System.out.println("Sum of Given number is " +a );
			
			return 0;
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any number for it's sum");
		
		Scanner sc = new Scanner(System.in);
				n = sc.nextInt();
				
		sum s1 = new sum();
		s1.sum(n);
				
				
	}
	
}
