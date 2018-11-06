import java.util.*;
class DoWhileProject{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
		int option =1; 
		int select =1;
		

			
		do{
			
		System.out.println("\t \t ***** Main Menu *****");
		System.out.println("1) Calculator");
		System.out.println("2) Mark sheet");
		System.out.println("3) Series");
		System.out.println("4) Age Comparator");
		System.out.println("5) About");
		System.out.println("6) Exit");
		System.out.println("\n ");
			
			System.out.print("Please Enter Main Menu Selection : ");
			select = ob.nextInt();
			
			
			
				if(select==1){
					
					do{ //This do is showing menu of calculator
					
				System.out.println("1) Simple Calculator");	
				System.out.println("2) Menu Calculator");	
				System.out.println("3) Back");	
				
				System.out.println("\n");
				
				 
				
				System.out.print(" Enter Option : ");
				option =ob.nextInt();
					
					if(option==1){
						
						System.out.println("\t ***** Simple Calculator *****");	
						System.out.print("Enter 1st Value : ");
						int val1 = ob.nextInt();
						
						System.out.print("Enter 2nd Value : ");
						int val2 =ob.nextInt();
						
						System.out.print("Enter The Operator : ");
						String op = ob.next();
						
						if(op.equals("+")){
							System.out.println("\t The Addition is :"+(val1+val2));
						}
						else if(op.equals("-")|| op.equals("_")){
							System.out.println("\t The Subtraction Is : "+(val1-val2));
						}
						
						else if(op.equals("x")|| op.equals("*")){
							System.out.println("\t The Multiplication is : "+(val1*val2));
						}	
						
						else if(op.equals("/")|| op.equals("\\")){
							System.out.println("\t The Division Is "+(val1/val2));
						}
						else{
							System.out.println("Invalid Operator  ... !! ");
						}
						
					}//end of option==1 simple Calculator
					
					
					else if(option==2){
						do{
							
						
						
						System.out.println("\t ***** Menu Calculator *****");
						System.out.println("\n");
						
						System.out.println("1) Addition ");
						System.out.println("2) Subtraction ");
						System.out.println("3) Multiplication ");
						System.out.println("4) Division ");
						System.out.println("5) Remainder ");
						System.out.println("6) BACK  \n"); 
							
						System.out.print("Enter The option From Menu : ");
						int menuOption =ob.nextInt();
						
						if(menuOption==1){
							System.out.print("\n Enter 1st Value : ");
							int val1 =ob.nextInt();
							
							
							System.out.print(" Enter 2nd Value : ");
							int val2 =ob.nextInt();
							
							System.out.println(" \t The Addition Is : "+(val1+val2));
							
						}
						else if(menuOption==2){
								System.out.print("\n Enter 1st Value : ");
								int val1 =ob.nextInt();
							
							
							System.out.print(" Enter 2nd Value : ");
							int val2 =ob.nextInt();
							
							System.out.println(" \t The Subtraction Is : "+(val1-val2));						
						}
						
						else if(menuOption==3){
							
							System.out.print("\n Enter 1st Value : ");
							int val1 =ob.nextInt();
							
							System.out.print(" Enter 2nd Value : ");
							int val2 =ob.nextInt();
							
							System.out.println(" \t The Multiplication Is : "+(val1*val2));
							
						}
						
						else if(menuOption==4){
							System.out.print("\n Enter 1st Value : ");
							int val1 =ob.nextInt();
							
							System.out.print(" Enter 2nd Value : ");
							int val2 =ob.nextInt();
							
							System.out.println(" \t The Division Is : "+(val1/val2));
						}
						
						else if(menuOption==5){
							System.out.print("\n Enter 1st Value : ");
							int val1 =ob.nextInt();
							
							System.out.print(" Enter 2nd Value : ");
							int val2 =ob.nextInt();
							
							System.out.println(" \t The Remainder Is : "+(val1%val2));
						}
						
						else if(menuOption==6){
							break;
						}
						
						else if(menuOption>6 || menuOption<=0){
							System.out.println("\n Invalid Selection .. ! ");
						}
						
						}while(true);//End of Menu Calulator Do_While 
							
					}//end of option==2 Menu Calculator
					
					
					else if(option==3){
						break;
					}//End of option==3 back 
					
					else if(option>3 || option<=0){
						System.out.println("\n Invalid Selection .. ! ");
					}
				
				}while(true);//End of Calulator Do_While 
				
				}// *************  end select==1 Calculator ************
				
				//******* MArksheet Start From here 
				
			else if(select==2){
			
			do{			
				System.out.print("Enter Your Percent here : ");
				int grade = ob.nextInt();
			
				String con="";
			
			
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
			
			System.out.print("Do you want to continue Y/N : ");
			con=ob.next();
			
				if(con.equals("n")){
				break;
				}
				
			/*	else if(con.equals("Y")|| con.equals("y")){
			
				}*/
			
			}while(true);
		}//********** End of select==2 Mark sheet 
			
			
				else if(select==3){
					
					do{
						System.out.print("\n");
						System.out.println("1) Fi bionic Series ");
						System.out.println("2) Odd Series ");
						System.out.println("3) Even Series ");
						System.out.println("4) Square Series ");
						System.out.println("5) Factorial  Series ");
						System.out.println("6) BACK ");
						System.out.println("\n");
						
							System.out.print("Enter Your Option : ");
							option= ob.nextInt();
							
								if(option==1){
									
									int fst=0;
									int sec=0;
									int sum=1;
									
									System.out.print("Enter A Number : ");
									int num =ob.nextInt();
									for(int i=1; i<=num; i++){
										

										
										System.out.print(sum+",");
										fst=sec;
										sec=sum;
										sum=fst+sec;
									}
									System.out.print("\n");
								}//*********ENd OF FIBIONIC SERIES 
								else if(option==2){
									System.out.print(" \n ******  The ODD SERIES  ");
									System.out.print("Enter A Number : ");
									int num =ob.nextInt();
									int i=1;
									while(i<=num){
										
										System.out.print(i+",");
										i=i+2;
									}
								}//************END OF ODD SERIES 	
								
								
								else if(option==3){
									
									System.out.print(" \n ******  The EVEN SERIES  ");
									System.out.print("Enter A Number : ");
									int num =ob.nextInt();
									int i=0;
									while(i<=num){
										
										System.out.print(i+",");
										i=i+2;
									}
									
								}//*********END OF EVEN SERIES 
								
								else if(option==4){
									System.out.println(" \n ******  The SQUARE SERIES ******** ");
									
									System.out.print("Enter A Number : ");
									int num =ob.nextInt();
									
									int result=1;
									for(int i=1; i<=num; i++){
										
										result =i*i;
										System.out.println(result);
									}
									
									System.out.println("\n");
									
								}//******ENd OF SAQUARE SERIES 
								
								else if(option==5){
									
									System.out.print("Enter A Number : ");
									int num = ob.nextInt();
									int fac=1;
									for(int i=1; i<=num; i++){
									
										for(int j=1; j<=i; j++){
											System.out.print(j+"x");
										}
										fac= fac*i;
										System.out.println("= "+fac);
									}	
								}//********END OF FACTORIAL SERIES
								
								
								else if(option==6){
									
									break;
								}//********END OF BACK SERIES OPTION 
								
								else if(option>6 || option<=0){
									System.out.println("sorry Invalid Option Choosen ... !! \n ");
								}
								
					}while(true);
					
				}//***********End of select==3 Series 
			
				else if(select==4){
					
					System.out.println("************ AGE COMPARATOR *********** \n ");
					
					System.out.print("Enter 1st Age : ");
					int age1= ob.nextInt();
					
					System.out.print("Enter 2nd Age : ");
					int age2= ob.nextInt();
					
					System.out.print("Enter 3rd Age : ");
					int age3= ob.nextInt();

						if(age1<age2){
							System.out.println("Age 2 is Greater . "+age2);
						}
						
						else if(age2<age3){
							System.out.println("Age 3 is Greater . "+age3);
						}
						
						else if(age1<age3){
							System.out.println("Age 3 is Greater . "+age3);
						}
						
				}//************END OF SELECT===4 AGE COMPARATOR  
				
				else if(select==5){
					
					System.out.println("**********ABOUT *************");
					System.out.println("NAME  : SYED ZAIN ALI \n STUDY : BC( CS ) \n THIS PROGRAM IS MADE BY ME   ");
					
				}//END ABOOUT SELECT==5 
				
				else if(select==6){
					
					System.exit(0);
				}//END MAIN SELECT MAIN EXIT
				
				else if(select<1 || select>6){
					System.out.println("Sorry Invalid Selection .. ! ");
				}
				
				
		}while(true);//main MEnu Do_While
	
	}//end of main 
}