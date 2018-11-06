import java.util.*;
class TestFrame{
	
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.println("1) Black");
		System.out.println("2) Blue");
		System.out.println("3) Gray");
		System.out.println("4) Yellow");
		System.out.println("Enter Selection : ");
		int select = ob.nextInt();
		
		if(select==1){
			FrameColor ob1 = new FrameColor(select);	
		}
		else if(select==2){
			FrameColor ob2 = new FrameColor(select,5);	
		}
		else if(select==3){
			FrameColor ob3 = new FrameColor(5.5,select);	
		}
		else if(select==4){
			FrameColor ob4 = new FrameColor("zain",select);
		}
		
		
	}//end of main Method 
	
}