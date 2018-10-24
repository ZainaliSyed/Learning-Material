import java.util.*;
class TestBox{
	public static void main(String arg[]){
		Scanner ob=new Scanner(System.in);
		System.out.print("Enter Any Value ");
		int a=ob.nextInt();
		
		Box ob1=new Box();
		ob1.display();
		
		Box ob2=new Box(a);
		ob2.display();
		
		Box ob3=new Box(ob2.getFeet(),a);
		ob3.display();
		
		
	
	
	}
	
	
}