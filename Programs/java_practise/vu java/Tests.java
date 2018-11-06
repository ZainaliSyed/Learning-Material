public class Tests{
	
	public static void main(String args[]){
		
		Students  s1 = new Students("Zain",79);
		Students s2 = new Students();
		
		s1.print();
		s2.print();
		
		s2.setName("USman");
		s2.setRollNo(20);
		
		System.out.println("S2 Student Name : "+s2.getName());
		System.out.println("S2 Student RollNo : "+s2.getRollNo());
		
		Students s3  = new Students(s2);
		s2.print();
		s3.print();
		
		s3.setRollNo(-10);
		s3.print();
	}
}