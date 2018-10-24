import javax.swing.*;
import java.util.*;
class ListDemo{
	JFrame frame=new JFrame();
	JList list=new JList();
	
	ListDemo(){
		frame.setLayout(null);
		frame.add(list);
		list.setBounds(20,20,200,300);
		frame.setVisible(true);
		frame.setSize(500,500);
		Vector v=new Vector();
		//adding element in vector
		v.addElement("ALKESH");
		v.addElement("kishor");
		v.addElement("zain");
		v.addElement("sunny");
		v.addElement("monit");
		v.addElement("hins raj");
		v.addElement(1);
		list.setListData(v);
	}
	public static void main(String arg[]){
		new ListDemo();
	}

}