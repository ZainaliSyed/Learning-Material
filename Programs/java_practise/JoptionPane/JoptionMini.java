import javax.swing.*;
class JoptionMini{
	public static void main(String args[]){
	//Scanner ob = new Scanner(System.in);	
	
	
	String mainMenu="";
	int select=1;
	
	String optionMenu="";
	int option=1;
	
	String val1="",val2="",op="";
	int num1=1,num2=1,result=1;
	
		do{
			mainMenu = JOptionPane.showInputDialog("1) Calculator \n 2) Age Comparator  \n 3) MarkSheet \n 4) Series \n 5) About \n 6) Exit ");	
			select=Integer.parseInt(mainMenu);
			
				if(select==1){
					
					do{
					optionMenu = JOptionPane.showInputDialog("********* CALCULATOR MENUE *********\n 1) Simple Calculator \n 2) Menue Calculator \n 3) BACK ");
					option=Integer.parseInt(optionMenu);
					
						if(option==1){
							
						val1 =JOptionPane.showInputDialog("Enter 1st Value : ");
						num1=Integer.parseInt(val1);
						
						val2=JOptionPane.showInputDialog("Enter 2nd Value : ");
						num2=Integer.parseInt(val2);
						
						op = JOptionPane.showInputDialog("Enter Your Operator : ");
						
							if(op.equals("+")){
							result= num1+num2;
							
							JOptionPane.showMessageDialog(null,"The Addition is : "+result);	
							}
							
							else if(op.equals("-")|| op.equals("_")){
								result=num1-num2;
								JOptionPane.showMessageDialog(null,"The Subtraction is : "+result);
							}
							
							else if(op.equals("/")|| op.equals("\\")){
								result=num1/num2;
								JOptionPane.showMessageDialog(null,"The division is  : "+result);
							}
							else if(op.equals("x")|| op.equals("*")){
								result=num1*num2;
								JOptionPane.showMessageDialog(null,"The Multiplication : "+result);
							}
						
						}  //END OF SIMPLE CALCULATOR 
						
						
						else if(option==2){
							
							do{
								String menuCalulator =JOptionPane.showInputDialog("1) Addition \n 2) Subtraction \n 3) Multiplication \n 4) Division \n 5) Remainder \n 6) BACK \n ");
								int menucal =Integer.parseInt(menuCalulator);
								
									if(menucal==1){
										val1= JOptionPane.showInputDialog("Enter 1st VAlue : ");
										num1=Integer.parseInt(val1);
										
										val2= JOptionPane.showInputDialog("Enter 2nd VAlue : ");
										num2=Integer.parseInt(val2);
										
										result=num1+num2;
										JOptionPane.showMessageDialog(null,"The Addition is : "+result);
									}
									
									else if(menucal==2){
										val1= JOptionPane.showInputDialog("Enter 1st VAlue : ");
										num1=Integer.parseInt(val1);
										
										val2= JOptionPane.showInputDialog("Enter 2nd VAlue : ");
										num2=Integer.parseInt(val2);
										
										result=num1-num2;
										JOptionPane.showMessageDialog(null,"The Subtraction is : "+result);
									}
									
									else if(menucal==3){
										val1= JOptionPane.showInputDialog("Enter 1st VAlue : ");
										num1=Integer.parseInt(val1);
										
										val2= JOptionPane.showInputDialog("Enter 2nd VAlue : ");
										num2=Integer.parseInt(val2);
										
										result=num1*num2;
										JOptionPane.showMessageDialog(null,"The Multiplication is : "+result);
									}
									
									else if(menucal==4){
										val1= JOptionPane.showInputDialog("Enter 1st VAlue : ");
										num1=Integer.parseInt(val1);
										
										val2= JOptionPane.showInputDialog("Enter 2nd VAlue : ");
										num2=Integer.parseInt(val2);
										
										result=num1/num2;
										JOptionPane.showMessageDialog(null,"The Division is : "+result);
									}
									
									else if(menucal==5){
										val1= JOptionPane.showInputDialog("Enter 1st VAlue : ");
										num1=Integer.parseInt(val1);
										
										val2= JOptionPane.showInputDialog("Enter 2nd VAlue : ");
										num2=Integer.parseInt(val2);
										
										result=num1%num2;
										JOptionPane.showMessageDialog(null,"The Remainder is : "+result);
									}
									else if(menucal==6){
										break;
									}
									else if(menucal>6 || menucal<=0){
										JOptionPane.showMessageDialog(null,"Sorry Invalid Option  ...... ! ");
									}
									
									
							}while(true);//for menu calculator
						}
						
						else if(option==3){
							break;
						}
						
						else if(option>3 || option<=0){
							JOptionPane.showMessageDialog(null,"Sorry Invalid Option  ...... ! ");
						}
						
					}while(true);//for continue calculator 
				}//END OF SELECT==1 CALCULATOR 
				
					// ********* AGE COMPARATOR START HERE  ********** 
					
				else if(select==2){
					
					do{
						String  person1 =JOptionPane.showInputDialog(" enter your 1st Age :  ");
						int age1=Integer.parseInt(person1);
						
						String  person2 =JOptionPane.showInputDialog(" enter your 2nd Age :  ");
						int age2=Integer.parseInt(person2);						
						
						String  person3 =JOptionPane.showInputDialog(" enter your 3rd Age :  ");
						int age3=Integer.parseInt(person3);
							if(age1>age2 && age1>age3){
							JOptionPane.showMessageDialog(null,"The Age 1 is Greater :"+age1);
							}
						
							else if(age2>age1 && age2>age3){
								JOptionPane.showMessageDialog(null,"The Age 2 is Greater :"+age2);
							}
							else if(age3>age1 && age3>age2){
							JOptionPane.showMessageDialog(null,"The Age 3 is Greater : "+age3);
							}
						
							String con =JOptionPane.showInputDialog("Do you Want to Continue  Y/N : ");
								if(con.equals("n")|| con.equals("N")){
									break;
								}
						
						}while(true);//for continue age comparator 
				}//END OF SELECT==2 AGE COMPARATOR
				
									//******** MARK SHEET START HERE ********
				else if(select==3){
					
					String per =JOptionPane.showInputDialog("Enter Your Percent here : ");
					int grade = Integer.parseInt(per);
			
					if(grade<50){
					JOptionPane.showMessageDialog(null,"Sorry you are Fail ..!!");
					}
		
					else if(grade>=51 && grade<=60){
					JOptionPane.showMessageDialog(null,"You Have Got D Grade .");
					}
					else if(grade>=61 && grade<=70){
					JOptionPane.showMessageDialog(null,"You have Got C Grade ");
					}
					else if(grade>=71 && grade<=80){
					JOptionPane.showMessageDialog(null,"You have got B Grade ");
					}
					else if(grade>=81 && grade<=90){
					JOptionPane.showMessageDialog(null,"You have got A grade ");
					}
		
					else if(grade>=91 && grade<=100){
						JOptionPane.showMessageDialog(null,"You have Got A+ ");
					}
		
					else if(grade>100){
						JOptionPane.showMessageDialog(null,"Sorry Invalid Number Should be less than 100  ..!!");
					}
			
					
				}//******** END OF SELECT==3 MARK SHEET
								//****** SERIES START HERE *******
				else if(select==4){
					
					do{
						optionMenu =JOptionPane.showInputDialog("***** Series ******* \n 1) Even \n 2) odd \n 3) Fibionic Series \n 4) Factorial \n 5) Square \n 6) BACK ");
						option = Integer.parseInt(optionMenu);
							if(option==1){
								String str ="";
								for(int i=0; i<=20; i=i+2){
									str =str+i+"\n";
								}
								JOptionPane.showMessageDialog(null,str);
							}
							
							else if(option==2){
								String str ="";
								for(int i=1; i<=20; i=i+2){
									str = str+i+"\n";
								}
								JOptionPane.showMessageDialog(null,str);
							}
							
							else if(option==3){
								String str ="";
								int fst=0,sec=0,sum=1;
								
								for(int i=1; i<=20; i++){
									fst=sec;
									sec=sum;
									sum =fst+sec;
									str= str+sum+"\n"; 
								}
								JOptionPane.showMessageDialog(null,str);
							}
							else if(option==4){
								int fac=1;
								String factorial= JOptionPane.showInputDialog("Enter Number of Factorial : ");
								int num = Integer.parseInt(factorial);
								String str="";
								for(int i=1; i<=num; i++){
									
									for(int j=1; j<=i; j++){
										
										str =str+j+"x";
									}
									fac =fac*i;
									str =str+" = "+fac+"\n";
									
								}
								JOptionPane.showMessageDialog(null,str);
							}
							
							else if(option==5){
								
								String square =JOptionPane.showInputDialog("Enter The Number You Like : ");
								int sq =Integer.parseInt(square);
								
									String str ="";
									for(int i=1; i<=sq; i++){
										result=i*i;
										str =str+result+"\n";
										
									}
									JOptionPane.showMessageDialog(null,str);
							}
							
							else if(option==6){
								break;
							}
							
							else if (option>6 || option<=0){
								JOptionPane.showMessageDialog(null,"Sorry Invalid Selection .. ! ");
							}
							
					}while(true);
				}// END OF SELECT==4 SERIES 
				
							//******** START OF SELECT==5 ABOUT *******
				else if(select==5){
						JOptionPane.showMessageDialog(null,"This Program is Made by Syed Zain Ali  \n Study : BS(CS) ");
				}//END OF SELECT==5
				
				else if(select==6){
					System.exit(0);
				}
				
				else if(select>6 || select<=0){
					JOptionPane.showMessageDialog(null,"Sorry Invalid Selection .. !");
				}
				
		}while(true);//**********END OF MAIN DO_WHILE 
		
		
	}//END OF MAIN
}//END OF CLASS 