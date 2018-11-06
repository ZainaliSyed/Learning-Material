import java.util.*;
class Dowhile{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int z, i=0;
	int c[10];
	System.out.print(" Gussing Game ");
		
		
		do{
		System.out.print("Please enter the number :");
		z = ob.nextInt();
		if (z!=-1){
		c[i]=z;
		}
		i++;
		}while(z!=-1 && i<10);
		System.out.print("The  total number entered by the user are :"+i-1);
		
		
		}
	
}