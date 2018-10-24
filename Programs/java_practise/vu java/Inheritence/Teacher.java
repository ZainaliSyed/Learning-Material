public class Teacher extends Employee{
	
	private String qual;
	
	public void setQual(String qual){
		this.qual = qual;
	}
	public String getQual(){
		return qual;
	}
	
	public String toString(){
		System.out.println("is Teacher toString Method ..");
		String emp = super.toString();
		return emp+" Qualification : "+qual;
	}
	
	public Teacher(){
		qual ="";
	}
	
	public Teacher(int i, String n, String q){
		super(i,n);
		qual = q;
	}
	
	public void display(){
		System.out.println("is Teacher Diplay Method ..");
		super.display();
		System.out.println("Teacher Qualification : "+qual);
		
		
	}
}//end of class 