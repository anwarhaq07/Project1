package Project1;

public class UsingTryCatch {

	
	public static void main(String[]args) {
		
		int d = 0;
		int n = 20;
		
		try {
			int fraction = n/d;
			
			System.out.println("executed value is"+ fraction);
			
			System.out.println("This Line will not Be Executed");
		
		}catch (ArithmeticException e) {
			
			System.out.println("End of Main");
		}
	}
}
