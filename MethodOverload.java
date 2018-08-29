package Project1;

public class MethodOverload {

	public int sum(int x, int y) {
		
		return (x + y);
	}
	
	public int sum(int x, int y, int z) {
		
		return(x+y+z);
		
	}
	
	public double sum(double x, double y) {
		return(x+y);
	}
	
	public static void main(String[] args) {
		
		MethodOverload mo = new MethodOverload();
		
		System.out.println(mo.sum(10, 20));
		
		System.out.println(mo.sum(10, 20, 30));
		
		System.out.println(mo.sum(20.1, 40.2));
		
	}
	
}
