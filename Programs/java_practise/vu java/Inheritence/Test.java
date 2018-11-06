class Test{
	public static void main(String args[]){
		
		System.out.println("Making Employye Object ..\n");
		Employee e = new Employee(79,"Syed Zain ali ");
		Employee ee = new Employee();
		
		
		System.out.println("Making Teacher  Object ..\n");
		Teacher t = new Teacher(55,"Salman ","Phd ");
		
		e.display();
		
		ee.display();
		t.display();
		
		System.out.println("Employee : "+e.toString());
		System.out.println("Teacher : "+t.toString());
		
	}//end of main 
}