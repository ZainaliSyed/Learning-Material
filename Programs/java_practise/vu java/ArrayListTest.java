//student class
import java.util.*;
public class ArrayListTest{
	public static void main(String args[]){
				
		ArrayList<Students> al = new ArrayList<Students>();
		
		Students s1 = new Students("Zain",79);
		Students s2 = new Students("Salman",55);
		Students s3  = new Students("Ali",94);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		boolean b = al.isEmpty();
		if(b==true){
			System.out.println("ArrayList is Empty .. ");
		}
		else{
			int size = al.size();
			System.out.println("Array List Size : "+size);
		}
		
		for(int i=0; i<al.size(); i++){
			Students s = (Students)al.get(i);
			s.print();
		}
	}//end of main
}