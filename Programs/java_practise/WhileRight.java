import java.util.*;
	public class WhileRight{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please enter a No greater Than 3 :");
	int no = ob.nextInt();
	int i=1,j=1 ;
	
	
	if(no>3){
		while(i<=no){
		
		System.out.print("*");
		i++;

		
		
		
		}	//end of outter loop
		System.out.println();
		System.out.println("****");
		System.out.println("***");
		System.out.println("**");
		System.out.println("*");
	
	}
	else {
	System.out.println("The no should  be greater then 3");
	}
	
	}
	}