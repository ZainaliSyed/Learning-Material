import java.util.*;
	public class DowhileMini{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int i=1,j=1,menu,choice,val1,val2,result;
	String select;
	do{
	System.out.println("1) Calulator ");
	System.out.println("2) Trolly Load ");
	System.out.println("3) Mark Sheet");
	System.out.println("4) Basic pay ");
	System.out.println("5) Season");
	System.out.println("6) Convertor");
	System.out.println("7) exit");
	System.out.println("");
	
	System.out.print("Please Enter Your Selection :");
	select = ob.next();
	
	
	//i++;
	//break;
		
		
		if(select.equals("1") || select.equals("y")||select.equals("Y")){
			do{
			System.out.println("1) Menu ");
			System.out.println("2) operator");
			
			System.out.print("Please Enter Choice : ");
			choice = ob.nextInt();
			
				do{
				System.out.println("1) Addition ");
				System.out.println("2) Subtration ");
				System.out.println("3) Division ");
				System.out.println("4) Multiplication ");
				System.out.println("5) Remainder ");
				
				System.out.print(" Please Enter Your Choice : ");
				menu = ob.nextInt();
				
					if(menu==1){
					System.out.print("Please Enter The 1st Value :");
					val1 = ob.nextInt();
					System.out.print("Please Enter The 2nd Value :");
					val2 = ob.nextInt();
					result= val1+val2;
					System.out.println("Addition Will be  :"+result+"\n");
					System.out.print("Do You Want To Continue  Y/N :  ");
					select = ob.next();
					
					
					if(select.equals("y")|| select.equals("Y")){
					//System.out.print("Please Enter Choice : ");
			        //choice = ob.nextInt();
					//continue;
					
					}
					
					
					else if(select.equals("n")|| select.equals("N")){
					
					System.out.print("Good Bye ...!! ");
					break;
					}
							
							
							//break;	//******String break
							
							
					}//end of menu==1
				
				
				}while(menu>5);	//*********** End of Menu here  
			
			}while(select.equals("1")); System.out.print("");
			//******* End of Choice here 
			
			//System.out.print("Invalid Selection ...!!");
		}
		
		
		
	}while(select.equals("m"));
	
	
	}
	}