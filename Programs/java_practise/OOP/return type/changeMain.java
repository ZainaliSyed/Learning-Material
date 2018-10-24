import java.util.*;
class changeMain{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		changeC b = new changeC();
		while(true){
			System.out.print("Enter Any Character : ");
			char ch = ob.nextLine().charAt(0);
		
			char testing = b.character(ch);
			System.out.println("The Letter is : "+testing);	
			
		}//end of while 
		 
	}//end of main 
}