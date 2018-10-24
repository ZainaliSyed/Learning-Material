import java.util.*;

	public class ForTable{
		public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int i ;
		System.out.print("please Enter The Table You want : ");
		int table = ob.nextInt();
		
			for(i=1; i<=10; i++){
			int result = table*i;
			System.out.println(table+"x"+i+"= "+result);
			}
	}
	}