import java.awt.*;
class TestFrm{
	Frame frm=new Frame("new Frame");
	Label lb=new Label("Main menue");
	TextField tf=new TextField();
	Button bb=new Button("Ok");
	TestFrm(){
		frm.setLayout(null);
		frm.setBackground(Color.green);
		frm.setBounds(0,0,500,500);  //(xX,yX,width,height)

		lb.setBounds(20,50,100,30);
		lb.setBackground(Color.pink);
		frm.add(lb);
		
		tf.setBackground(Color.red);
		tf.setBounds(20,90,100,30);
		frm.add(tf);
		
		bb.setBackground(Color.blue);
		bb.setBounds(20,130,50,50);
		frm.add(bb);
		
		frm.show();
	}//end of const

	public static void main(String arg[]){
			new TestFrm();
	}
	
}//end main