package Project1;

abstract class animal{
	
	public abstract void dog();
	
	public void animal() {
		System.out.println("Color is blue");
	}
	
}



public class abstrac extends animal {
	
	public void dog() {
		System.out.println("Barks");
	}
	
	public void animal() {
		System.out.println("Color is White");
	}
	
	public static void main(String[]args) {
		
		animal an = new abstrac();
	    an.dog();
		an.animal();
		
		
		
	}

}
