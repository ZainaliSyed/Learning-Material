class Program{
	
	private String prog_name="";
	private int prog_id=0;
	private String prog_duration ="";
	private String prog_remark = "";
	
	
	public void setProgId(int prog_id){
		this.prog_id=prog_id;
	}
	public void getProgId(){
		return prog_id;
	}
	
	public void setProgName(String prog_name){
		this.prog_name=prog_name;
	}
	public void getProgName(){
		return prog_name;
	}
	
	public void setProgDuration(String prog_duration){
		this.prog_duration=prog_duration;
	}
	public void getProgDuration(){
		return prog_duration;
	}
	public void setProgRemark(String prog_remark){
		this.prog_remark=prog_remark;
	}
	public void getProgRemark(){
		return prog_remark;
	}
	public String toString(){
		return prog_name;
	}
}