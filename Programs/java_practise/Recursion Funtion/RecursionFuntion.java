import java.util.*;
public class RecursionFuntion{
	
	Scanner ob = new Scanner(System.in);
	int e = 0;
	int o=1;
	RecursionFuntion(){
		
		
		System.out.print("Enter Number to  Choice :");
		int select = ob.nextInt();
		
		if(select==1){
			
			evenMethod();
		}
		if(select==2){
			oddMethod();
		}
		
		System.out.println("Exit");
	}//end of cons
	
	public static void main(String args[]){
		
		RecursionFuntion rf = new RecursionFuntion();
	}//end of main
	
	 void evenMethod(){
		
		System.out.println("Even numbers :"+e);
		if(e>=100){
			return;
		}
		e=e+2;
		evenMethod();
	}

	void oddMethod(){
		
		System.out.println("Odd numbers :"+o);
		if(o>=100){
			return;
		}
		o=o+2;
		oddMethod();
	}
	
}//end of class