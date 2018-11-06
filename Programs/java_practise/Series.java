import java.util.*;
	class Series{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please Enter The Upper Limit : ");
	int upperLimit = ob .nextInt();
	
		for(int i=1 ; i<=upperLimit; i++){
		int result = i*i*i;
		System.out.println(""+result);
		}
	
	}
	}
	