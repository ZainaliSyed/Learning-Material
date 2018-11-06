public class Program7{
	public static void main(String args[]){
		
		
		double creditCardBill =500.0d;
		int afford = 100;
		
		
		double remainbal =0.0d;
		
		int month =1;
		while(month<=3){
				
			if(month==1){
				
				creditCardBill = creditCardBill-100;
				
				remainbal =(creditCardBill/100)*10;
				
			}	
			
			else if(month==2){
				
				creditCardBill = (creditCardBill+remainbal) -100;
				remainbal =(creditCardBill/100)*10;
			}
			
			else if(month==3){
				
				creditCardBill = (creditCardBill+remainbal) -100;
				remainbal =(creditCardBill/100)*10;
				
			}
			
			month++;
			
		}
		
		
		System.out.println(" Your Remaining balance after 3 months are   : "+creditCardBill);
		
		
	}//end of main
}