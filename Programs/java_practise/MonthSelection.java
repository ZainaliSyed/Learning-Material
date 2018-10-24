import java.util.*;
class MonthSelection{

	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	System.out.print("Please enter the  Month  1 to 12 :");
	int month = ob.nextInt(); 
	
	if(month==11 || month==12 || month==1){
		System.out.println(" This  is Winter Month ..");
		}
	else if(month==2 || month==3 || month==4){
		System.out.println("This is Spring Month ");
		}
	else if(month==5 || month==6 || month==7){
		System.out.println("This is Summer Month ");
		}
	else if(month==8 || month==9 || month==10){
		System.out.println("This is Autumn");
		}
	else if(month<=0|| month>12){
		System.out.println("Invalid Month  ");
	}
	
	}
}