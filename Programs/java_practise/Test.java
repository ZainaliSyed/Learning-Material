import java.util.*;

class Test{
	public static void main(String arg[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = ob.nextInt();

		double root = Math.sqrt( num );
		
		System.out.println("Square root is : "+root);
		
		float num2 = 12.234f;
		
		int round = Math.round( num2 );
		
		System.out.println("Round : "+round);
		
		double d = Math.random() * 1000;
		
		System.out.println("Random Number : "+d);
		
		int i = (int) d;
		System.out.println("Random Number Integer : "+i);
		
		double cos = Math.cos(0);
		System.out.println("cos theta of 0 : "+cos);
		
		double sin = Math.sin(0);
		System.out.println("sin theta of 0 : "+sin);
		
		double tan = Math.tan(45);
		System.out.println("tan theta of 45 : "+tan);
		
		
		double acos = Math.acos(0);
		System.out.println("acos theta of 0 : "+acos);
		
		double asin = Math.asin(0);
		System.out.println("asin theta of 0 : "+asin);
		
	}

}