package Project1;

public class MethodOverride {
	
	public void eat() {
		System.out.println("Eating");
	}

	public static void main(String[]args) {
		
		MethodOverride o1 = new boy();
		o1.eat();
		
		
		
	}
}

class boy extends MethodOverride{
	
	public void eat() {
		System.out.println("Do not Eat");
	}
}
