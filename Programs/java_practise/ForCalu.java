import java.util.*;
	public class ForCalu{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int val1 ,val2,result;
	
	
	for(int i=1; ; i++){
	System.out.println("");
	System.out.println("1)	Menu");
	System.out.println("2)	operator");
	
	System.out.print("Please Enter Your Selection :");
	int option = ob.nextInt();
	
	if(option==1){	
	
	System.out.println("1) Addition  ");
	System.out.println("2) Subtraction");
	System.out.println("3) Multiplication");
	System.out.println("4) Division");
	System.out.println("5) Remainder");
	System.out.println("");
	
	
	
	System.out.print("Please Enter A choice :");
	int select = ob.nextInt();

	
			for(int j=1; ; j++){
			if(select==1){
			System.out.print("please Enter 1 value :");
			val1 = ob.nextInt();
			
			System.out.print("please Enter 2 value :");
			val2 = ob.nextInt();
			result =val1+val2;
			System.out.print("Additionn wIL be : "+result);
			
			System.out.println("");
			System.out.print("Do you Want To continue more Calulation  Y/N  ");
			String answer = ob.next();
			
				if(answer.equals("y")|| answer.equals("Y")){
				
				
				
				//System.out.print("Please Enter Your Selection :");
				//option = ob.nextInt();
				continue;
				
				
				}
				
				if(answer.equals("n")||answer.equals("N")){
				
				System.out.print("	Good Bye ...!!!");
				System.exit(0);
				break;
				}
				
				//else{
				//System.out.println(" You have enter Invalid selection ..!!!");
				//}
				
			
			break; // string break
			
			
			}
	
	
										//*******************SELECT TWO STRAT HERE ***********
			
			if(select==2){
			System.out.print("please Enter 1 value :");
			val1 = ob.nextInt();
			
			System.out.print("please Enter 2 value :");
			val2 = ob.nextInt();
			result =val1-val2;
			System.out.print("subtraction wIL be : "+result);
			
			System.out.println("");
			System.out.print("Do you Want To continue more Calulation  Y/N  ");
			String answer = ob.next();
			
				if(answer.equals("y")|| answer.equals("Y")){
				
				
				
				//System.out.print("Please Enter Your Selection :");
				//option = ob.nextInt();
				continue;
				
				
				}
				
				if(answer.equals("n")||answer.equals("N")){
				
				System.out.print("	Good Bye ...!!!");
				System.exit(0);
				break;
				}
				
				//else{
				//System.out.println(" You have enter Invalid selection ..!!!");
				//}
				
			
			break; // string break
			
			
			}// end of select==2
			
			
			
			
			
										//*******************SELECT THREE STRAT HERE ***********
			
			if(select==3){
			System.out.print("please Enter 1 value :");
			val1 = ob.nextInt();
			
			System.out.print("please Enter 2 value :");
			val2 = ob.nextInt();
			result =val1*val2;
			System.out.print("Multilication wIL be : "+result);
			
			System.out.println("");
			System.out.print("Do you Want To continue more Calulation  Y/N  ");
			String answer = ob.next();
			
				if(answer.equals("y")|| answer.equals("Y")){
				
				
				
				//System.out.print("Please Enter Your Selection :");
				//option = ob.nextInt();
				continue;
				
				
				}
				
				if(answer.equals("n")||answer.equals("N")){
				
				System.out.print("	Good Bye ...!!!");
				System.exit(0);
				break;
				}
				
				//else{
				//System.out.println(" You have enter Invalid selection ..!!!");
				//}
				
			
			break; // string break
			
			
			}// end of select==3
			
			
			
													//*******************SELECT FOUR STRAT HERE ***********
			
			if(select==4){
			System.out.print("please Enter 1 value :");
			val1 = ob.nextInt();
			
			System.out.print("please Enter 2 value :");
			val2 = ob.nextInt();
			result =val1/val2;
			System.out.print("Divission wIL be : "+result);
			
			System.out.println("");
			System.out.print("Do you Want To continue more Calulation  Y/N  ");
			String answer = ob.next();
			
				if(answer.equals("y")|| answer.equals("Y")){
				
				
				
				//System.out.print("Please Enter Your Selection :");
				//option = ob.nextInt();
				continue;
				
				
				}
				
				if(answer.equals("n")||answer.equals("N")){
				
				System.out.print("	Good Bye ...!!!");
				System.exit(0);
				break;
				}
				
				//else{
				//System.out.println(" You have enter Invalid selection ..!!!");
				//}
				
			
			break; // string break
			
			
			}// end of select==4
			
			
			
			
								//*******************SELECT FIVE STRAT HERE ***********
			
			if(select==5){
			System.out.print("please Enter 1 value :");
			val1 = ob.nextInt();
			
			System.out.print("please Enter 2 value :");
			val2 = ob.nextInt();
			result =val1%val2;
			System.out.print(" Remainder wIL be : "+result);
			
			System.out.println("");
			System.out.print("Do you Want To continue more Calulation  Y/N  ");
			String answer = ob.next();
			
				if(answer.equals("y")|| answer.equals("Y")){
				
				
				
				//System.out.print("Please Enter Your Selection :");
				//option = ob.nextInt();
				continue;
				
				
				}
				
				if(answer.equals("n")||answer.equals("N")){
				
				System.out.print("	Good Bye ...!!!");
				System.exit(0);
				break;
				}
				
				//else{
				//System.out.println(" You have enter Invalid selection ..!!!");
				//}
				
			
			break; // string break
			
			
			}// end of select==5	
	
	
		}	// end of for option==1
		
		
		
		
			
			
	
		
	}// end of menu */ 
	
	}	//end of asking option
	
	}
	}