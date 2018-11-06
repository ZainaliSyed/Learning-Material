import java.util.*;
protected  class Drawing{
	
	private Shape shapeOb ;
	
	public  void setShape(Shape shapeOb){
		this.shapeOb = shapeOb;
	}
	
	public void  drawShape(){
		this.shapeOb.draw();
	}
	
	
	
}