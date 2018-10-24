//SimpleConstructor
import java.util.*;
class TestCons{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
	
		SimpleConstructor ob = new SimpleConstructor(0,0);
		ob.showZain();
		
		System.out.print("Enter Feet : ");
		int feet = sc.nextInt();
		
		System.out.print("Enter Inch : ");
		int inch = sc.nextInt();
		
		SimpleConstructor ob2  = new SimpleConstructor(feet,inch);
		ob2.showZain();
		
		SimpleConstructor ob3  = new SimpleConstructor(ob2.getFeet(),ob.getInch());
		ob3.showZain();
		
		System.out.println("********************* \n ");
		SimpleConstructor ob4  = new SimpleConstructor(ob3.getInch(),ob.getInch());
		ob4.showZain();
	}//end of main 
}