import java.util.*;
class MiniElseIf{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		
		int  num1,num2,result;
		System.out.println("1) Calculator  ");
		System.out.println("2) ATM");
		System.out.println("3) MarkSheet");
		System.out.println("4) Season");
		System.out.println("5) Trolly Load");
		System.out.println("6) Pay Slip");
		System.out.println("7) Exit \n ");
		
		System.out.print("Please Enter Your Selection :");
		int select = ob.nextInt();
		
		if(select==1){
			System.out.println("\n \n");
			System.out.println("1) Menu");
			System.out.println("2) Operator  \n \n");
			
			System.out.print("Enter Your Choice : ");
			int choice =ob.nextInt();
			
				if(choice==1){
					System.out.println("1) Addition  ");
					System.out.println("2) Subtraction  ");
					System.out.println("3) Multiplication  ");
					System.out.println("4) Division  ");
					System.out.println("5) Remainder  \n  ");
					
						System.out.print("Enter Your Menu Choice : ");
						int menuChoice = ob.nextInt();
						
						if(menuChoice==1){
							System.out.print("Enter 1st No : ");
							num1 = ob.nextInt();
							System.out.print("Enteer 2nd Number : ");
							num2 =ob.nextInt();
							
							result = num1+num2;
							System.out.println("your Result is : "+result);
							
						}//end of addition
						else if(menuChoice==2){
							System.out.print("Enter 1st No : ");
							num1 = ob.nextInt();
							System.out.print("Enteer 2nd Number : ");
							num2 =ob.nextInt();
							
							result = num1-num2;
							System.out.println("your Result is : "+result);
						}// end of subtraction 
						
						else if (menuChoice==3){
							System.out.print("Enter 1st No : ");
							num1 = ob.nextInt();
							System.out.print("Enteer 2nd Number : ");
							num2 =ob.nextInt();
							
							result = num1*num2;
							System.out.println("your Result is : "+result);
							
						}// end of multiplication 
						
						else if(menuChoice==4){
							System.out.print("Enter 1st No : ");
							num1 = ob.nextInt();
							System.out.print("Enteer 2nd Number : ");
							num2 =ob.nextInt();
							
							result = num1/num2;
							System.out.println("your Result is : "+result);
						}// end of division 
						
						else if(menuChoice==5){
							System.out.print("Enter 1st No : ");
							num1 = ob.nextInt();
							System.out.print("Enteer 2nd Number : ");
							num2 =ob.nextInt();
							
							result = num1%num2;
							System.out.println("your Result is : "+result);
						}// end of remainder 
						
						else if(menuChoice<0 || menuChoice>5){
							System.out.println("invalid selection .. !! ");
						}
						
				}//end of choice ==1 
				
				
			else if(choice==2){
				System.out.print("Enter 1st No : ");
				num1 = ob.nextInt();
				System.out.print("Enter 2nd No : ");
				num2 = ob.nextInt();
				
				
				System.out.print(" Enter your operator : ");
				String op = ob.next();
				
				if(op.equals("X") || op.equals("x")){
				result = num1*num2;
				System.out.print("Your result is : "+result);	
				}
				else if(op.equals("+")){
					result =num1+num2;
					System.out.println("your Result is : "+result);
				}
				else if(op.equals("/") ){
					result = num1/num2;
					System.out.println(" your Result is : "+result);
				}
				else if(op.equals("-") || op.equals("_")){
					result =num1-num2;
					System.out.println("Your Result is : "+result);
				}
				else {
					System.out.println("Sorry you have Select invalid operator .. !! ");
				}
				
				
			}//end choice ==2	
		
		}//end of select 1 
		
		else if(select==2){
				System.out.print(" Please Enter Rupees : ");
	int rupes = ob.nextInt();
	
		
		
		int fiveThousand =rupes/5000;
			if (fiveThousand!=0){
			System.out.println("5000 : "+fiveThousand);
			}
		 	
		int remFivethousand = rupes%5000;
		int oneThousand =remFivethousand/1000;
		if(oneThousand!=0){
		System.out.println("1000  :"+oneThousand);
		}
	
		int remOnethousand = remFivethousand%1000;
		int fiveHundred = remOnethousand/500;
		if(fiveHundred!=0){
		System.out.println("500   :"+fiveHundred);	
		}
	
	
		int remFivehundred = remOnethousand%500;
		int oneHundred = remFivehundred/100;
		if(oneHundred!=0){
		System.out.println("100   :"+oneHundred);	
		}
	
	
		int remOnehundred = remFivehundred%100;
		int fifty = remOnehundred/50;
		if(fifty!=0){
		System.out.println("50    :"+fifty);	
		}
	
	
		int remFifty = remOnehundred%50;
		int twenty = remFifty/20;
		if(twenty!=0){
		System.out.println("20    :"+twenty);	
		}
	
	
		int remTwenty = remFifty%20;
		int ten = remTwenty/10;
		if(ten!=0){
		System.out.println("10    :"+ten);	
		}
	
	
		int remTen = remTwenty%10;
		int five = remTen/5;
		if(five!=0){
		System.out.println("5     :"+five);	
		}
	
	
		int remFive = remTen%5;
		int two = remFive/2;
		if(two!=0){
		System.out.println("2    : "+two);	
		}
	
	
		int remTwo = remFive%2;
		int one = remTwo/1;
		if(one!=0){
		System.out.println("1     :"+one);	
		}
	
			
				
		}// end of select = ATm 
		
