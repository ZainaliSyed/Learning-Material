						// ***********MINI PROJECT************
import java.util.*;

class MiniPro{
	public static void main(String args[]){
	Scanner ob = new  Scanner(System.in);
		int val1,val2,result;
		
		System.out.println("************* MINI PROJECTS *****************");
		
		System.out.println("");
		System.out.println("1)	Calculator");
		System.out.println("2)	ATM");
		System.out.println("3)	Mark sheet");
		System.out.println("4)	Season");
		System.out.println("5)	Trolley Load");
		System.out.println("6)	Pay Slip");
		System.out.println("7)	Converter");
		System.out.println("8)	Exit");
		
		System.out.println("");
		System.out.print("Please enter your choice :");
		int select = ob.nextInt();
		System.out.println("");
		
		if(select==1){		//MAIN SELECTON  START HEER
		System.out.println("1)	Menu ");
		System.out.println("2)	Operator");
		
		System.out.print("Please Enter your Selection :");
		int calSelect = ob.nextInt();
		
				if(calSelect==1){
				System.out.println("1) Addition");
				System.out.println("2) Subtraction");
				System.out.println("3) Multiplication");
				System.out.println("4) Division");
				System.out.println("5) Remainder");
				
				System.out.print("");
				System.out.print("Please enter your Selection here  :");
				int selectOp = ob.nextInt();
				
				if(selectOp==1){
				System.out.print("Please Enter the  1st Value :");
				val1 = ob.nextInt();
				System.out.print("Please Enter the  2nd Value :");
				val2 = ob.nextInt();
				result = val1+val2;
				System.out.print("Your  Addition Will be :"+result);
				
				}
				
				if(selectOp==2){
				System.out.print("Please Enter the  1st Value :");
				val1 = ob.nextInt();
				System.out.print("Please Enter the  2nd Value :");
				val2 = ob.nextInt();
				result = val1-val2;
				System.out.print("Your  Addition Will be :"+result);
				}
				
				if(selectOp==3){
				System.out.print("Please Enter the  1st Value :");
				val1 = ob.nextInt();
				System.out.print("Please Enter the  2nd Value :");
				val2 = ob.nextInt();
				result = val1*val2;
				System.out.print("Your  Addition Will be :"+result);
				}
				
				if(selectOp==4){
				System.out.print("Please Enter the  1st Value :");
				val1 = ob.nextInt();
				System.out.print("Please Enter the  2nd Value :");
				val2 = ob.nextInt();
				result = val1/val2;
				System.out.print("Your  Addition Will be :"+result);
				}
				
				if(selectOp==5){
				System.out.print("Please Enter the  1st Value :");
				val1 = ob.nextInt();
				System.out.print("Please Enter the  2nd Value :");
				val2 = ob.nextInt();
				result = val1%val2;
				System.out.print("Your  Addition Will be :"+result);
				} // END OF selectOp IF CONDITION HERE
				
				
				}//end of calSelect==1 if here 
				
				if(calSelect==2){
				System.out.print("please Enter the  1st Value :");
				val1 =ob.nextInt();
				System.out.print("please Enter the  2nd Value :");
				val2 =ob.nextInt();
				
				System.out.print("Please Enter the Operator You like :");
				String op = ob.next();
				
				if(op.equals("+")){
				result=val1+val2;
				System.out.println("Your Addition Will be :"+result);
				}
				
				if(op.equals("-")|| op.equals("_")){
				result=val1-val2;
				System.out.println("Your Subtraction  Will be :"+result);
				}

				if(op.equals("*")|| op.equals("x")){
				result=val1*val2;
				System.out.println("Your Multiplication   Will be :"+result);
				}
				
				if(op.equals("/")|| op.equals("\\")){
				result=val1/val2;
				System.out.println("Your Division  Will be :"+result);
				}
				
				if(op.equals("%")){
				result=val1%val2;
				System.out.println("Your Subtraction  Will be :"+result);
				}
				
				
				}// END OF calSelect==2 IF CONDITION ENDS HERE 
				
				
		}//end of Selection 1 if  here 
		
		
							//**********ATM PROGRAM START HERE *********
		if(select==2){
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
		
							//**********MARK SHEET PROGRAM START HERE *********
		if(select==3){
		System.out.print("Please Enter the  Marks of PHP :");
		int php = ob.nextInt();
		System.out.print("Please Enter the  Marks of .Net  :");
		int net = ob.nextInt();
		System.out.print("Please Enter the  Marks of Java :");
		int java = ob.nextInt();
		System.out.print("Please Enter the  Marks of Ruby :");
		int ruby = ob.nextInt();
		System.out.print("Please Enter the  Marks of C++ :");
		int cLang = ob.nextInt();	
		
		int total =php+net+java+ruby+cLang;
		System.out.println("Your Total  is :"+total);
		float percent = (total*100)/500;
		System.out.println("Your Percentage is  :"+percent);		
		
		} //END OF select==3 IF CONDITION END HERE
		
						//**********SEASON PROGRAM START HERE *********
		
		if(select==4){
		System.out.print("Please  Enter the  Month 1 to 12 :");
		int season =ob.nextInt();
		
			if (season==11 || season==12 || season==1){
			System.out.println("This is Winter Season  ");
			}
			if(season==2 || season==3 || season==4){
			System.out.println("This  is Spring Season");
			}
			if(season==5 || season==6 ||season==7){
			System.out.println("This is Sumner season");
			}
			if(season==8 ||season==9 ||season==10){
			System.out.println("This  is  Autumn Season");
			}
		}//END OF  select==4 ENDS  HERE  
		
							//**********TROLEY LOAD  PROGRAM START HERE *********
		if(select==5){
		System.out.print("Please Enter The  Number of Trolley :  ");
		int troley = ob.nextInt();
		
		System.out.print("Please Enter The No Of Load :");
		int load = ob.nextInt();
		
		int total = troley*load;
		System.out.println("The Total Amount is :"+total);
		
		int maintaince = (total/100)*3;
		System.out.println(" Maintenance 3% : "+maintaince);
		
		int driver = (total/100)*10;
		System.out.println("Driver 10% :"+driver);

		int tollTax = (total/100)*5;
		System.out.println("Toll Tax 5% :"+tollTax);

		int diesel = (total/100)*50;
		System.out.println("Diesel  10% :"+diesel);		
		
		int profit = total-maintaince-driver-tollTax-diesel;
		System.out.println("Your  net Profit  is :"+profit);
		
		}//END OF  select==5 TROLY LOAD ENDS  HERE  
		
							//**********BASIC PAY PROGRAM START HERE *********
		if(select==6){
		System.out.println("");
		System.out.println("**** BASIC PAY PROGRAME ****");
		
		System.out.print("Please Enter Your salary : ");
		int salary = ob.nextInt();
		System.out.println("");
		
		System.out.println("\t \t \t**Allowance Portion**** ");
		int houserent = (salary/100)*45;
		System.out.println("House Rent 45% :"+houserent);
		
		int medical = (salary/100)*15;
		System.out.println("Medical Allowance  15% :"+ medical);

		int bonus = (salary/100)*20;
		System.out.println("Bonus 20% :"+bonus);		
		
		int grossPay = salary+houserent+bonus;
		System.out.println("Gross Pay : "+grossPay);
		
		System.out.println("");
		System.out.println(" \t \t \t *** Detection Portion **** ");

		int incomeTax = (salary/100)*5;
		System.out.println("Income tax 5% :"+incomeTax);

		int zakat = (salary/100)*3;
		System.out.println("Zakat  5% :"+zakat);
		
		int vehicle = (salary/100)*8;
		System.out.println("Connivance Allowance  5% :"+vehicle);
		
		
		int netPay = grossPay-incomeTax-zakat-vehicle;
		System.out.println(" Your Net Pay  is :"+netPay);
		
	
		
		}//END OF  select==6 BASIC PAY ENDS  HERE
		
							//**********CONVERTOR PROGRAM START HERE *********
		if(select==7){
		System.out.println("");
		System.out.println("1)	Length");
		System.out.println("2)	Time");
		System.out.println("3)	Weight ");
		System.out.println("4)	Temperature ");
		System.out.println("");
		
		System.out.print("\t Please Enter your Choice :");
		int convertChoice = ob.nextInt();
		System.out.println("");
		
		if(convertChoice==1){
		
		System.out.println("1)	Convert Metre To Kilometre  ");
		System.out.println("2)	Convert Metre To Centimetre ");
		System.out.println("3)	Convert Kilometre To Miles ");
		System.out.println("4)	Convert Foot To Centimetre ");
		System.out.println("5)	Convert Centimetre To Foot ");
		
		System.out.println("Please enter Your  choice : ");
		int lenghtChoi = ob.nextInt();
		if(lenghtChoi==1){
		
		System.out.print("Please Enter your  metre ");
		int metre = ob.nextInt();
		
		int kilometre = metre/1000;
		System.out.println(" Kilometre are :"+kilometre);
		
		kilometre = metre%1000;
		System.out.println("Metres are : "+kilometre);
		}
		
		if(lenghtChoi==2){
		System.out.print("Please Enter your  metre ");
		int metre = ob.nextInt();
		
		int centimetre = metre*100;
		System.out.println(" centimetre are :"+centimetre);
		}
		
		if(lenghtChoi==3){
		System.out.print("Please Enter your  kilometre ");
		int kilometre = ob.nextInt();
		
		int miles = kilometre/1800;
		System.out.println(" Miles are :"+miles);
		
		miles =kilometre%1800;
		System.out.println(" kilometre are :"+miles);
		}
		
		if(lenghtChoi==4){
		System.out.print("Please Enter your  Foot ");
		int foot = ob.nextInt();
		
		int centi = foot*30;
		System.out.println(" Centimetre are :"+centi);
		
		}
		
		if(lenghtChoi==5){
		System.out.print("Please Enter your  Centimetre ");
		int centi = ob.nextInt();
		
		int foot = centi/30;
		System.out.println(" Foot are :"+foot);
		
		foot = centi%30;
		System.out.println("Centimetre are :"+foot);
		}
		
		}//END OF  LENGTH CHOICE  CONVERTOR  ENDS  HERE
		
		if(convertChoice==2){
			System.out.println("1)	Minutes To Second ");
			System.out.println("2)	Seconds To Minutes ");
			System.out.println("3)	Hours to Minutes ");
			System.out.println("4)	Hours to Second ");
			System.out.println("5)	Seconds To Hours");
			System.out.println("");
			
			System.out.print("Please Enter Your  Choice :");
			int timeChoice = ob.nextInt();
			
			if(timeChoice==1){
			System.out.print("Please Enter Minutes :");
			int min = ob.nextInt();
			
			int sec = min*60;
			System.out.println(" Your Seconds are :"+sec);
			}
			if(timeChoice==2){
			System.out.print("Please Enter Second :");
			int sec = ob.nextInt();
			
			int min = sec/60;
			System.out.println(" Your Minutes are :"+min);
			
			min = sec%60;
			System.out.println(" Your Seconds are :"+min);
			}
			
			if(timeChoice==3){
			System.out.print("Please Enter Hours:");
			int hour = ob.nextInt();
			
			int min= hour*60;
			System.out.println(" Your Minutes are :"+min);
			}
			
			if(timeChoice==4){
			System.out.print("Please Enter Hours:");
			int hour = ob.nextInt();
			
			int sec= hour*3600;
			System.out.println(" Your Seconds are :"+sec);
			
			}
			if(timeChoice==5){
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
			
		} // END OF TIME convertChoice==2 HERE  
		
		if(convertChoice==3){
		System.out.println("");
		System.out.println("1)	Kilogram To Gram ");
		System.out.println("2)	Kilogram To Pound ");
		System.out.println("3)	Gram To Kilogram ");
		System.out.println("4)	");
		System.out.println("5)");
		System.out.println("");
		
		int weightChoice = ob.nextInt();
		
		if(weightChoice==1){
		System.out.println("Please enter the  Kilogram");
		int kilo = ob.nextInt();
		
		int gm = kilo*1000;
		System.out.println("Your Gram are :"+gm);
		
		}
		
		if(weightChoice==2){
		System.out.println("Please enter the  Gram :");
		int kilo = ob.nextInt();
		
		int pound= kilo*2;
		System.out.println("Your Pound are :"+pound);
		
		}
		
		
		if(weightChoice==3){
		System.out.println("Please enter the  Gram");
		int gram = ob.nextInt();
		
		int kilo = gram/1000;
		System.out.println("Your KiloGram are :"+kilo);
		
		int remGram = gram%1000;
		System.out.println("Your Gram are :"+remGram);
		}
		
		} // END OF weight convertChoice==3 HERE
		
		
		
		}//END OF  select==7 CONVERTOR  ENDS  HERE
		
		if(select==8){
		System.exit(0);
		}
		
		if(select<1 ||select>8){
		System.out.println("Invalid Selection");
		}	// invalid selection 
		
	}
}