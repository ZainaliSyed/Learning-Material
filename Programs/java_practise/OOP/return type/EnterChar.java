import java.util.*;
class EnterChar{
	public static void main(String args[]){
		
		Scanner ob = new Scanner(System.in);
		ReturnString meth = new ReturnString();
		
		 System.out.println(" ************ 0 To Exit  ************** \n ");
		while(true){
			System.out.print("Enter Any Character : ");
			char ch = ob.nextLine().charAt(0);
		
			String testing = meth.Sentence(ch);
			System.out.println(testing);	
			
			if(ch=='0'){
				System.exit(0);
				//break;
			}
		}
		
	}//end of main 
	
}//end of class