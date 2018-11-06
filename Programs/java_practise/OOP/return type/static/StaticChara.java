class StaticChara{
	
	 
	static void Character(char ch){
	
		char car = '0';
		if(ch>=65 && ch<=90){
			int c=ch+32;
			car = (char)c;
			System.out.println("Small Letter is  : "+car);
		}
		
		else if(ch>=97 && ch<=122){
			char cara = '0';
			int c = ch-32;
			cara = (char)c;
			System.out.println("Capital Letter is : "+cara);
		}
		
	}//end of method	
}