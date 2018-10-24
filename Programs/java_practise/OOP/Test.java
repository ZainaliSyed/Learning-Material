import java.util.*;
class Test{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		calc ob = new calc();
		
		int fst =0;
		int sec=0;
		System.out.print("Enter 1st Number : ");
		fst=s.nextInt();
		
		System.out.print("Enter 2nd Number :");
		sec =s.nextInt();
		
		ob.add();
		System.out.println(""+(fst+sec));
		
		ob.sub();
		System.out.println(""+(fst-sec));
		ob.mul();
		System.out.println(""+(fst*sec));
	}
}