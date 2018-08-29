package Project1;



public class InterfaceExample {

	
	interface pet{
		public void name();
		public void color();
		
	}
	
	 static class animal implements pet{
		 
		 public void name() {
			 
			 System.out.println("Name is Rex");
			 
		 }
		 public void color() {
			 
			 System.out.println("Color is Black");
			 
		 }
		 
	 }
	 
	 public static void main(String[]args) {
		 
		 pet p = new animal();
		 p.name();
		 p.color();
		 
	 }
	 
}
