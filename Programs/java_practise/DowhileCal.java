import java.util.*;
	public class DowhileCal{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int i=1 ,count=0;
	do{
	System.out.print("Please Enter The "+i+" No : ");
	int a =ob.nextInt();
	
	count +=a;
	i++;
	}while(i<=5);
	
	System.out.print("Sum of all The count :  "+count);
	
	
	
	}
	}