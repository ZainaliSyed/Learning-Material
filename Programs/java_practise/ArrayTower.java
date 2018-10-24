import java.util.*;
	public class ArrayTower{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	
	System.out.print("Please Enter The Size of Array : ");
	int a = ob.nextInt();
	
	int [] i = new int[a];
	//int totalSize = i.length;
	int j,sum=0,element;
	
	for(j=1; j<=a; j++ ){
	
	System.out.print(j+") "+" Please Enter "+j+" Element : ");
	element = ob.nextInt();
	
	
	i[j] =element; 
	

		sum = sum+i[j];	

		}
		
			System.out.println("\n Your Seleted  Array was  ");
					for(int k=1; k<=j; k++ ){
					
					System.out.println(""+i[k]);
						 
						} 	//end of k loop here 

		
				System.out.print("There sum is :"+sum);
	
	
	}
	}