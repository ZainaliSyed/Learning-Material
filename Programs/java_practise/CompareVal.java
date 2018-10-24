// compareing value  without using the & operator 

import java.util.*;
class CompareVal{
 
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("enter the 1st value :");
	int v1 = ob.nextInt(); 
	System.out.print("enter the second value :");
	int v2 = ob.nextInt();
	System.out.print("enter the third  value :");
	int v3 = ob.nextInt();
	
	if(v1>v2){
	
			if(v1>v3){
	System.out.print("value 1 is  greater :");
	}
	}//v1  end 

	
	if(v2>v1){
	
		if(v2>v3){
	System.out.print("value 2 is greater");
	}
	}// v2 end
	

	if(v3>v1){
	
			if(v3>v2){
	System.out.print("value 3 is  greater ");
	}
	} //v3 end 
	
	if(v1==v2){
		if(v2==v3){
		System.out.print("All three value are equals ");
		}
	}// end of equals
	
	}
}