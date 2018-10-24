class ObjectDataType{
	
	public static void main(String args[]){
		
		ObjectAllType ob1= new ObjectAllType();
		ObjectAllType ob2= new ObjectAllType();
		
		ob1.add(10,5);
		//ob1.addFloat(105.0,5.0);
		ob1.addDouble(10.7,6.5);
		System.out.println("Return Addition Result : "+ob1.add());
		ob1.sub();
		ob1.sub(10.5,4.5);
		System.out.println("Subtraction return Result is : "+ob1.subReturn());
		ob1.Student("Student name is zain");
		System.out.println(ob1.StudentReturn("Zain"));
		ob1.character('a');
		System.out.println("The Character Return is "+ob1.character());
		
	}
}