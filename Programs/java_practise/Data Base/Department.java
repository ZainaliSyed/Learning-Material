class Department{
	
	private String dept_name="";
	private int dept_id=0;
	private String dept_remark="";
	
	public void setDeptId(int dept_id){
		this.dept_id= dept_id;
	}
	public void getDeptId(){
		return dept_id;
	}
	
	public void setDeptName(String dept_name){
		this.dept_name=dept_name;
	}
	
	public void getDeptName(){
		return dept_name;
	}
	
	public void setDeptRemark(String dept_remark){
		this.dept_remark= dept_remark;
	}
	public void setDeptRemark(){
		return dept_remark;
	}
	
	public String toString(){
		return dept_name;
	}
}