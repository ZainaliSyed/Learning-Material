import java.util.*;
	public class ForCountertab{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	String ans = "";
	System.out.print("Please Enter  The table : ");
	int table = ob.nextInt();
	
	System.out.print("Please Enter Counter :");
	int counter = ob.nextInt();
	
	for(int i=1; i<=counter; i++){
	
	int result =table*i; 
	System.out.println(table+"x"+i+"= "+result);
	
	
		if(ans.equals("y")){
		continue;
		}
	}
	
	System.out.print("do you continue Y/N : ");
	 ans = ob.next();
	
	
	
	}
	}