import java.util.*;
class BinarySearchAlgorithm{
		
		public static void main(String args[]){
			Scanner ob= new Scanner(System.in);	
			
			
			int arr[] = new int [15];
			Random rand = new Random();
			
			int ascCounter =0;
			int decCounter =0;
			
			int first,last,middle;
			do{
			
			
			
			System.out.println("\n");
			System.out.println("1) Insert Data in Array ");
			System.out.println("2) Display Asscessding Iterations  ");
			System.out.println("3) Display Decending Iterations  ");
			System.out.println("4) Display Binary Search  \n ");
			
			System.out.print(" PLEASE MAKE SELECTION :  ");
			int selection = ob.nextInt();
			
			
				 if(selection==1){
					
					
					for(int i=0; i<arr.length-1; i++){
						int  n = rand.nextInt(10000) + 1;
						arr[i] = n;
					}
					
				}//end of if
				
				if(selection==2){
					
					int i,temp;
					ascCounter=0;
					for(i=0; i<arr.length-1; i++){
						
						for(int k=i; k<arr.length-1; k++){
							if(arr[i]>arr[k+1]){
								temp= arr[k+1];
								arr[k+1] =arr[i];
								arr[i] = temp;
								ascCounter=ascCounter+1;
							}
						}
					}//end of outer for 
	
					System.out.println("No Of ass Iterations :"+ascCounter);
					
				}//end of selection==2
				
				
				
				if(selection==3){
					
					int i,j,temp;
					
					decCounter=0;
					for(i=0; i<arr.length-1; i++){
						
						for(int k=i; k<arr.length-1; k++){
							if(arr[i]<arr[k+1]){
								temp= arr[k+1];
								arr[k+1] =arr[i];
								arr[i] = temp;
								decCounter=decCounter+1;
							}
						}
							
						System.out.println((i+1)+") "+arr[i]);
					
					}//end of outer
	
					System.out.println("No Of Iterations :"+decCounter);
					
				}//end of selection==3
			
			
				
				if(selection==4){
					 //arr[] ={11,12,13,14,15,16,17,18,19,20};
					
					
					System.out.println("Enter the search value:");
					int item = ob.nextInt();
      first = 0;
      last = arr.length-1;
       middle = (first + last)/2;

      while( first <= last){
         if ( arr[middle] < item ){
			first = middle + 1; 
		 }
           
         else if ( arr[middle] == item )
         {
           System.out.println(item + " found at location " + (middle + 1) + ".");
           break;
         }
         else
         {
             last = middle - 1;
         }
         middle = (first + last)/2;
      }
	  /*
      if ( first > last ){
		  System.out.println(item + " is not found.\n");
	  }*/
          
					
					
		}//end of selection==4
			
			}while(true);
			
			
		}//end of main
		
}//end of class 