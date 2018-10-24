import javax.swing.*;
import java.io.*;
class DataInput{
	public static void main(String args[]){
	
	try{
	String path = JOptionPane.showInputDialog(null,"Enter The path ");
	
	File f = new File(path);
	FileInputStream fin = new FileInputStream(f);
	DataInputStream in = new DataInputStream(fin);
	
	String s = "";
	while(in.available()!=0){
	
	s=s+in.readLine()+"\n";
	int Linenumber = in.available();
	
	}
	
	JOptionPane.showMessageDialog(null,s);
		
		}catch(Exception exp){
		exp.printStackTrace();
		}
	}
}