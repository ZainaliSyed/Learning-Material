import java.util.*;
	class FrontRear{
		public static void main(String args[]){
			Scanner ob = new Scanner(System.in);
			
			int frontloc = 0;
			int rearLoc =0;
			int arr [] = new int [8];
			while(true){
			
				System.out.println("1) Front ");
				System.out.println("2) Rear ");
				System.out.println("3) EXIT \n ");
				
				System.out.print("Enter Selection : ");
				int select = ob.nextInt();
					if(select==1){
						System.out.print("Enter Number : ");
						int front = ob.nextInt();
							
						arr[frontloc]=front;
						
						
						for(int i=0; i<=frontloc; i++){
							System.out.println("["+i+"] : "+arr[i]);
						}
						System.out.println();
						frontloc++;
							
						if(frontloc==8){
							frontloc=0;
							if(arr[0]==0){
								arr[frontloc]=front;
								for(int j=0; j<arr.length; j++){
									System.out.println("["+j+"] : "+arr[j]);
								}
							}

							if(arr[frontloc]){
								
							}
							
						}//continue if  
						
					}//end of select==1
					
					else if(select==2){
						arr[rearLoc]=0;
						
						for(int i=0; i<frontloc; i++){
							System.out.println("["+i+"] : "+arr[i]);
						}
						System.out.println();
						rearLoc++;
					}//end of select ==2 
				
			}//end of while 
			
		}//end of main Method 
	}