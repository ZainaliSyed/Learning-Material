import javax.swing.*;
class trollyJoption{
	public static void main(String args[]){
	String texfield=JOptionPane.showInputDialog("enter Basic pay :");
	int amount=Integer.parseInt(texfield);
	
	
	int house=(amount/100)*45;
	int medi=(amount/100)*15;
	int bounus= (amount/100)*5;
	
	int grosspay = house+medi+bounus;

	
	
	int income = (amount/100)*5;
	int zakat = (amount/100)*3;
	int vehicle = (amount/100)*8;

	int net =grosspay-income-zakat-vehicle;

	JOptionPane.showMessageDialog(null,"House Rent 45%:"+house+"\n Medical Allowance 15%:"+medi+"\n Bounus 5%:"+bounus+"\nGross Pay :"+grosspay+"\n Income tax"+income+"\n Zakat"+zakat+"\n Convince Allowance"+vehicle+"\nNet Income :"+net);

	
	
	
	}
}