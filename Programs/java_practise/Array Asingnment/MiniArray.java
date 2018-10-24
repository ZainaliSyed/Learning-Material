import java.util.*;
class MiniArray{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	int i;
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		do{
		System.out.println(" ");
		System.out.println(" \t \t  ******MAin Menu ******");
		System.out.println("1) Searching");
		System.out.println("2) Deletion");
		System.out.println("3) Insertion");
		System.out.println("4) Traversing");
		System.out.println("5) Exit"); 
		
		System.out.print("Please Enter The Selection : ");
		int select = ob.nextInt();
		
		
		
		if(select==1){
		
			do{
		System.out.println(" \t \t---- Searching ------");
		System.out.println("1) Search Item ");
		System.out.println("2) Search Greater Item ");
		System.out.println("3) Search Smaller Item ");
		System.out.println("4) Back ");
			
		System.out.println("");
		System.out.print("Please Enter Your Choice : ");
		int choice = ob.nextInt();
		System.out.println("\n");
		
			if(choice==1){
			boolean found = false;
			System.out.print("Please Enter The Item You want to Search : ");
			int item = ob.nextInt();
			
				
				for(i=0; i<arr.length; i++){
					if(arr[i]==item){
					System.out.println("Your Item is : "+item);
					System.out.println("At The Location : "+i);
					System.out.println(" ");
					found = true;
					break;
					}
					
				}
				
				if(found==false){
				System.out.println("Your Number "+item+" does not found ...!!");
				}
		
		} //end of choice==1
		
		if(choice==2){
	
			System.out.println(" \t Your Array Elements  are \n");
			int j;
			int largest = arr[0];
			
			for(j=0; j<arr.length; j++){
			System.out.println(arr[j]);
	
			if(arr[j]>largest){
			largest = arr[j];
			}
		
		
	 
			}
	
			System.out.println("The Largest no is : "+largest);
	
			
			
		} // End of Choice 2
		
		
		if(choice==3){
	
			System.out.println(" \t Your Array Elements  are \n");
			int j;
	
			int smallest =arr[0];
			for(j=0; j<arr.length; j++){
			System.out.println(arr[j]);
		
			if(arr[j]<arr[0]){
			smallest = arr[j];
			}
	 
			}
	
			System.out.println("The Smallest no is : "+smallest);
		
		}//End of Choice 3
		
		if(choice==4){
		break;
		}//end of choice==4
		
		if(choice>4){
		System.out.println(" \t Invalid Selection ...!!! ");
		}
		
			}while(true);// nested while of Select 1
		
		}// end of select==1 
		
		
				// select 2 start here 
		if(select==2){
			System.out.print("Enter the Location you want to delete  ");
			int loc = ob.nextInt();
	
			int j;
			for(j=loc; j<arr.length-1; j++){
			arr[j] = arr[j+1];	
		}
	
			arr[arr.length-1] =0;
	
			int k;
			for(k=0; k<arr.length; k++){
			System.out.println("["+k+"] = "+arr[k]);
			}
		

		}//end of select 3
		
		if(select==3){
	
			System.out.print("Enter Location :");
			int loc = ob.nextInt();
		
			System.out.print("Enter Item :");
			int item = ob.nextInt();
		
		
			for(int j=arr.length-1; j>loc; j--){
		
			arr[j] = arr[j-1];
			}
			arr[loc] = item;
			for(int r=0;r<arr.length;r++){
		
			System.out.println("["+r+"]="+arr[r] );
		
			}
			
			
		}// end of select==3 insertion
		
		if(select==4){
		
		System.out.println(" \t ***Traversing *** ");
			for(int j=0; j<arr.length; j++){
			System.out.println("["+j+"] = "+arr[j]);
			}
		} //end of Traversing
		
		if(select==5){
		System.out.println("Good Bye ..!!!");
		System.exit(0);
		}
		
		if(select>5){
		
		System.out.println("Invalid Selection ...!!!");
		}
		
		}while(true);
	
	
	}

}