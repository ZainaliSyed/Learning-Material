import java.util.*;


	class ret{
		
		int add(int a,int b){
		int result =a+b;
		return result;
		}
	}
	class ReturnType{
		
		
		public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		
		
		
		ret ob = new ret();
		/*System.out.print("Enter 1st no :");
		int a= obj.nextInt();
		System.out.print("Enter 2nd no :");
		int b= obj.nextInt();
		
	    int result = ob.add();
		System.out.println("Result is :"+result); */
		
		int a= ob.add(5);
		int b= ob.add(4);
		
		System.out.print("Addition :"+result);
		
		}
	}
	