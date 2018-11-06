import java.util.*;
class TestCalculator{
	public static void main(String args[]){
		calculator ob = new calculator();
		 int val = ob.add(10,3);
		 int val1 = ob.add(45,6);
		 int val2 = ob.sub(18,8);
		 double val3 =ob.div(19,4);
		 double val4 =ob.div(10,1);
		 
		 double sm =ob.sum(10,8);
		 //int sm1 = Integer.parseInt(ob.sum(55,5));
		 
		 System.out.println(""+val);
		 System.out.println(""+val1);
		 System.out.println(""+val2);
		 System.out.println(""+val3);
		 System.out.println(""+val4);
		 System.out.println(""+sm);
		 //System.out.println(""+sm1);
	}
}//end of class 