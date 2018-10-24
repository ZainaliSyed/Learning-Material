class MethodPractise{
	
	
	public static int add(){
		
		int a =10;
		return a;
	}
	
	public static void add(int a){
		
		System.out.println("Addition void : ");
	}
	public void animal(int a){
		
		System.out.println("animal method void : ");
	}
	
	public static void main(String args[]){
		
		MethodPractise ob = new MethodPractise();
		//System.out.println("Addition obj: "+ob.add());
		//System.out.println("Addition : "+add());
		//System.out.println("Addition Static : "+MethodPractise.add());
		
		//System.out.println(" "+MethodPractise.add(10)); not allowed
		//add(10);
		
		//MethodPractise.add(10);
		//ob.add(10);
		
	}
}