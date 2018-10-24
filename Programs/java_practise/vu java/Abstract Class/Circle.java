public class Circle extends Shape{
	
	
	private int x,y;
	private int radius;
	
	Circle(){
		x=5;
		y=5;
		radius =5;
	}
	
	public void calculateArea(){
		
		double  area = 3.14 *(radius*radius);
		System.out.println("Area : "+area);
	}
	
}//end of class