import java.util.*;
class StringName{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	String name [] = {"Ali","Zain","Salman","Husnain"};
	boolean found =false;
	
	System.out.print("Which Name  You want to Find : ");
	String item = ob.next();
	int j;
		for(j=0; j<name.length; j++){
		
			if(item.equals(name[j]) ){
			found = true;
			System.out.println(" Name was  "+item);
			System.out.println(" Laotion is "+j);
			break;
			}
		}
		
		if(found ==false){
		System.out.println("Item not Found ...!!");
		}
	
	
	}
}