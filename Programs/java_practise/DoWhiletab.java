import java.util.*;
	public class DoWhiletab{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int i=1,result;
	String answer = "";
	
	
	do{
	System.out.print("Please Enter Table : ");
	int table =ob.nextInt();
	
	System.out.print("Please Enter Counter :");
	int counter = ob.nextInt();
	
		do{
		result = table*i;
		System.out.println(table+"x"+i+"="+result);
		i++;
		
			
			if(i%10==0){
				
					
					System.out.print("Do you Want to Continue Y/N : ");
					answer =ob.next();
	
			continue;
			}
		
		}while(i<=counter );
		
					System.out.print("Do you Want to Continue Program Y/N : ");
					answer =ob.next();
				
				if(answer.equals("n")){
				System.out.println(" Good Bye  ...!!");
				break;
				}
		
	}while(answer.equals("y"));
	
	
	
	}
	}
