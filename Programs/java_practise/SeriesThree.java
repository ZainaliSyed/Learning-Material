import java.util.*;
class SeriesThree{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Number :");
		int num = ob.nextInt();
		
		for(int i=4; i<=num; i=i+3){
			System.out.print(i+",");
				
		}
	}
}