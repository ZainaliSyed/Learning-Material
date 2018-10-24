import java.util.*;

class Application{
	
	public void draw(){
		System.out.println("I am draw Method for Circle  Class ..");
	}
	
	public static void main(String args[]){
		
		Shape shape  = new Triangle();
		shape.draw();
		
		Shape circleShape = new Circle();
		circleShape.draw();
		
		
	}
	
	
}