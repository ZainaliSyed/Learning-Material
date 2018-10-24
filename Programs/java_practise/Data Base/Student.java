class Student{
	
	private String std_name="";
	private int std_id=0;
	private String std_fname="";
	private String std_surname="";
	private int std_rollno=0;
	private String std_email="";
	private String std_contact="";
	private String std_date="";
	private String std_remark="";
	
	
	
	public void setStdId(int std_id){
		this.std_id =std_id;
	}
	public void getStdId(){
		return std_id;
	}
	
	public void setStdName(String std_name){
		this.std_name=std_name;
	}
	public void getStdName(){
		return std_name;
	}
	
	public void setFName(String std_fname){
		this.std_fname=std_fname;
	}
	public void getStdFName(){
		return std_fname;
	}
	
	public void setSurname(String std_surname){
		this.std_surname=std_surname;
	}
	public void getSurname(){
		return std_surname;
	}
	
 	public void setRollno(int std_rollno){
		this.std_rollno=std_rollno;
	}
	public void getRollno(){
		return std_rollno;
	}
	
	public void setEmail(String std_email){
		this.std_email=std_email;
	}
	public void getEmail(){
		return std_email;
	}
	
	public setContact(String std_contact){
		this.std_contact=std_contact;
	}
	public void getContact(){
		return std_contact;
	}
	public void setDate(String std_date){
		this.std_date=std_date;
	}
	public void getDate(){
		return std_date;
	}
	
	public void setRemark(String std_remark){
		this.std_remark=std_remark;
	}
	public void getRemark(){
		return std_remark;
	}
	
	String toString(){
		return std_name;
	}
}