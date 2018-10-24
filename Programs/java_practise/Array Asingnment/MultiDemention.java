import java.util.*;
	class MultiDemention{
		public static void main(String args[]){
			Scanner ob = new Scanner(System.in);
			
			
			
			System.out.print("Enter Number Of Rows : ");
			int row =ob.nextInt();
			
			System.out.print("Enter Number Of Columns : ");
			int col =ob.nextInt();
			
			String s1 ="";
			int fst [] [] = new int [row][col];
				int r,c=0;
					System.out.println("1st Matrix ");
					
				for( r=0; r<row; r++){
					for(c=0; c<col; c++){
						System.out.print("data ["+r+"]"+"["+c+"] : " );
						 fst[r][c] =ob.nextInt();
							
					}
					
				}
					
					//display part 1
					System.out.println("1st Matrix ");
					for(int d=0; d<row; d++){
						for(int m1=0; m1<col; m1++){
							System.out.print(" "+fst[d][m1]);
						}
						System.out.println();
					}
				
						
					int sec [] [] =  new int [row] [col];	
						System.out.println("\n 2nd Matrix ");
					
					for(int r1=0; r1<row; r1++){
						for(int c1=0; c1<col; c1++){
							System.out.print("data ["+r1+"]"+"["+c1+"] : " );
							sec[r1][c1] =ob.nextInt();	
						}
					}
					
					//display part 
						System.out.println("2nd Matrix ");
					for(int d1=0; d1<row; d1++){
						for(int m2=0; m2<col; m2++){
							System.out.print(" "+sec[d1][m2]);
						}
						System.out.println();
					}
					
						//multiplication part
						
							int multi [] [] = new int [row] [col];
						
							int matrow =0;
							int matcol=0;
							int sum =0;
							for(int i=0; i<row; i++){
								
								for(int j=0; j<col; j++){
									
									for(int k=0; k<col; k++){
										matrow =(fst[i][k]*sec[k][j]);
										sum =sum+matrow;
									}
									multi [i][j] = sum;
									sum=0;
								}
								
								
							}//outter loop i
							
							
							System.out.println("Multiplication result \n ");
									
								for(int i=0; i<row; i++){
									for(int j=0; j<col; j++){
										System.out.print(" "+multi[i][j]);
									}
									System.out.println();
								}	
			
		}//end of main method 
	}