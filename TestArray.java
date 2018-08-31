package Project1;
import java.util.Scanner;
import java.util.Arrays;

public class TestArray {
	
	public static void main(String[]args) {
		
		
		
		System.out.println("Enter size for an array ");
		
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] myarray = new int [length];
		
		System.out.println("Enter values to insert ");
		
		for (int i = 0; i<myarray.length; i++) {
			
			myarray[i] = sc.nextInt();
			
		}
		System.out.println(Arrays.toString(myarray));
	}

	}
