import java.util.*;
class Factorial{

	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int i,num =1 ,fact=1;
	System.out.print("Please enter no Factorial you like: ");
	num = ob.nextInt();
	
	for(i=2; i<=num; i++){
	fact =fact*i;
	}
	
	System.out.print("Factorial answer is :"+fact);
	}
}