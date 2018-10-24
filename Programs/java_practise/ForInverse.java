import java.util.*;
	class ForInverse{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter A No : ");
	int no = ob.nextInt();
		
		int i,j;
		for(i=1; i<=no; i++){
		
			for(j=no; j>=i; j--){
			System.out.print("*");
			}
			
			System.out.println();
		}
	}
	}