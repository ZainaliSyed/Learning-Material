import java.util.*;


class PowerFunction{
	
	 public static double raiseToPow(double x , int power){
		double result;
		int i;
		result=1.0;
			for(i=1; i<=power; i++){
			result*=x;
			}
		return result;
	}
	
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("please enter the number :");
	double number = ob.nextDouble();
	
	System.out.print("please enter the power you want :");
	int power = ob.nextInt();
	
	double FunReult = raiseToPow(x,power);
	System.out.print("your number is :"+x+"your power is"+power+" is  Equal to ="+FunReult);
	}
}