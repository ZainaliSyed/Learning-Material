							//******** MINI PROJRCT ON SWITCH STATMENT *************
import java.util.*;
	
	class MiniProSwitch{
		public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int val1,val2,result;
		
		System.out.println("****** MINI PROJECT ON SWITCH STATMENT *******");
		System.out.println("");
		System.out.println("1)	Calculator");
		System.out.println("2)	ATM");
		System.out.println("3)	Basic Pay");
		System.out.println("4)	Trolley Load");
		System.out.println("5)	Mark Sheet");
		System.out.println("6)	Season ");
		System.out.println("7)	Converter");
		System.out.println("8)	Exit");
		System.out.println("");
		
		System.out.print("Please Enter Selection You Like : ");
		int select = ob.nextInt();
		
		switch (select){
		case 1:
		System.out.println("1)	Menu");
		System.out.println("2)	Operator");
		System.out.println("");
		
		System.out.print("Please Select Your Choice :");
		int calselect = ob.nextInt();
		
				// *** Menu Calculator Portion Start Here *********
		switch (calselect){
		case 1 :
		System.out.println("1)	Addition ");	
		System.out.println("2)	Subtraction ");	
		System.out.println("3)	Multiplication ");	
		System.out.println("4)	Division ");
		System.out.println("5)	Remainder ");
		
		System.out.print("Please Enter Your Choice :");
		int MenuSelect = ob.nextInt();
		
		switch (MenuSelect){ // Here This MenuSelect For The List of menu
		case 1:
		System.out.print("Please Enter 1st Value :");
		val1 = ob.nextInt();
		System.out.print("Please Enter 2nd Value :");
		val2 = ob.nextInt();
		
		result =val1+val2;
		System.out.print("Your AddiTion Will be  :"+result);
		break;
		
		case 2:
		System.out.print("Please Enter 1st Value :");
		val1 = ob.nextInt();
		System.out.print("Please Enter 2nd Value :");
		val2 = ob.nextInt();
		
		result =val1-val2;
		System.out.print("Your Subtraction Will be  :"+result);
		break;
		
		case 3:
		System.out.print("Please Enter 1st Value :");
		val1 = ob.nextInt();
		System.out.print("Please Enter 2nd Value :");
		val2 = ob.nextInt();
		
		result =val1*val2;
		System.out.print("Your Multiplication  Will be  :"+result);
		break;
		
		
		case 4:
		System.out.print("Please Enter 1st Value :");
		val1 = ob.nextInt();
		System.out.print("Please Enter 2nd Value :");
		val2 = ob.nextInt();
		
		result =val1/val2;
		System.out.print("Your Division Will be  :"+result);
		break;
		
		case 5:
		System.out.print("Please Enter 1st Value :");
		val1 = ob.nextInt();
		System.out.print("Please Enter 2nd Value :");
		val2 = ob.nextInt();
		
		result =val1%val2;
		System.out.print("Your Remainder Will be  :"+result);
		break;
		
		}	// end of Menu Calculator Here 
		
			case 2: //****HERE THIS CASE2 IS FOR THE OPERATOR SELECTION*****
			System.out.print("Please Enter The 1st Value :");
			val1 = ob.nextInt();
			System.out.print("Please Enter The 2nd Value :");
			val2 = ob.nextInt();
			
			System.out.print("Please Enter Any Operator :");
			char op = ob.nextLine().charAt(0);
			
			switch (op){
			
			case '+' :
			result =val1+val2;
			System.out.println("Your Addition Will be :"+result);
			break;
			
			case '-' :
			case '_' :
			result =val1-val2;
			System.out.println("Your Subtraction Will be :"+result);
			break;
			
			case '/' :
			case '\\' :
			result =val1/val2;
			System.out.println("Your Division Will be :"+result);
			break;
			
			case '*' :
			case 'x' :
			case 'X' :
			result =val1*val2;
			System.out.println("Your Multiplication Will be :"+result);
			break;
			
			case '%' :
			result =val1%val2;
			System.out.println("Your Remainder Will be :"+result);
			break;
			
			default :
			System.out.println(" Sorry Invalid OperaTor  ...!!");
			}	//*** End of OperaTor Choose Option
			
		}	//end of CalSelect Menu switch here 			
			
								//************* ATM PROGRAM START HERE **********
	case 2 :
		
		System.out.println("************* ATM PROGRAM START HERE **********");
		System.out.println("");
		System.out.print("Please Enter The Rupees : ");
		int rupees = ob.nextInt();
		
		int fiveThou = rupees/5000;
		System.out.println("5000 :"+fiveThou);
		
		int remfiveThou = rupees%5000;
		int oneThou =remfiveThou/1000;
		System.out.println("1000 :"+oneThou);
		
		int remoneThou =remfiveThou%1000;
		int fiveHund = remoneThou/500;
		System.out.println("500 :"+fiveHund);
		
		int remfiveHund =remoneThou%500;
		int oneHund = remfiveHund/100;
		System.out.println("100 :"+oneHund);
		
		int remoneHund = remfiveHund%100;
		int fifty = remoneHund/50;
		System.out.println("50 :"+fifty);
		
		int remFifty = remoneHund%50;
		int twenty = remFifty/20;
		System.out.println("20 :"+twenty);
		
		int remTwenty = remFifty%20; // change due  to ten
		int ten = remTwenty/10;
		System.out.println("10 :"+ten);
		
		int remTen = remTwenty%10;
		int five = remTen/5;
		System.out.println("5 :"+five);
		
		int remFive = remTen%5;
		int two = remFive/2;
		System.out.println("2 :"+two);
		
		int remTwo = remFive%2;
		int one = remTwo/1;
		
		System.out.println("1 :"+one);
								
									// END OF CASE 2 ATM PROGRAM 
										
		
								//************ Basic PAY PROGRAM START HERE ************
	case 3 :
		System.out.println("");
		System.out.print("Please Enter Your Basic pay :");
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
		
								//End of BASIC PAY  Program 
		
								//********* TROLLEY LOAD PROGRAM START HERE  ************
		
	case 4 :
		System.out.println("");
		System.out.println("**********TROLLEY LOAD  PROGRAM START HERE *********");
		System.out.println("");
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
		
		
								//End of TROLLEY LOAD  Program 
								
								
								//**** MARK SHEET PROGRAM START HERE *********
	case 5 :

		System.out.println("");
		System.out.println("**********MARK SHEET PROGRAM START HERE *********");
		System.out.println("");
		System.out.print("Enter Php  :");
		int php = ob.nextInt();
		
		System.out.print("Enter Assembly  :");
		int asm = ob.nextInt();
		
		System.out.print("Enter Java   :");
		int java = ob.nextInt();
		
		System.out.print("Enter C++  :");
		int c = ob.nextInt();
		
		System.out.print("Enter Ruby   :");
		int ruby = ob.nextInt();
		
		int obtain =php+asm+java+ruby;
		System.out.print(" Your Marks  obtain are :"+obtain);
		
		float percent =(obtain*100.0f)/500;
		System.out.print(" Your Percentage is :"+percent);
								// end of Mark Sheet Program

	case 6 :
		System.out.println("");
		System.out.println("**********SEASON PROGRAM START HERE *********");
		System.out.println("");
		System.out.print("Please Enter a Month 1 to 12 :  ");
		int season = ob.nextInt();
		
		switch (season){
		case 11: case 12: case 1:
		System.out.println("The Season Is Winter ");
		break;
	    case 2: case 3: case 4:
		System.out.println("The Season Is Spring ");
		break;
		case 5: case 6: case 7:
		System.out.println("The Season Is Summer  ");
		break;
	    case 8: case 9: case 10:
		System.out.println("The Season Is Autumn  ");
		break;
		}	
		
		
								//end of the season Program
		
		
								// **** CONVERTOR PROGRAM START HERE **********
		
	case 7:
	
		System.out.println("");
		System.out.println("**********CONVERTOR PROGRAM START HERE *********");
		System.out.println("");
		System.out.println(" 1)	Length");
		System.out.println(" 2)	Time");
		System.out.println(" 3)	Weight");
		System.out.println(" 4)	Temperature ");
		System.out.println("");
		
		System.out.print(" Please Enter Your Choice :");
		int convertChoice =ob.nextInt();
		
		switch (convertChoice){
		case 1:
		
		System.out.println("");
		System.out.println("1)	Convert Metre To Kilometre  ");
		System.out.println("2)	Convert Metre To Centimetre ");
		System.out.println("3)	Convert Kilometre To Miles ");
		System.out.println("4)	Convert Foot To Centimetre ");
		System.out.println("5)	Convert Centimetre To Foot ");
		System.out.println("");
		
		System.out.print("Please enter Your  choice : ");
		int lenghtChoi = ob.nextInt();
		System.out.println("");
		
				switch (lenghtChoi){
				case 1 :
					System.out.print("Please Enter your  metre ");
					int metre = ob.nextInt();
		
					int kilometre = metre/1000;
					System.out.println(" Kilometre are :"+kilometre);
		
					kilometre = metre%1000;
					System.out.println("Metres are : "+kilometre);
					break;
					
				case 2:
					System.out.print("Please Enter your  metre ");
					metre = ob.nextInt();
		
					int centimetre = metre*100;
					System.out.println(" centimetre are :"+centimetre);
					break;
				
				case 3:
					
					System.out.print("Please Enter your  kilometre ");
					kilometre = ob.nextInt();
		
					int miles = kilometre/1800;
					System.out.println(" Miles are :"+miles);
		
					miles =kilometre%1800;
					System.out.println(" kilometre are :"+miles);
					break;
				
				case 4 :
					System.out.print("Please Enter your  Foot ");
					int foot = ob.nextInt();
		
					int centi = foot*30;
					System.out.println(" Centimetre are :"+centi);				
					break;
					
				case 5 :

					System.out.print("Please Enter your  Centimetre ");
					centi = ob.nextInt();
		
					foot = centi/30;
					System.out.println(" Foot are :"+foot);
		
					foot = centi%30;
					System.out.println("Centimetre are :"+foot);
					break;
				
				default :
				System.out.println(" Sorry You Made an Invalid Selection  ");
				break;
				}	//end of lenghtChoi here 
			

			
			// ************ CASE 2 FOR TIME CONVERTER START HERE 
	case 2:			
			System.out.println("");
			System.out.println("1)	Minutes To Second ");
			System.out.println("2)	Seconds To Minutes ");
			System.out.println("3)	Hours to Minutes ");
			System.out.println("4)	Hours to Second ");
			System.out.println("5)	Seconds To Hours");
			System.out.println("");
			
			System.out.print("Please Enter Your  Choice :");
			int timeChoice = ob.nextInt();
			System.out.println("");		
			
			switch(timeChoice){
				case 1 :
					System.out.print("Please Enter Minutes :");
					int min = ob.nextInt();
			
					int sec = min*60;
					System.out.println(" Your Seconds are :"+sec);
					break;
				
				case 2 :
					System.out.print("Please Enter Second :");
					sec = ob.nextInt();
			
					min = sec/60;
					System.out.println(" Your Minutes are :"+min);
			
					min = sec%60;
					System.out.println(" Your Seconds are :"+min);
					break;
				
				case 3 :
					System.out.print("Please Enter Hours:");
					int hour = ob.nextInt();
			
					min= hour*60;
					System.out.println(" Your Minutes are :"+min);
					break;
				
				case 4 :
				
					System.out.print("Please Enter Hours:");
					hour = ob.nextInt();
			
					sec= hour*3600;
					System.out.println(" Your Seconds are :"+sec);
					break;
				
				case 5 :
					System.out.print("Please Enter Seconds:");
					sec = ob.nextInt();
			
					hour= sec/3600;
					System.out.println(" Your Hour are :"+hour);
			
					min =sec%3600;
					int remMin = min/60;
					System.out.println(" Your Minutes are :"+remMin);
			
					int remSec =min%60;
					System.out.println(" Your Seconds are :"+remSec );
					break;
					
				default :
				System.out.println(" Sorry You Made an Invalid Selection  ");
				break;	
				
			}// END OF timechoice HERE 
		
	case 3 :
		System.out.println("");
		System.out.println("1)	Kilogram To Gram ");
		System.out.println("2)	Kilogram To Pound ");
		System.out.println("3)	Gram To Kilogram ");
		System.out.println("4)	Tone To Kilogram");
		System.out.println("5)	Pound To Kilogram ");
		System.out.println("");
		
		System.out.print("Please ener your Choice : ");
		int weightChoice = ob.nextInt();
		System.out.println("");
		
			switch(weightChoice){
			
				case 1 :
					System.out.println("Please enter the  Kilogram");
					int kilo = ob.nextInt();
		
					int gm = kilo*1000;
					System.out.println("Your Gram are :"+gm);
					break;
				
				case 2 :
				
					System.out.println("Please enter the  Gram :");
					kilo = ob.nextInt();
		
					float pound= kilo*2.0234f;
					System.out.println("Your Pound are :"+pound);
					break;
				
				case 3 :
				
					System.out.println("Please enter the  Gram");
					int gram = ob.nextInt();
		
					kilo = gram/1000;
					System.out.println("Your KiloGram are :"+kilo);
		
					int remGram = gram%1000;
					System.out.println("Your Gram are :"+remGram);
					break;

				
				case 4 :
					System.out.print("please Enter Your Tone :");
					int tone = ob.nextInt();
		
					kilo = tone*40;
					System.out.print("Your Kilogram are "+kilo);
					break;
				
				case 5 :
				
					System.out.print("please Enter Your Pound :");
					float p= ob.nextInt();
		
					float k = p/1000f;
					System.out.print("Your Kilogram are "+k);
		
					//int remk = p%1000;
					//System.out.print("Remaining  Pound  are "+remk);
					break;
				
				default :
					System.out.println(" Sorry You have Made Invalid Selection	...!!!");
					break;
				
			} // End of weightChoice here 
		

		} // end convertChoice  here 

	default :
	System.out.println("Sorry You have Made Invalid Selection	...!!!");	
	
		}	//End of select 
		
		
		
		
		}
	}