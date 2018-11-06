import java.util.*;
class PosiNegi{
	public static void main(String args[]){
	Scanner ob = new  Scanner(System.in);
	System.out.print("Please  enter the  number :");
	int no = ob.nextInt();
	if(no>=0){
	System.out.print("your Number :  "+no+" is  Positive : ");
	}
	else 
	System.out.print("your Number  :"+no+" is negative :");
		}
}