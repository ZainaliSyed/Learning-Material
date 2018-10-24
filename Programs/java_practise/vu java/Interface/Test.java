public class Test{
	
	public static void main(String args[]){
		
		Speaker s =null;
		System.out.println("Pointing to Politition ");
		s  = new Politician();
		s.speak();
		
		
		System.out.println("Pointing to Coach ");
		s = new Coach();
		s.speak();
		
		System.out.println("Pointing to Lecturer");
		s = new Lecturer();
		s.speak();
		
	}
	
}