import java.util.*;
	class UniProject{
		public static void main(String args[]){
			Scanner ob = new Scanner(System.in);
			
			int crime [][] = new int [5][5];
			String crimeName[] = {"murder    :","extortion :","Fraud     :","Harassment:","Kidnapping:"};
			
				for(int row=0; row<5; row++){
						System.out.println("Enter Views "+row+" Person \n");
					for(int c=0; c<5; c++){
						System.out.print("Enter crime "+crimeName[c]+" rate 1 to 10 : ");
						crime[row][c] =ob.nextInt();
					}
					
					System.out.println();
				}
				
				
					int crimeTotal[][] = new int [5][5];
					int total [] = new int [5];
					int sum =0;
						System.out.print(" \n *******The Sunm of Total crime are \n ");
					System.out.println();
					for(int i=0; i<5; i++){
						for(int j=0; j<5; j++){
							sum =sum+crime[j][i];
						}
						total[i] =sum;
						sum=0;
						
					}//end of i loop
					
					//sorting portion 
						
						for(int desc=0; desc<total.length-1; desc++){
							for(int a=0; a<total.length-(desc+1); a++){
								if(total[a]<total[a+1]){
									int temp= total[a+1];
									total[a+1]=total[a];
									total[a]=temp;
									
									String tempString =crimeName[a+1];
									crimeName[a+1]=crimeName[a];
									crimeName[a]=tempString; 
								}
								
							}
						
						}//outter 
						
						for(int j=0; j<total.length; j++){
							System.out.println("The Sum of "+crimeName[j]+" crime is  : "+total[j]);
						}
					
					
					//graph portion
						int num =220;
						char c = (char)num;
						
					for(int s=0;s<5;s++){
						System.out.print(""+crimeName[s]+"");
						for(int z=0;z<total[s];z++){
							System.out.print(""+c);
						}
							System.out.println();
					} 
				
		}//end of main Method 
	}//end main class