import java.util.*;
	public class LinearSearch{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int counter=1,j,no;
	
		System.out.println(" \t  You have 3 Chance to Guss a no .. \n");
		do{
		
		
	
	//int totalSize = i.length;
	System.out.print("Please Enter a "+(counter++)+" Chance :"); 
	no = ob.nextInt();
	int [] i =  {2,50,10,40,60};
	for(j=0; j<i.length; j++ ){
	
		if(i[j]==no){
		System.out.println("The No you Enter "+no+" is at Position : "+(j+1));
		System.out.println(" Congratulation Match Found ...");
		break;
		}	//End of if 	
	
	}
	
	if(	i==i.length){
		
		System.out.println("Match not Found ..!! ");
	} 
		//System.out.println();
		}while(counter<=3 && i[j]==no);//
	

	
	
	}
	}
	
	