class Box{
	private int feet;
	int inch;
	int width;
	int height;
	
	public void setFeet(int feet){
		this.feet = feet;
	}
	public int getFeet(){
		return feet;
	}
	
	Box(){
		System.out.println("empty constructor");
		
	}
	Box(int a){
		System.out.println("One Argument called");
		feet=a;
	}
	Box(int a,int b){
		System.out.println("two arrgument called");
		feet=a;
		inch=b;
	}
	void display(){
		System.out.println("feet"+feet);
		System.out.println("inch"+inch);
		System.out.println("Width"+width);
		System.out.println("height"+height);
		
		
	}
  }//mian class