import java.util.*;
	public class ArrayTowDemo{
	public static void main(String args[]){
	
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter the size of Array : ");
	 int size = ob.nextInt();
	 int [] i = new int[size];
	 int j;
	int sum =0; 
		for(j=0; j<i.length; j++){
		
		System.out.print((j+1)+" Element :");
		i[j] = ob.nextInt();
		sum = sum+i[j];
		
		}
		System.out.println("Your  Elements are ");
		
		for(int k=0; k<i.length; k++){
		System.out.println(i[k]);
		
		
		}
		
		System.out.print("The Sum of all The Element are : "+sum);
	
	}
	}