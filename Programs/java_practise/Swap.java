import java.util.*;
	public class Swap{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("please Enter The  Value  ' A ' :");
	int a = ob.nextInt();
	
	System.out.print("Please Enter The Value 'B '  :");
	int b = ob.nextInt();
	
	int c ;
	c=a;
	a=b;
	b=c;
	
	System.out.println("");
	System.out.println("");
	System.out.println("Now The Value of 'A ' is :"+a);
	System.out.println("Now The Value of 'B ' is :"+b);
	
	
	}
	}