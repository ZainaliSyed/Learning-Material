import java.util.*;
class FunctionPractise{
	
	public static int  myProg(){
		
		int a  =10 ;
		System.out.println("I am my Prog Method "+a);
		System.out.println("I am my Prog Method "+a);
		return a;
	}
	
	public static int myProg(int a){
		int b =10 ;
		System.out.println("I am my Prog Method "+a);
		for(int i=1; i<=10; i++){
			System.out.println(" i = "+i);
		}
		return a;
	}
	public static void main(String args[]){
		
		//Scanner ob = new Scanner(System.in);
		//FunctionPractise ob1  = new FunctionPractise();
		//ob1.myProg();
		
		//int row  = FunctionPractise.myProg(5);
		System.out.println("ROW : "+ FunctionPractise.myProg(5));
		
	}//end of main
}