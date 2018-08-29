package Project1;


public class HelloWorld {

	
	static int c;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		addition a1 = new addition();
        
        c = addition.add(4,5);
	
        System.out.println(c);
	
	}
	
	public static class addition{
		

		public static int add(int a, int b) {
	
	
			c = a+b;
	
			return c;
	
	}
		
		}
	
}
