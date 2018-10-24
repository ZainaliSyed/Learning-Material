import java.io.*;
import javax.swing.*;
	class FillOpen{
	
	JFrame frame = new JFrame();
	JTextField tf = new JTextField();
	
	FillOpen(){
	
	
	
	frame.setSize(900,900);
	frame.setVisible(true);
	frame.show();
	
	tf.setSize(900,900);
	frame.add(tf);
	
	
	}
	
		public static void main(String args[]){
		new  FillOpen();
		try {
		
		String address = JOptionPane.showInputDialog(null," Please Enter URl ");
		File f = new File(""+address);
		FileInputStream fin =  new FileInputStream(""+f);
		Scanner ob = new Scanner(fin);
		
		while(ob.hasNextLine()){
		
		String s = ob.hasNextLine();
		
		tf.setText(""+s);
		
		}
		
		}catch (Exception ex){}
		
		
		}
	}