import java.util.*;
	public class BinaryDemo{
		public static void  main(String args[]){
			Scanner ob = new Scanner(System.in);

				
		int arr [] = {10,20,30,40,50,60,70,80,90,100};
		System.out.print("Please Enter a No : ");
		int item = ob.nextInt();
	
			int loc=0;
			int k;
			int i;
			int	mid=arr.length/2;
			
			for(i=0;i<arr.length;i++){
				
				if(item<arr[mid] && item==arr[i]){
				 loc=i;
				 System.out.println(""+item+"Item In loc "+loc);
				break;
				}
				else if(item>arr[mid] && item==arr[i]){
				loc=i;
				System.out.println(""+item+"Item In loc"+loc);
				break;
				}
						
					
								
				
			}
		}
	
	}