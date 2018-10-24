import java.util.*;

class SumofNum{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int number = 1;
	int sum = 0;
	
	System.out.print("please Enter the upper limit you want :");
	int upperLimit = ob.nextInt();
	
	while(number<=upperLimit){
		sum = sum+number;
		number = number+1;
	}
	
	System.out.println("The sum of the "+upperLimit+"numbers  are : "+sum);
	
	}
}