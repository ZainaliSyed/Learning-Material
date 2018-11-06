//class StuFinilize
public class TestStudent{ 
	
	public static void main(String args[]){
		int numObj ;
		numObj = StuFinalize.getCountStudents();
		
		System.out.println("Students Objects : "+numObj);
		StuFinalize s1  = new StuFinalize("Zain",79);
		s1.print();
		
		System.out.println("Students  "+s1.toString());
		
		numObj = StuFinalize.getCountStudents();
		System.out.println("Students Obj : "+numObj);
		
		StuFinalize s2  = new StuFinalize("usman",55);
		System.out.println("Students "+s2);
		
		numObj = StuFinalize.getCountStudents();
		System.out.println("Students Obj : "+numObj);
		
		
		s1 =null;
		
		System.gc();
		
		numObj = StuFinalize.getCountStudents();
		System.out.println("Students Obj : "+numObj);
		
	}//end of main
}