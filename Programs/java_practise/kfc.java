import java.util.*;
	public class kfc{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int i=1,bill =0 ,order=1;
	String choice = "" ,item="";
	do{
	
	System.out.println("1) for Burger 	    Rs : 160 ");
	System.out.println("2) for cold drink   Rs : 20");
	System.out.println("3) for Pizza 	    Rs : 500");
	System.out.println("4) for Sand Wich    Rs : 60");
	System.out.println("5) for french Fries Rs : 50");
	
	System.out.println("0) for bill");
	System.out.println("");
		
		do{
		System.out.print("Please Enter your "+i+" choice  order : ");
		choice = ob.next();
		i++;
		
			if(choice.equals("1")){
			bill = bill+160;
			item +="burger :Rs 160";
			System.out.println(" ");
			
			}
			
			else if(choice.equals("2")){
			bill = bill+20;
			item +="Cold Drink  :Rs 20";
			System.out.println(" ");
			}
			
			else if(choice.equals("3")){
			bill = bill+500;
			item +="Pizza :Rs 500";
			System.out.println(" ");
			
			}
			
			else if(choice.equals("4")){
			bill = bill+60;
			item +="Sand wich :Rs 60";
			System.out.println(" ");
			}
			else if(choice.equals("5")){
			 bill = bill+50;
			 item =choice+"French Fries :Rs 50";
			 System.out.println(" ");
			}
			
			else if (choice.equals("0")){
			System.out.println(" ");
				
			System.out.println("\n "+item+"\t \n");
			System.out.println(" ");	
				
			System.out.println(" Your Total Bill is :"+bill);
			break;
			
			
			} 	//  *********end of bill here  ...
			else{
			System.out.println(" \t  Invalid Selection for Order ...!!!  ");
			}
			
			
		}while(true);
		
			System.out.print("Do You Want To continue Y/N :");
			choice = ob.next();
			
			if(choice.equals("n") || choice.equals("N")){
			System.out.println(" Good Bye ..!!!");
			}
			
		
	}while(choice.equals("y") || choice.equals("Y")  ); //main Do while 
	
	
	}
	}