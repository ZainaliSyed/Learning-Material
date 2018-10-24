import java.util.*;
class Series{
	
	Scanner ob = new Scanner(System.in);
	void even(){
		
		System.out.print("Enter A number : ");
		int even = ob.nextInt();
		
			for(int i=0; i<=even; i=i+2){
				System.out.println(i);
			}
		
	}
	
	void odd(){
		System.out.print("Enter A number ");
		int odd= ob.nextInt();
			for(int i=1; i<=odd; i=i+2){
				System.out.println(i);
			}
	}
	
	void square(){
		System.out.print("Enter Number : ");
		int sq = ob.nextInt();
			for(int i=0; i<=sq; i++){
				System.out.println(i*i);
			}
	}
}//end of class 