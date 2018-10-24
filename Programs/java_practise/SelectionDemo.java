import java.util.*;
class SelectionDemo{
	
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int value ;
	System.out.println("1) Addition ");
	
	System.out.println("2) Subtraction ");
	
	System.out.println("3) division ");
	
	System.out.println("4) Multiplication ");
	
	System.out.println("5) Remainder  ");	
	


	System.out.print(" Please enter the Selection : ");
	int sel = ob.nextInt();	
	
	System.out.print("enter the first value :");
	int v1= ob.nextInt();
	
	System.out.print("enter the Second  value :");
	int v2= ob.nextInt();
	

	
	if(sel==1){
	System.out.println("Addition :"+(v1+v2));
	}
	
	if (sel==2){
	System.out.println("Subtraction :"+(v1-v2));
	}
	
	
	if(sel==3){
	System.out.println("Division :"+(v1/v2));
	}
	
	if(sel==4){
	System.out.println("Multiplication :"+(v1*v2));
	}
	
	if(sel==5){
	System.out.println("Remainder :"+(v1%v2));
	}
	if(sel>5 || sel<=0){
	System.out.println("Illegal selection ");
	}
	
	}
}