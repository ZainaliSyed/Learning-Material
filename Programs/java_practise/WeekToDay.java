import javax.swing.*;
class WeekToDay{
	public static void main (String args[]){
	String value = JOptionPane.showInputDialog("please enter the week  :");
	int week = Integer.parseInt(value);
	int day = week*7;
	JOptionPane.showMessageDialog(null,"days are :"+day);

	}
}