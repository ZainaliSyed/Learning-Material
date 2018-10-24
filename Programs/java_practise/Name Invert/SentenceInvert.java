class SentenceInvert{
	
	public static void main(String args[]){
		
		String input = "This is interview question";
		String output = "";
		String[] array = input.split(" ");
		for(int i = array.length-1; i >= 0; i--){
			output =output+array[i];
			if (i != 0) { 
			output =output+" ";  //this logic is for spaceing 
			}
	
		}
		System.out.print(output);
		
	}//end of main
	
}