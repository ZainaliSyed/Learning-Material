class Faculty{
	
	private String fac_name = "";
	private String fac_remark = "";
	private int fac_id = 0;
	
	
	public void setFacId(int fac_id){
		this.fac_id=fac_id;
	}
	public int getFacId(){
		return fac_id;
	}

	public void setName(String fac_name){
		this.fac_name= fac_name;
	}
	
	public String getName(){
		return fac_name;
	}
	
	public void setFacRemark(String fac_remark){
		this.fac_remark=fac_remark;
	}
	public String getFacRemark(){
		return fac_remark;
	}
	
	public String toString(){
		return fac_name;
	}
	
}