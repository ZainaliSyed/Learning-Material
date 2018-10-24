import java.util.*;
	class ThreeDimentionTable{
		public static void main(String args[]){
			Scanner ob  =new Scanner(System.in);
			
			System.out.print("Enter No Of Rows : ");
			int row =ob.nextInt();
			
			System.out.print("Enter No of column : ");
			int col = ob.nextInt();
						
			System.out.print("Enter No of Tables : ");
			int tab = ob.nextInt();
			
			int arr [] [] [] = new int [row][col][tab];
				
			for(int t=0; t<tab; t++){
				
				System.out.println("Table : "+t);
				
				for(int r=0; r<row; r++){
					for(int c=0; c<col; c++){
						System.out.print("["+r+"]"+"["+c+"] : ");
						arr[r][c][t] =ob.nextInt();
					}
					
				}//end of row for 
					System.out.println();
			}//end of no of table 
			
				for(int t1=0; t1<tab; t1++ ){
					System.out.println("Table : "+t1);
					for(int r1=0; r1<row; r1++){
						for(int c1=0; c1<col; c1++){
							System.out.print(" "+arr[r1][c1][t1]);
						}
						System.out.println();
					}
						System.out.println();
				}//end of table for
			
		}//end of main Method 
	}