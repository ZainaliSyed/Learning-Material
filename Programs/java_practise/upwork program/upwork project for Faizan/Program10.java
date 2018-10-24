import java.util.*;
public class Program10{
	public static void main(String args[]){

		int small =0;
		int inderSmall=0;
		int arr [] = {10,1,50,70,100,0};
		for(int i=0; i<arr.length; i++){
			small =arr[0];
			if(arr[i]<small){
			small = arr[i];
			inderSmall = i;
			}
			
		}
				
		System.out.println("The Smallest No is  : "+small+" and Location is  : "+inderSmall);
		
	}//end of main
}