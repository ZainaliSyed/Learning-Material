class InheriteneMethod extends MethodPractise{
	
	
		
		public static void add(int a){
			System.out.println(" Override add  one  ");
		}
		
		@Override
		public void animal(int a){
			super.animal(10);
			System.out.println("Cat  method void : ");
		}
	public static void main(String args[]){
		
		//System.out.println("Extends : "+);
		InheriteneMethod ob = new InheriteneMethod();
		//System.out.print("object : ");
		//ob.add(10);
		
		//add(10);
		
		System.out.println(" ******* ");
		
		//MethodPractise ob1  = ob;
		
		ob.animal(10);
		ob.add(10);
		
		
	}
	
}