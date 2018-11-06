import java.util.*;
class SelectFeet{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	
	System.out.println("1) Inches  TO Feets");

	System.out.println("2) Feets To Inches");
	
	System.out.println("3) Kilo To Gram");
	
	System.out.println("4) Gram To Kilo");
	
	System.out.println("5)About Developer ");
	
	System.out.println("6) Exit");	
	
	
	System.out.print("Please enter the selection ");
	int sel = ob.nextInt();
	
	if(sel==1){
	System.out.print("Please enter the inches  :");
	int inch = ob.nextInt();
	
	int feet = inch/12;
	int reminch= inch%12;
	System.out.println(" Feets  are :"+feet);
	System.out.println(" Inches  are :"+reminch);
	}
	
	if(sel==2){
	System.out.print("Please enter the feet  :");
	int feet = ob.nextInt();
	
	int inch = feet*12;
	System.out.println(" Feets  are :"+inch);
	
	}
	
	if(sel==3){
	System.out.print("Please enter the Kilogram  :");
	int kilo = ob.nextInt();
	
	int gram = kilo*1000;
	System.out.println(" Grams   are :"+gram);
	
	}
	
	if(sel==4){
	System.out.print("Please enter the Gram  :");
	int gram = ob.nextInt();
	
	int kilo= gram/1000;
	int remgram =gram%1000;
	System.out.println(" Kilo   are :"+kilo);
	System.out.println(" Grams   are :"+remgram);
	
	}
	
	if(sel==5){
	System.out.println(" \n HeLLo this  is  Syed Zain Ali \n  \n Future  java  Developer ..!");
		//System.out.println(" Future  java  Developer ..!");
	}
	
	if(sel==6){
	System.out.println(" GooD  ByE ");
	}
	
	if(sel>6 || sel<=0){
	System.out.println(" ILLigal Selection");
	}
	
	}
}