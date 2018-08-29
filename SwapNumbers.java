package Project1;
import java.util.Scanner;

public class SwapNumbers {
	static int a, b, temp;
	public static class swap{
		public int swap(int a, int b) {
			
			temp = a;
			a = b;
			b = temp;
			System.out.println("The Swapped Value is : "+ a +","+ b );
			
			return 0;
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any Two Integers : ");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		swap sw = new swap();
		sw.swap(a, b);
		
		;
		
	}

}
