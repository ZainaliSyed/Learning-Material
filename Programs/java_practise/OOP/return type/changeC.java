class changeC{
	
	char car = '0';	
	char character (char ch){
		
		 if(ch>=65 && ch<=90){
			int c = ch+32;
			car=(char)c; // casting into char
		} 
		
		
		else if(ch>=97 && ch<=122){
			int c = ch-32;	
			car = (char)c;
		} 
		
		
		return car;
		
	}//end of method 
	
}