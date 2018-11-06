import java.util.*;
	public class NestWhiletri{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter a No : ");
	int size = ob.nextInt();
	
	int r,i=1;
	
		int h=size;
		while(h>0){
		r=size;
		
		
			while(r>0){
			System.out.print(" *");
			//r=r-i;
			i++;
			}
			
		h--;
		System.out.println(" ");
		
	
		}
	
	}
	}