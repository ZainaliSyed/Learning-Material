import java.util.*;
	class  ForNo{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter A No : ");
	int no = ob.nextInt();
	
		int i,j;
		for(i=1; i<=no; i++){
		
			for(j=1; j<=i; j++){
			System.out.print(j+"");
			}
			
			System.out.println();
		}
	
	}
	}
