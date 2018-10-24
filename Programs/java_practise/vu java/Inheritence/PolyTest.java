//Employee , Teacher 

class PolyTest{
	public static void main(String args[]){
		
		Employee ref1, ref2;
		
		ref1 = new Employee(79,"Zain Ali");
		ref1.display();
		
		ref2 = new Teacher(55,"salman ","phd");
		ref2.display();
		
		System.out.println("Employee : "+ref1.toString());
		System.out.println("Teacher : "+ref2.toString());
	}
}