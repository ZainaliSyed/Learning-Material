import java.util.*;
public class Program9{
	public static void main(String args[]){
		
		Scanner  ob = new Scanner(System.in);
		
		double totalBill =110.0d;
		double discount =0.0d;
		
		System.out.println("you Original Bill Is  : "+totalBill);
		if(totalBill>100){
			
			discount = (totalBill/100)*10;
			totalBill = totalBill-discount;
			
			System.out.println("you discount Is  : "+discount);
			System.out.println("your Net Bill Is  : "+totalBill);
		}
		
		else if(totalBill<100){
			System.out.println("your Net Bill Is  : "+totalBill);
		}
		
		
		
	}//end of main
}