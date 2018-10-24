public class StuFinalize{
	
	private String name = "";
	private int rollNo ;
	private static int countStudents =0;
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setRollNo(int rollNo){
		if(rollNo>0){
			this.rollNo = rollNo;
		}
			else{
				rollNo=100;
			}
		
	}
	
	public int getRollNo(){
		return rollNo;
	}
	public String toString(){
		return "Name : "+name+" Roll No :"+rollNo;
	}
	
	public static int getCountStudents(){
		return countStudents;
	}
	public StuFinalize(){
		name ="not set";
		rollNo = 100;
		countStudents =countStudents+1;
	}
	public StuFinalize(String name , int rollNo){
		setName(name);
		setRollNo(rollNo);
		countStudents = countStudents+1;
	}
	
	public StuFinalize(StuFinalize s){
		name = s.name;
		rollNo = s.rollNo;
		countStudents = countStudents+1;
	}
	
	public void print(){
		System.out.println("Student Name : "+name+" Roll No : "+rollNo);
	}
	
	public void finalize(){
		countStudents = countStudents-1;
	}
	
	
}//end of class 