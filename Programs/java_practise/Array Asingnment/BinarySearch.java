import java.util.*;
	class BinarySearch{
		public static void main(String args[]){
			Scanner ob =new Scanner(System.in);
			
		int arr[] ={11,12,13,14,15,16,17,18,19,20};
		
			System.out.print("Enter Item you Like : ");
			int item = ob.nextInt();
			int size=(arr.length-1)/2;
				while(true){
						/*try{
							Thread.sleep(10);
							
						}catch(Exception e){} */
						
						if(arr[size]==item){
							System.out.println("Item Found .. "+arr[size]);
							break;
						}
						if(arr[size]<item){
							size=(size+arr.length)/2;
						}	
						if(arr[size]>item){
						size=size/2;
						}
						
						/*if(item!=arr[size]){
							System.out.println("Item Not Found .. ! ");
						} */
						
				}//end of while loop
			
		}
	}