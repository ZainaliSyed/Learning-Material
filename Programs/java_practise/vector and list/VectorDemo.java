import java.util.*;
class VectorDemo{
	VectorDemo(){
		//creating vector object
		Vector v=new Vector();
		//adding element in vector
		v.addElement("ALKESH");
		v.addElement("kishor");
		v.addElement("zain");
		v.addElement("sunny");
		v.addElement("monit");
		v.addElement("hins raj");
		v.addElement(1);
		//traversing vector
		for(int i=0;i<v.size();i++){
			System.out.println(v.elementAt(i));
		}
	}
	public static void main(String arg[]){
		new VectorDemo();
	
	}

}