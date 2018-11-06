import java.util.*;
class LinearDemo{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int chance = 1, k=1;
	
	while(true){
	int [] i = {2,4,8,10,20};
	int j;
	
	System.out.print("Please Enter "+(k++)+" : ");
	int no = ob.nextInt();
		for(j=0; j<i.length; j++){
		if(i[j]==no){
		System.out.println("The No has Found ");
		
		break;
		
		}
	break;
		}
		
	if(k>3){
	System.out.print("Match not found ...!! ");
	System.exit(0);
	}
	
	} //end of while 
	
	
	
	}
}