import java.util.*;
class TestObject{
	public static void main(String args[]){
		
		Data rec1 = new Data();
		Data rec2 = new Data();
		Data rec3 = new Data();
		
		Scanner ob = new Scanner(System.in);
		
		//System.out.println("Enter Name : ");
		rec1.name=ob.nextLine();
		rec1.subject=("java");
		rec1.roll=("2K13/cse/75");
		
		rec2.name=("Zain");
		rec2.subject=("C++");
		rec2.roll=("2K13/cse/79");
		
		rec3.name=("Anniel");
		rec3.subject=("Php");
		rec3.roll=("2K13/cse/78");
		
		System.out.println(rec1.name);
		System.out.println(rec1.subject);
		System.out.println(rec1.roll);
		System.out.println("");
		
		
		System.out.println(rec2.name);
		System.out.println(rec2.subject);
		System.out.println(rec2.roll);
		System.out.println("");
		
		System.out.println(rec3.name);
		System.out.println(rec3.subject);
		System.out.println(rec3.roll);
		System.out.println("");
		
		
		
		
		
	}
}