import java.util.*;
class Season{
	Scanner ob =new Scanner(System.in);
	void seasonChange(){
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
	
	}
}