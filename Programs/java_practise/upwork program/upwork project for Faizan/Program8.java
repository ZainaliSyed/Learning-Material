import java.util.*;
public class Program8{
	public static void main(String args[]){
		
		Scanner  ob = new Scanner(System.in);
		
		int age1 =0;
		int age2 =0;
		
		int num =0;
		
		
		while(true){
			
			if(num<=80){
				
				
				System.out.print("Enter age 1 : ");
				age1 = ob.nextInt();
			
				System.out.print("Enter age 2 : ");
				age2 = ob.nextInt();
				
				num = num+age1+age2;
				//System.out.println(" Num : "+num);
			}
			
			
			if(num>=80){
				System.out.println(" The combined ages add up to more than 110. ");
				break;
			}
			
			
		}
		
		
		
		
	}//end of main
}