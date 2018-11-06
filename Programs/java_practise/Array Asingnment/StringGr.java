import java.util.*;

class StringGr{

	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	//String name [] = new {"Ali","Salman","Kamran"}
	System.out.print("Please Enter The Size of array :");
	int size = ob.nextInt();
	
	String item = "";
	String name [] = new String[size];
	int k;
	for(k=0; k<name.length; k++){
	System.out.print("["+k+"] = ");
	item =ob.next();
	}
	
	int m;
	for(m=0; m<name.length; m++){
	System.out.println(""+item);
	
	
	}
	
	
	/*System.out.print("Please Enter The Name :");
	String  user = ob.next();
	
	
	String greater = name[0];
	int location = 0;
	
		int i;
		for(i=1; i<name.length; i++){
		
			if(name[i].length>greater){
			greater =name[i];
			location =i;
			
			}
		
		}
		
		System.out.println("The greater Name is :"+greater);
		System.out.println("The Location is "+location);
	
		*/

	}

}