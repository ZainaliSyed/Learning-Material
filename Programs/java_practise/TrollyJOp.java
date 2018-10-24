import javax.swing.*;
class TrollyJOp{
	public static void main(String args[]){
	String tf1 = JOptionPane.showInputDialog("please enter the load :");
	int load = Integer.parseInt(tf1);

	String tf2 = JOptionPane.showInputDialog("enter the Amount :");
	int amount = Integer.parseInt(tf2);
	
	int total = load*amount; 
	int maintance = (total/100)*3;
	int driver = (total/100)*10;
	int tolltax = (total/100)*5;
	int disel = (total/100)*50;
	int net =total-maintance-driver-tolltax-disel;
	JOptionPane.showMessageDialog(null,"Total Amount :"+total+"\n Maintance 3% :"+maintance+"\n Driver :10%"+driver+"\n Toll Tax :"+tolltax+"\n Disel :"+disel+"\n Net Profit :"+net);
	
	}
}