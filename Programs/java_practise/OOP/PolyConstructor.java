import java.awt.*;
class PolyConstructor extends Frame{
	
	Label l1 = new Label("1) Black  ");
	public static int color;
	
	
		PolyConstructor(int a){
			color=a;
			System.out.print("I am one Arrgument ");
			PolyConstructor ob1= new PolyConstructor();

			
		}  
		
	PolyConstructor (){
	
		setLayout(null);
		setBounds(0,0,500,500);
	
		l1.setBounds(20,100,50,50);
		add(l1);
		
		
			if(color==1){
				setBackground(Color.black);
			}		
			else if(color==2){
				setBackground(Color.green);
			} 
		setVisible(true);
	
	
	}//end constructor 

	
}//end of class 