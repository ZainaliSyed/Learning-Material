import java.util.*;
	public class Fabonic {
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int sum=0,i,num=1 ;
	System.out.print("Please Enter The Upper Limit : ");
	int upperLimit = ob.nextInt();
		
		for(i=1/*,num=1,sum=0*/; i<=upperLimit; i++,sum=num+sum,num=num+1){
				
				
		/*sum =0;
		num = 1;
		num = num+1;
		sum = num+sum;*/
	
		System.out.println(""+i+") "+sum);
		}
		
	
	}
	}