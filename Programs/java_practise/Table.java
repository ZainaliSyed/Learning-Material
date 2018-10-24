import java.util.*;
class Table{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int i;
	System.out.print("Please  enter the Table  You want :");
	int table= ob.nextInt();
	
	System.out.print("please enter Upper limit you want the table  to :");
	int upperLimit=ob.nextInt();
	
	for(i=1; i<=upperLimit; i++){
		System.out.println(table+"X"+i+"="+(table*i));
		}
	//System.out.print(table+"X"+i+"="+(table*i));
	}
}