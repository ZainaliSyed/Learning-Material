import java.util.*;
	public class WhiletwoTri{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter the Odd No :");
	int no =ob.nextInt();
	int i=1,mid,result,j,k;
	while(i<=no){
	
	System.out.print("   *");
	
	i++;
	
	
		for(j=1; j<=no; j++){
		
			for(k=1; k<=j; k++){
			result = no/2;
			mid =result+1;
			
		
			i=i+2;
			System.out.print("*");
			
			}
			System.out.println("");
	
		}
		/*if(i==no){
		result = no/2;
		mid =result+1;`
		i++;
		
		i=i+2;
		System.out.print(""+mid);
		System.out.print("1*");
		}*/
	}
	
	while(i==0){
			result = no/2;
		mid =result+1;
		i++;
		
		i=i+2;
		System.out.print(""+mid);
		System.out.print("1*");
	}
	
	
	}
	}