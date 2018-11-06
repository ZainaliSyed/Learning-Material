import java.util.*;

class RandomGame{
	public static void main ( String args[]){
	Scanner ob = new Scanner(System.in);
	int chance =1;
	String select= "";
	Random r = new Random();
		do{
		System.out.print("Enter "+chance+" Number : ");
		int num = ob.nextInt();
		int rand = r.nextInt(6);
		
			if(num==rand){
			System.out.print("You Won .... !!");
			break;
			}
			
			if(chance>=6){
			System.out.println("\t Chances  Finish ..!!");
			
			System.out.print("Do You want to Continue Y/N ");
			select = ob.next();
			if(select.equals("y")||select.equals("Y")){
			chance=0;
		
			}//end of yes ..
			
			if(select.equals("n")||select.equals("N")){
			System.out.println("Good Bye");
			break;
			}
			
			else{
			System.out.println("Inavalid Selection ...!!");
			}
			
			} //end of chance 7

			
			chance++;
		}
		
		while(select.equals("y") || chance<=6 ||select.equals("Y"));
		
		
			/*do{
			
			System.out.print("Enter "+chance+" Number : ");
			num = ob.nextInt();
			
			System.out.print("Do You want to Continue Y/N ");
			select = ob.next();

			chance++;
			}while(select.equals("y")&& chance==6);*/
		
		
	}
}