		else if(select==3){
			
		System.out.print("Enter Your Percent here : ");
		int grade = ob.nextInt();
		
		String per = ob.next();
			
			
		
		if(grade<50){
			System.out.println("Sorry you are Fail ..!! ");
		}
		
		else if(grade>=51 && grade<=60){
			System.out.println(" You have Got D Grade .");
		}
		else if(grade>=61 && grade<=70){
			System.out.println("you have C Grade ..");
		}
		else if(grade>=71 && grade<=80){
			
			System.out.println("You have B grade ");
		}
		else if(grade>=81 && grade<=90){
			System.out.println("You have Got A grade ");
		}
		
		else if(grade>=91 && grade<=100){
			System.out.println("you Have Got A+");
		}
		
		else if(grade>100){
			System.out.println("Invalid num should be less than 100 ..");
		}
		
	}//end of select = Marksheet 
		
		else if(select==4){
				System.out.print("Enter The Month  : ");
	int month =ob.nextInt();
	
	if(month==1 || month==2 || month==12){
		System.out.println("Winter Month ");
	}
	else if(month==3 || month==4 || month==5){
		System.out.println("Summer seaSon");
	}
	
	else if(month==6 || month==7 || month==8){
		System.out.println("Autumn Season");
	}
	else if (month==9 || month==10 || month==11){
		System.out.println("Spring Season");
	}
		}// end of select = Season 
		
		
		else if (select==5){
		System.out.print("Please the number of Trolley  :");
		int number = ob.nextInt();
		System.out.println("");
		
		System.out.print("Please Enter the Amount of Trolley :");
		int trolley = ob.nextInt();
		
		int total = number*trolley;
		System.out.println(" The Total Amount of Trolley is :"+total);
		System.out.println("");
		
		int maintainance = (total/100)*3;
		System.out.println("Maintenance 3% : "+maintainance);
		
		int driver = (total/100)*10;
		System.out.println("Driver 10% : "+driver);

		int toll = (total/100)*5;
		System.out.println("Toll Tax 5% : "+toll);	
		
		int diesel = (total/100)*50;
		System.out.println("Diesel 50% : "+diesel);
		
		int pofit = total-maintainance-driver-toll-diesel;
		System.out.println("\t YOUR NET PROFIT IS :"+pofit);
		}// end of select = trolly load 
		
		else if(select==6){
		System.out.print("Please Enter Your Basic Pay :");
		int amount = ob.nextInt();
		
		System.out.println("");
		System.out.println(" \t ********** Increment Portion *********** ");
		System.out.println("");
		
		int house = (amount/100)*3;
		System.out.println("House Rent 3% :"+house);
		
		int medical = (amount/100)*15;
		System.out.println("Medical Allowance  15% :"+medical);
		
		int bonus = (amount/100)*5;
		System.out.println("Bonus  5% :"+bonus);
		
		int grossSallery = house+medical+bonus;
		System.out.print("Your Gross Sallery is :"+grossSallery);
		System.out.println("\n");
		
		System.out.println("\t ********** Detection Portion ***********");
		System.out.println("");
		
		int tax= (amount/100)*5;
		System.out.println(" Income Tax 5% : "+tax);
		
		float zakat =(amount/100)*2.5f;
		System.out.println("Zakat 2.5% : "+zakat);
		
		int vehcle = (amount/100)*8;
		System.out.println(" Convince Allowance 8% : "+vehcle);
		
		float net = grossSallery-tax-zakat-vehcle;
		
		System.out.println("");
		System.out.print(" \t YOUR  NET SALAERY IS :"+net);
		}// end of select = pay slip 
		
		else if(select==7){
			System.exit(0);
		}// end of exit 
		
	}// End of main 
}