class SimpleConstructor{
	
	//int feet=0;
	//int inch=0;
	
	private int feet;
	private int inch ;
	
	public void setInch(int inch ){
		this.inch = inch;
	}
	public int getInch(){
		return inch;
	}
	
	public void setFeet(int feet){
		this.feet = feet;
	}
	public int getFeet(){
		return feet;
	}
	
	public String toString(){
		System.out.println("To String Method ");
		return "Feet :  "+feet+ " Inch : "+inch;
		
	}
	
	
	SimpleConstructor(int a, int b){
		this.feet = a;
		this.inch = b;
	}
	void showZain(){
		
		System.out.println("Inch : "+inch);
		System.out.println("Feet : "+feet);
	}
	
	
}