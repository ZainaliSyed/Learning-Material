import java.util.*;
	public class WhilePrime{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int i=1;
	int no,prime=1;
	
	System.out.print("Please Enter The Upper Limit :");
	no =ob.nextInt();
	while(i<=no){
	 
		for(i=2; i<=no; i++){
			if((prime = no%i)==0){
			i++;		
			
			}
		
		}
		
		if(i==2){
		System.out.print(""+prime);
		}
			
	}
	
	
	}
	}