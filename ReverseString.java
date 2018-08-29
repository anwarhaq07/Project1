package Project1;


import java.util.Scanner;

public class ReverseString {
	static String s1;
	
	public static class reverse{
		public  String str(String s1) {
			
			String s = "";
			
			int s2 = s1.length();
			try {
			for(int i = s2-1; i <= s2 ;i--) {
				
				char ch = s1.charAt(i);
				
				s =s + ch;
				
				
				
			}
			
			}catch(Exception e) {}
			System.out.println(s);
			return s1;
		}
		
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any String "); 
		Scanner sc = new Scanner(System.in);
		//sc.close();
		
		s1 = sc.next();
		
		reverse r1 = new reverse();
		r1.str(s1);
	}

}
