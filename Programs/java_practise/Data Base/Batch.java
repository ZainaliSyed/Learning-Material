class Batch{
	
	private int batch_year =0;
	private int batch_id="";
	private String batch_shift="";
	private String batch_group="";
	private String batch_remark="";
	
	public void setBatchId(int batch_id){
		this.batch_id=batch_id;
	}
	public void getBatchYear(){
		return batch_id+"";
	}
	public void setBatchShift(String batch_shift){
		this.batch_shift=batch_shift;
	}
	public void getBatchShift(){
		return batch_shift;
	}
	public void setBatchGroup(String batch_group){
		this.batch_group=batch_group;
	}
	public void getBatchGroup(){
		return batch_group;
	}
	
	public void setBatchRemark(String batch_remark){
		this.batch_group=batch_group;
	}
	public void getBatchRemark(){
		return batch_remark;
	}
	
	
	public void setBatchYear(int batch_year){
		this.batch_year= batch_year;
	}
	
	public void getBatchYear(){
		return batch_year;
	}
	
	String toString(){
		return batch_year+"";
	}
}