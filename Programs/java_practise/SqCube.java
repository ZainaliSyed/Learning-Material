import java.util.*;
	class SqCube{
		public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int i; 
		
		System.out.print("Please Enter a Upper Limit value :");
		int upper= ob.nextInt();
			System.out.println("S no \t Square \t Cube");
			for(i=1; i<=upper; i++){
			int sq = i*i;
			int cube = i*i*i;
			System.out.println(""+i+"\t  "+sq+"\t\t   "+cube);
			}
			
			
		}
	}