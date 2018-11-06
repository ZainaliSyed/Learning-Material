import java.util.*;

class Season{
	public static void main(String arg[]){
	 Scanner ob =new Scanner(System.in);
	System.out.print("Enter Season Month: ");
	int season=ob.nextInt();
	
	
	if(season==11||season==12||season==1){
	
	System.out.print("Winter Seasson");
	}
	
	if(season==2||season==3||season==4)
	{
	
	System.out.print("Spring Seasson");
	}
	if(season==5||season==6||season==7)
	{
	System.out.print("Summer Seasson");
	}
	if(season==8||season==9||season==10)
	{
	System.out.print("Autom Season");
	}
	if(season>12 || season<1)
	{
	System.out.print("Invalid Month Number");
	}
	
	
	
	
	}
	}