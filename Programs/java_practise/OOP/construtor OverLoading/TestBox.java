public class TestBox{
	
	public static void main(String args[]){
		
		Box ob0 = new Box();
		ob0.display();
		
		Box ob1  = new Box(3);
		ob1.display();
		
		Box ob2 = new Box(3,4);
		ob2.display();
		
		Box ob3 = new Box(1,2,3);
		ob3.display();
		
		Box ob4  = new Box(1,2,"Zain");
		ob4.display();
	}
}//end of class