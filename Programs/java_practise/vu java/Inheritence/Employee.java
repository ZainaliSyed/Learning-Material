public class Employee{

	protected int id;
	protected String name; 
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	
	public String toString(){
		System.out.println("in Employee toString Method");
		return "Id : "+id+" Name : "+name;
	}
	
	public Employee(int id, String Name){
		this.id = id;
		this.name = Name;
	}
	
	public Employee(){
		
		this(10,"not Set ");
	}
	
	public void display(){
		System.out.println("in Employee Display Method");
		System.out.println("Employee id : "+id+" name : "+name);
	}
	
}//end of class 