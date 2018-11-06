import java.util.*;
class PyramidFor{
	public static void main(String args[]){
	Scanner ob  =new Scanner(System.in);
	
	int i,j,k;
	
	for(i=1; i<=10; i++){
		
		
		
		for(j=1; j>=j/2; j-- ){
		System.out.print(" j");
		
			for(k=1; k<=j;  k=k+2){
			System.out.print(k);
			}
		
		}//middle loop
			
		System.out.println("i");
	} // outter 
	
	}
}