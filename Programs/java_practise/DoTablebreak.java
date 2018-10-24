import java.util.*;
	public class DoTablebreak{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter The Table : ");
	int table = ob.nextInt();
	
	int i,j;
	
	
	for( i=1; i<=table; i++){
		
		for( j=1; j<=10; j++){
		int result=i*j;
		System.out.println(i+"x"+j+"= "+result);
		
		
			}
			
			System.out.print("Do You Want To continue Y/N : ");
			String answer = ob.next();
		
			if(answer.equals("Y")|| answer.equals("y")){
			
					/*	for(i=table; i>table;  ){
						System.out.print("Program End  ....");
						}	 */
			}
			
			if(answer.equals("n")|| answer.equals("N")){
			System.out.print("Good Bye ...!!");
			break;
			
			
			
		}
			
						
	}
	
	
	}
	}