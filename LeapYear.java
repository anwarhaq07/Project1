package Project1;
import java.util.Scanner;
public class LeapYear {
	static int a;
	
	
	public static class year{
		public int year(int a) {
			
			boolean leap = false;
			
		
			if(a % 4 == 0) {
				
				
				if(a % 100 == 0) {
					
					
					if(a % 400 == 0) {
						
						leap = true;
						
					}else leap = false ;
					
				}else leap = true;
			
			}else leap = false;
			
			if(leap){
				System.out.println(a+" is a leap year");
			}
			else
				System.out.println(a+" is not a leap year");
			
			return 0;
			
		}
	}
	
	public static void main(String[]args) {
		
		System.out.println("Enter any year : ");
		
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		
		year y1 = new year();
		y1.year(a);
	}

}
