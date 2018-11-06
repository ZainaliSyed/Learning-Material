import java.util.*;
	public class ForTwotri{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	int mid=1;
	System.out.print("Please Enter The Odd no :");
	int no = ob.nextInt();
	
		for(int height=1; height<=no; height++){
			
			for(int row=no; row>=height; row--){
			System.out.print("");
			
				for(int k=1; k<=row; k+=2){
				System.out.print("");
				}
			
			}

			System.out.println("");
		}
		
	
	}
	}