import javax.swing.*;
import java.util.*;
class JCounter{
	public static void main(String args[]){
		String s1= JOptionPane.showInputDialog("Enter Any NO ");
		int no = Integer.parseInt(s1);
		String s= "";
		for(int i=1; i<=no; i++){
			s = s+i+"\n";
		}
		JOptionPane.showMessageDialog(null,s);
	}
}