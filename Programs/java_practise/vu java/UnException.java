class UnException{
	
	public static void main(String args[]){
		
		try{
			System.out.println(args[0]);
		}catch(IndexOutOfBoundsException e){
			System.out.println("You Forget to Pass ");
		}
	}
	
	
}