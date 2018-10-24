import java.util.*;
class CompareThreeVal{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Please  enter the 1st value :");
	int v1 = ob.nextInt();
	
	System.out.print("Please  enter the 2nd value :");
	int v2 = ob.nextInt();

	System.out.print("Please  enter the 3rd value :");
	int v3 = ob.nextInt();
	
	if((v1>v2)&& (v1>v3) ){
		System.out.println("value 1 is greater ");
	}
	else if ((v2>v1)&& (v2>v3)){
		System.out.println("value 2 is greater ");
	}
	
	else if ((v3>v1)&& (v3>v2)){
		System.out.println("value 3 is greater ");
	}
	else if(v1==v2 && v2==v3){
	System.out.println("All  Values are Equal ...");
	}
	
	
	}
}