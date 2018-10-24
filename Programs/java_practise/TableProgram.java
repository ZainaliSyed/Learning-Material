import java.util.*;
	public class TableProgram {
	public static void  main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter no till which you want table :");
	int table = ob.nextInt();
	
	System.out.print("Please enter The upper Limit of Table :");
	int upperLimit = ob.nextInt();
	
		for(int i=1; i<=table; i++){
				System.out.println("");
				System.out.println("");
				
				for(int j=1; j<=upperLimit; j++){
				int result =i*j;
				System.out.println(""+i+" x" +j+" = "+result);

				}
			
		}
	
	}
	}