				//**************** MINI PROJRCT USING ELSE IF CONDITION ****************************
import java.util.*;
class MiniProElseif{
	public static void main(String args[]){
	Scanner ob = new Scanner (System.in);
	int val1,val2,result;
	
	System.out.println("\n \t ******* MINI PROJRCT USING ELSE IF CONDITION *********");
	System.out.println("");
	System.out.println("1)	Calculator");
	System.out.println("2)	ATM");
	System.out.println("3)	Basic Pay ");
	System.out.println("4)	Season");
	System.out.println("5)	Trolley Load ");
	System.out.println("6)	Mark Sheet");
	System.out.println("7)	Converter");
	System.out.println("8)	Exit");
	System.out.println("");
	
	System.out.print("Please Enter the Selection You Like :");
	int select = ob.nextInt();
	
	
	//****CALCULATOR START HERE ***
	if(select==1){
	
	System.out.println("");
	System.out.println("**********CLACULATOR PROGRAM START HERE *********");
	System.out.println("1)	Menu");
	System.out.println("2)	Operator");
	
	System.out.print("Please Enter Your Choice : ");
	int calChose = ob.nextInt();
	
	if(calChose==1){
	
	System.out.println("");
	System.out.println("1)	Addition");
	System.out.println("2)	Subtraction");
	System.out.println("3)	Multiplication");
	System.out.println("4)	Division");
	System.out.println("5)	Remainder");
	System.out.println("");
	
	System.out.print("Please Enter your operator Choice : ");
	int calop = ob.nextInt();
	if(calop==1){
	
	System.out.println("");
	System.out.print("PLease Enter 1st value :");
	val1 = ob.nextInt();
	System.out.print("Please Enter 2nd value :");
	val2 = ob.nextInt();
	
	result =val1+val2;
	System.out.print("Your Addition Will be :"+result);
	}
	else if(calop==2){
	System.out.println("");
	System.out.print("Please Enter 1st value : ");
	val1 = ob.nextInt();
	System.out.println("Please Enter 2nd Value :");
	val2 = ob.nextInt();
	
	result= val1-val2;
	System.out.println("Your Subtraction Will : "+result);
	}
	
	else if(calop==3){
	System.out.println("");
	System.out.print("Please Enter 1st value : ");
	val1 = ob.nextInt();
	System.out.print("Please Enter 2nd Value :");
	val2 = ob.nextInt();
	
	result= val1*val2;
	System.out.println("Your Multiplication Will : "+result);
	}
	
	else if(calop==4){
	System.out.println("");
	System.out.print("Please Enter 1st value : ");
	val1 = ob.nextInt();
	System.out.println("Please Enter 2nd Value :");
	val2 = ob.nextInt();
	
	result= val1/val2;
	System.out.println("Your Division Will : "+result);
	}
	
	else if(calop==5){
	System.out.println("");
	System.out.print("Please Enter 1st value : ");
	val1 = ob.nextInt();
	System.out.println("Please Enter 2nd Value :");
	val2 = ob.nextInt();
	
	result= val1%val2;
	System.out.println("Your Remainder Will : "+result);
	}
	
	else{
	System.out.println(" Invalid Selection ..! ");
	}
	
	}	// end of calChose==1 condition
	
	
	// *** Calculator  Operator==2 ***
	
	else if(calChose==2){
	
	System.out.print("");
	System.out.print("Please Enter the 1st value : ");
	val1 =ob.nextInt();
	System.out.print("Please Enter the 2nd value : ");
	val2 = ob.nextInt();
	
	System.out.print("Please Enter the operator : ");
	String op = ob.next();
	
	if(op.equals("+")){
	result = val1+val2;
	System.out.print("Your Addition Will be :"+result);
	}
	
	else if(op.equals("-")|| op.equals("_") ){
	result = val1-val2;
	System.out.print("Your Subtraction Will be :"+result);
	}
	
	else if(op.equals("/")|| op.equals("\\") ){
	result = val1/val2;
	System.out.print("Your Division Will be :"+result);
	}
	
	else if(op.equals("%") ){
	result = val1%val2;
	System.out.print("Your Remainder Will be :"+result);
	}
	
	else if(op.equals("*") || op.equals("x") ){
	result = val1*val2;
	System.out.print("Your Multiplication Will be :"+result);
	}
	
	else{
	System.out.print("Sorry You have Select an Invalid Operator ..!! ");
	}
	}// end calChose==2 here 
	
	}	//*************END OF SELECT==1 CALCULATOR HERE  *********************
	
			
									//**********ATM PROGRAM START HERE *********
		else if(select==2){
		System.out.println("");
		System.out.println("**********ATM PROGRAM START HERE *********");
		System.out.println("");
		System.out.print("Please Enter Rupees : ");
		int rupees = ob.nextInt();
		System.out.println("");
		
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
		
		}// END OF select==2  IF CONDITION HERE 
		
		
		
		
											//***** BASIC PAY PROGRAM START HERE *********
		else if(select==3){
		
		System.out.println("");
		System.out.println("**********BASIC PAY PROGRAM START HERE *********");
		System.out.println("");
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
		
		
		}	// END OF SELECT==3  HERE 
		
		
		
				// ******SEASON PROGRAM START HERE  ********
		
		else if(select==4){
		System.out.println("");
		System.out.println("**********SEASON PROGRAM START HERE *********");
		System.out.println("");
		System.out.print("Please Enter a Month 1 to 12 :  ");
		int season = ob.nextInt();
		
		if(season==11 || season==12 || season==1){
		System.out.println(" The  season is  winter ..");
		}
		
		else if(season==2 || season==3 || season==4){
		System.out.println(" The  season is  Spring ..");
		}
		
		else if(season==5 || season==6 || season==7){
		System.out.println(" The  season is  Summer  ..");
		}
		
		else if(season==8 || season==9 || season==10){
		System.out.println(" The  season is  winter ..");
		}
		
		else{
		System.out.println("Invalid  Month ....! ");
		}
		
		}	//END OF THE SELECT==4 HERE 	
		

									//***** TROLEY LOAD  PROGRAM START HERE *********
	
		else if(select==5){
		
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
		
		}	// end of select==5 Troley load here  
		
		
								//**** MARK SHEET PROGRAM START HERE *********
		else if(select==6){
		System.out.println("");
		System.out.println("**********MARK SHEET PROGRAM START HERE *********");
		System.out.println("");
		System.out.print("Enter Php  :");
		int php = ob.nextInt();
		
		System.out.print("Enter .Net  :");
		int net = ob.nextInt();
		
		System.out.print("Enter Java   :");
		int java = ob.nextInt();
		
		System.out.print("Enter C++  :");
		int c = ob.nextInt();
		
		System.out.print("Enter Ruby   :");
		int ruby = ob.nextInt();
		
		int obtain =php+net+java+ruby;
		System.out.print(" Your Marks  obtain are :"+obtain);
		
		float percent =(obtain*100.0f)/500;
		System.out.print(" Your Percentage is :"+percent);
		
		}	//END SELECT==6 MARK SHEET END HERE 
		
		
							// **** CONVERTOR PROGRAM START HERE **********
		else if(select==7){
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
		
		
		if(convertChoice==1){
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
		
		if(lenghtChoi==1){
		System.out.print("Please Enter your  metre ");
		int metre = ob.nextInt();
		
		int kilometre = metre/1000;
		System.out.println(" Kilometre are :"+kilometre);
		
		kilometre = metre%1000;
		System.out.println("Metres are : "+kilometre);
		}
		
		else if(lenghtChoi==2){
		System.out.print("Please Enter your  metre ");
		int metre = ob.nextInt();
		
		int centimetre = metre*100;
		System.out.println(" centimetre are :"+centimetre);
		}
		
		else if(lenghtChoi==3){
		System.out.print("Please Enter your  kilometre ");
		int kilometre = ob.nextInt();
		
		int miles = kilometre/1800;
		System.out.println(" Miles are :"+miles);
		
		miles =kilometre%1800;
		System.out.println(" kilometre are :"+miles);
		}
		
		else if(lenghtChoi==4){
		System.out.print("Please Enter your  Foot ");
		int foot = ob.nextInt();
		
		int centi = foot*30;
		System.out.println(" Centimetre are :"+centi);
		
		}
		
		else if(lenghtChoi==5){
		System.out.print("Please Enter your  Centimetre ");
		int centi = ob.nextInt();
		
		int foot = centi/30;
		System.out.println(" Foot are :"+foot);
		
		foot = centi%30;
		System.out.println("Centimetre are :"+foot);
		}
		else {
		System.out.println("Invalid Selection ...!!");
		}
		
		}// end of convert length condition here 
		
						//***** Time Convergent *****
		else if(convertChoice==2){
		
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
			
			if(timeChoice==1){
			System.out.print("Please Enter Minutes :");
			int min = ob.nextInt();
			
			int sec = min*60;
			System.out.println(" Your Seconds are :"+sec);
			}
			else if(timeChoice==2){
			System.out.print("Please Enter Second :");
			int sec = ob.nextInt();
			
			int min = sec/60;
			System.out.println(" Your Minutes are :"+min);
			
			min = sec%60;
			System.out.println(" Your Seconds are :"+min);
			}
			
			else if(timeChoice==3){
			System.out.print("Please Enter Hours:");
			int hour = ob.nextInt();
			
			int min= hour*60;
			System.out.println(" Your Minutes are :"+min);
			}
			
			else if(timeChoice==4){
			System.out.print("Please Enter Hours:");
			int hour = ob.nextInt();
			
			int sec= hour*3600;
			System.out.println(" Your Seconds are :"+sec);
			
			}
			else if(timeChoice==5){
			System.out.print("Please Enter Seconds:");
			int sec = ob.nextInt();
			
			int hour= sec/3600;
			System.out.println(" Your Hour are :"+hour);
			
			int min =sec%3600;
			int remMin = min/60;
			System.out.println(" Your Minutes are :"+remMin);
			
			int remSec =min%60;
			System.out.println(" Your Seconds are :"+remSec );
			}
			else {
			System.out.println("Invalid Selection .....! ");
			}
			
		} // END OF TIME convertChoice==2 HERE  
		
		
		else if(convertChoice==3){
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
		
		if(weightChoice==1){
		System.out.println("Please enter the  Kilogram");
		int kilo = ob.nextInt();
		
		int gm = kilo*1000;
		System.out.println("Your Gram are :"+gm);
		
		}
		
		else if(weightChoice==2){
		System.out.println("Please enter the  Gram :");
		int kilo = ob.nextInt();
		
		float pound= kilo*2.0234f;
		System.out.println("Your Pound are :"+pound);
		
		}
		
		
		else if(weightChoice==3){
		System.out.println("Please enter the  Gram");
		int gram = ob.nextInt();
		
		int kilo = gram/1000;
		System.out.println("Your KiloGram are :"+kilo);
		
		int remGram = gram%1000;
		System.out.println("Your Gram are :"+remGram);
		}
		
		
		else if(weightChoice==4){
		System.out.print("please Enter Your Tone :");
		int tone = ob.nextInt();
		
		int kilo = tone*40;
		System.out.print("Your Kilogram are "+kilo);
		
		}
		
		else if(weightChoice==5){
		System.out.print("please Enter Your Pound :");
		int pound = ob.nextInt();
		
		int kilo = pound/1000;
		System.out.print("Your Kilogram are "+kilo);
		
		kilo = pound%1000;
		System.out.print("Remaining  Pound  are "+kilo);
		}
		
		
		
		
		else {
		System.out.print("Invalid Selection ...!");
		}
				
		} // END OF weight convertChoice==3 HERE

		}		//END OF SELECT==7 CONVERTOR
		
		else {
		System.out.print("");
		System.out.print("\n \t Invalid Selection you have  Made ...!! ");
		}		//****** This Else is for Ending all the condition 
		
		
	}
}