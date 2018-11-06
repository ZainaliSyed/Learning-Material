import java.util.*;
	class ArrayAddition{
		public static void main(String args[]){
			Scanner ob = new Scanner(System.in);
			
			System.out.println(" \t********Array Addition ********* ");
			System.out.print("Enter No of Rows : ");
			int row =ob.nextInt();
			System.out.print("Enter No of Columns : ");
			int col =ob.nextInt();
				
				int fst[] [] = new int [row] [col];
					System.out.println("\t 1st Matrix ");
					
				for(int r1=0; r1<row; r1++){
					for(int c1=0; c1<col; c1++){
						System.out.print("["+r1+"]"+"["+c1+"] : ");
						 fst[r1][c1] = ob.nextInt();
					}
				}//outter loop 
				
							//display part 1
					
					System.out.println("1st Matrix ");
						int d,m1=0;
						for(d=0; d<row; d++){
							for(m1=0; m1<col; m1++){
								System.out.print(" "+fst[d][m1]);
							}
							System.out.println();
						}
						
						int sec [] [] = new  int [row] [col];
						
					System.out.println("\n \t 2nd Matrix ");
					
					for(int r2=0; r2<row; r2++){
						for(int c2=0; c2<col; c2++){
							System.out.print("["+r2+"]"+"["+c2+"] : ");
							 sec[r2][c2] = ob.nextInt();
							
						}
					}//outter loop 
					
						
								// display part 2 
							System.out.println("2nd Matrix ");
							int d1,m2=0;
							for(d1=0; d1<row; d1++){
								for(m2=0; m2<col; m2++){
									System.out.print(" "+sec[d1][m2]);
								}
								System.out.println();
							}
												
						System.out.println("\t The Result Of Addition \n");
					
						for(int i=0; i<row; i++){
							for(int j=0; j<col; j++){
								System.out.print(" "+(fst[i][j]+sec[i][j]) );
							}
							
							System.out.println();
						}//outter loop 
				
		}// end of main method 
	}