import java.util.*;
	class ArrayProject{
		public static void main(String args[]){
			Scanner ob =new Scanner(System.in);
			
			String arr [] = {"50","99","15","19","20"};
			
			do{
				System.out.println("1) Ascending ");
				System.out.println("2) Descending ");
				System.out.println("3) Traversing ");
				System.out.println("4) Exit ");
				
				System.out.print("Enter Selection : ");
				int select = ob.nextInt();
					
					if(select==1){
						
						System.out.println("1)	Numerial ");
						System.out.println("2)	Alphabetic  ");
						
						System.out.print("Select Order You Like : ");
						int order =ob.nextInt();
						
							if(order==1){
								
								for(int i=0; i<arr.length; i++){
									for(int j=0; j<arr.length-1; j++){
										
										
										int c =Integer.parseInt(arr[j]);
										int c2=Integer.parseInt(arr[j+1]);
										
										
										if(c>c2){
										    String temp =arr[j];
											arr[j]=arr[j+1];
											arr[j+1]=temp;
										}
										
									}
								}//enf of for 
								
								System.out.println("Ascending Numerically Done \n ");
								
							}// end of order ==1 
						
								
								
							if(order==2){
								for(int i=0; i<arr.length; i++){
									for(int j=0;j<arr.length-1; j++){
										int code =arr[j].compareTo(arr[j+1]);
										if(code>0){
											String temp = arr[j];
											arr[j]=arr[j+1];
											arr[j+1]=temp;
										}
									}
								}	//end of outter loop 
									System.out.println("Ascending Done Successfully \n ");
							}
						
					}
					
						else if(select==2){
							
							System.out.println("1)	Numerial ");
							System.out.println("2)	Alphabetic  ");
						
							System.out.print("Select Order You Like : ");
							int descorder =ob.nextInt();
							
							if(descorder==1){
								for(int i=0; i<arr.length; i++){
									for(int j=0; j<arr.length-1; j++){
										
										int c =Integer.parseInt(arr[j]);
										int c2 = Integer.parseInt(arr[j+1]);
											if(c<c2){
												String temp =arr[j];
												arr[j]=arr[j+1];
												arr[j+1]=temp;
											}
									}
									
								}//end of outter loop 
								
								System.out.println("Descending Numerically Done  ... ! \n");
							}//end of order==1
							
							if(descorder==2){
								for(int i=0; i<arr.length; i++){
									for(int j=0;j<arr.length-1; j++){
										int code =arr[j].compareTo(arr[j+1]);
										if(code<0){
											String temp = arr[j];
											arr[j]=arr[j+1];
											arr[j+1]=temp;
										}
									}
								}	//end of outter loop 
								
								System.out.println("Descending Alphabetic  Done Successfully \n  ");
							}
							
						}//end of select==2
						
						
						if(select==3){
							
							for(int i=0; i<arr.length; i++){
								System.out.println(arr[i]+"");
							}
							
						}//end of select==3
				
						if(select==4){
							System.exit(0);
						}
						
						if(select>4){
							System.out.println("Invalid Selection .. ! \n ");
						}
			}while(true);
		}//end of main
		
	}