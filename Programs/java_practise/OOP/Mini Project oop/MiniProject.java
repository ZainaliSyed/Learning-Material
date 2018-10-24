import java.util.*;
class MiniProject{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		while(true){
			
		
		System.out.println("1) Calculator ");
		System.out.println("2) Series ");
		System.out.println("3) Atm ");
		System.out.println("4) Salary Slip ");
		System.out.println("5) Season  ");
		System.out.println("6) Age Comparator  ");
		System.out.println("7) EXIT ");
		System.out.println("");
		
			System.out.print("Enter Selection : ");
			int select = ob.nextInt();
			
			if(select==1){
				while(true){
					
				System.out.println("");
				System.out.println("1) Menu Calculator ");
				System.out.println("2) Operator Calculator ");
				System.out.println("3) BACK ");
				System.out.println("");
				
				System.out.print("Enter Your Choice :");
				int choice = ob.nextInt();
				
				Calculator cal = new Calculator();
				
					if(choice==1){
					
					cal.menuCal();
						
					}//end of choice==1
					
					else if(choice==2){
						cal.operatorCal();
						
					}
					else if(choice==3){
						break;
					}
					else if(choice<1 || choice>3){
						System.out.println("Invalid Selection .. ! ");
						System.out.println("");
						
					}
				
				}//end of while loop 
				
			}//end of select==1
			
			else if(select==2){
				
				System.out.println("1) Even ");
				System.out.println("2) Odd ");
				System.out.println("3) Square ");
				System.out.println("");
				
				System.out.print("Enter your Choice : ");
				int seriesChoice = ob.nextInt();
					Series s = new Series();
					
					if(seriesChoice==1){
						s.even();
					}
					else if(seriesChoice==2){
						s.odd();
					}
					else if(seriesChoice==3){
						s.square();
					}
					
					else if(seriesChoice<1 || seriesChoice>3){
						System.out.print("Invalid Selection .. ! ");
					}
			}//end of select==2

			atm a = new atm();
			if(select==3){
				a.ruppes();
				System.out.println();
				
			}//select==3
			
			salarySlip s = new salarySlip();
			 if(select==4){
				s.salary();
				System.out.println();
			} //select==4
			
			Season sea = new Season();
			if(select==5){
				sea.seasonChange();
			}
			
			AgeComparator ag = new AgeComparator();
			if(select==6){
				ag.age();
			}
			
			if(select==7){
				System.exit(0);
			}
			
			if(select<1 || select>7){
				System.out.println("Invalid Selection . ! \n ");
			}
			
		}//main while 
		
	}//end of main method 
}