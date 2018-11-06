import java.util.*;
public class StringNameArray{
	public static void  main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	//String s = "";
	System.out.print("Please Enter The Name :");
	String s = ob.next();
	
	//String s1 = "";
	System.out.print("Please Enter The Name :");
	String s1 = ob.next();
	
	int code = s.compareTo(s1);
	
	if(code==0){
	System.out.print("Both Name are Equals");
	}
	
	if(code>1){
	System.out.print(s+" Name is Greater ");
	}
	
	if(code<0){
	System.out.print(s1+" Name is Small ");
	}
	
	
	
	
	}
}