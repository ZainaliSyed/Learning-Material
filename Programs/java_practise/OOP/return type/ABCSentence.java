import java.util.*;
class ABCSentence{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		System.out.print("Enter Any Character : ");
		char ch = ob.nextLine().charAt(0);
		
		Character object = new Character();
		String s =object.sentence(ch);
		System.out.println(s);
		
	}//end of main method 
}