import javax.swing.*;
import java.util.*;
import java.io.*;
class FilePrac{

	public static void main(String args[]){
	
	try{
	String path = JOptionPane.showInputDialog(null,"Pick File Path ");
	FileInputStream fin = new FileInputStream(path);
	Scanner ob = new Scanner(fin);
	String data ="";

	
	String save = JOptionPane.showInputDialog(null,"Enter The Path to save  ");
	FileOutputStream fout = new FileOutputStream(save);
	PrintStream out = new PrintStream(fout);
	System.out.println("Started reading");
	
	while(ob.hasNextLine()){
	System.out.println("Reading");
	data =data+ob.nextLine()+"\n";
	} 
	out.println(data);
	System.out.println("DOne");
	}catch (Exception e){}
	
	}
}