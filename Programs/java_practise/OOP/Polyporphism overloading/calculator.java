import java.util.*;
class calculator{
	public static void main(String args[]){
		Scanner ob = new Scanner(System.in);
		int a=0,b=0; 
		while(true){
			System.out.println("1) Addition ");
			System.out.println("2) Subtraction ");
			System.out.println("3) Multiplication ");
			System.out.println("4) Division ");
			System.out.println("");
			System.out.print("Enter Selection : ");
			int select = ob.nextInt();

			if(select==1){
				Addition ad = new Addition();
				ad.add(a,3);
				ad.add(3,6.9);
			}
			else if(select==2){
					Subtract s= new  Subtract();
					System.out.print("Enter 1st No : ");
					String fst= ob.nextInt();	
					
					System.out.print("Enter 2nd no : ");
					String sec = ob.nextInt(); 
					
						if(int==fst){
							int first = Integer.parseInt(fst);
						}
						
						s.sub(a,b);
						
				}
				
				else if(select==3){
						Multiplication m = new Multiplication();
						
						System.out.print("Enter 1st No : ");
						a= ob.nextInt();
	
						System.out.print("Enter 2nd no : ");
						b = ob.nextInt(); 
						
						m.mul(a,b);
						
				}
				
				else if(select==4){
					Division d = new Division();
					System.out.print("Enter 1st no : ");
					a = ob.nextInt();
					
					System.out.print("Enter 2nd no : ");
					b = ob.nextInt(); 
						
						d.div(a,b);
					
				}
		
			
			
		}//end of while 
		
	}//end of main method 
}