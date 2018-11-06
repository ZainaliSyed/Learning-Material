import java.util.*;
	class PushPop{
		public static void main(String args[]){
			Scanner ob = new Scanner(System.in);
			
			int arr[] = new int [8];
				int loc =0; 
				while(true){
					
					System.out.println("1) Push ");
					System.out.println("2) Pop ");
					System.out.println("3) Exit \n ");
						
						System.out.print("Enter Selection : ");
						int select = ob.nextInt();
						
						int size=arr.length-1;
						int i=0;
						if(select==1){ 
						
							if(loc<=size){
						System.out.print("Enter A number To Push : ");
						int push = ob.nextInt();
						System.out.println("["+loc+"] : "+push);
						arr[loc] =push;

								
						System.out.println("  ******Push array \n");
							for(i=0; i<=loc; i++){
								System.out.println("["+i+"] :"+arr[i]);
							}
							System.out.println();	
						}//end of loc 
							
						if (loc>=8){
						System.out.println("Stack over Flow ");
						loc--;
						}
						
						loc++;
						
						}//end of select==1
							
					
					
					
					else if(select==2){
						loc--;
						if(loc>=0){
						arr[loc]=0;
						for(int p=0; p<=loc; p++){
						System.out.println("["+p+"] : "+arr[p]);
						}
						
						System.out.println();						
						}//end of if loc 
					
						
						if(loc<0){
							System.out.println("Stack Under Flow Push Elements Now ");
							loc++;
						}
					}//end of select==2	
					
					
	
				}//end of while 
			
		}//end of main Method 
	}