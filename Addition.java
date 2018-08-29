package Project1;

public class Addition {
	static int a,b,c;
	public static class addition {
		public static int add(int a, int b) {
			
			c = a+b;
			
			return c;
		}
	}
	
	public static void main(String[] args) {
		
		addition a1 = new addition();
		a1.add(2, 3);
		System.out.println("Added Value is "+c);
	}
	
	

}
