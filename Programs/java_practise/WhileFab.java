import java.util.*;
	public class WhileFab{
	public static void main(String args[]){
	Scanner ob= new Scanner (System.in);
	
	int i=1, a=1,b=0,nexterm;
	System.out.print("Please Enter The UpperLimit Of Fabonic Series : ");
	int upperLimit = ob.nextInt();
	System.out.println("");
	System.out.print("0,");
	
	while(i<=upperLimit){
	
	nexterm= a+b;
	a=b;
	b=nexterm;
	System.out.print(""+nexterm+",");
	i++;
	
	}
	
	
	
	
	}
	}