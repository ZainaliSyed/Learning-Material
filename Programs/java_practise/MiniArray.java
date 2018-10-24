import java.util.*;
	public class MiniArray {
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int select, i;
	int last =0, inder =1;
	int small = 0 ,inderSmall = 1;
	
	
	
	do {
	System.out.println("");
	System.out.println("1) New Array ");
	System.out.println("2) Traverse");
	System.out.println("3) Greater ");
	System.out.println("4) Lesser ");
	System.out.println("5) Search ");
	System.out.println("6) Exit ");
	System.out.println(" ");
	
	System.out.print("Please Enter The Selection :");
	select = ob.nextInt();
	
		if(select==1){
		System.out.print(" Please Enter The Size of Array :");
		int size = ob.nextInt();
		int [] arr = new int [size];
			for(i=0; i<arr.length; i++){
			System.out.print("Please Enter "+(i+1)+" Element :");
			arr[i] = ob.nextInt();
			
			last = arr.length;
			if(arr[i]>last){
			last =arr[i];
			inder = i;
			} //greater no end here 
			
			small =arr[0];
			if(arr[i]<small){
			small = arr[i];
			inderSmall = i;
			}
			
			}
		
		
		do{
		System.out.println("");
	System.out.println("1) New Array ");
	System.out.println("2) Traverse");
	System.out.println("3) Greater ");
	System.out.println("4) Lesser ");
	System.out.println("5) Search ");
	System.out.println("6) Exit ");
	System.out.println(" ");
		
		System.out.print("Please Enter The Selection :");
		select = ob.nextInt();
		
		if(select==1){
		
		System.out.println("Sorry You Must Select 2 Option Or Exit Program " );
		}
		
		if(select==2){
		
		System.out.println(" Your Element was  ");
			for(int k=0; k<arr.length; k++){
			System.out.println(""+arr[k]);
			}
		}//end of select==2 here
		
		if(select==3){
		
		System.out.println("Your Greater No is :" +last);
		}
		
		if(select==4){
		
		System.out.println("Your Smaller  No is :" +small);
		}
		
		if(select==5){
		
		System.out.println("Please Enter A no You Like : ");
		int search = ob.nextInt();
		int s;	
			for(s =0; s<arr.length; s++){
			
				if(arr[s]==search){
				System.out.print(" The no has found ");
				break;
				}
			}//
			if(s==arr.length){
			System.out.println(" Sorry  The no has  not found ");
			}
		}// end of select==5
		
		if(select>6){
		System.out.print("Invalid Operator  ...");
		}
		
		//System.out.println("Sorry You Must Select 2 Option Or Exit Program " );
		}while(select==1|| select==2 || select==3 || select==4 || select==5 || select>6);
		
		
		} //end of select==1 here 
		
		
	
	
	else if(select>=2){
	System.out.println(" You Must Select option 1 First .. Sorry ");
	}	
	}while(true); //menu do while  
	
	
	}
	}