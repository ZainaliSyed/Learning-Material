import java.io.*;
import javax.swing.*;
import java.util.*;

class MarkIo{
	public static void main(String args[]){
	Scanner ob = new Scanner(System.in);
	
	System.out.print("Enter Php Marks ");
	int php = ob.nextInt();
	
	System.out.print("Enter C++ Marks ");
	int c = ob.nextInt();
	
	System.out.print("Enter java Marks ");
	int java = ob.nextInt();
	
	System.out.print("Enter Data Base  Marks ");
	int data  = ob.nextInt();
	
	System.out.print("Enter C Shrap  Marks ");
	int sharp = ob.nextInt();
	
	int total = 500; 
	int obtain = php+c+java+data+sharp;
	
	int per = (obtain*100)/500;
	//System.out.print("Percentage  %: "+per);
	
	String save ="";
	//save = JOptionPane.showMessageDialog(null,"Enter Path to save Record ");
	save = JOptionPane.showMessageDialog(null,"Enter Path here ");
	
	FileOutputStream fout = new FileOutputStream(save);
	PrintStream out = new PrintStream(fout);
	
	out.println("Php Marks :"+php);
	out.println("C++ Marks :"+c);
	out.println("Java Marks :"+java);
	out.println("Data Base Marks :"+data);
	out.println("C Sharp Marks :"+sharp);
	out.println("Percentage Marks :"+per);

	File f =new File(save);
	FileInputStream fin = new FileInputStream(f);
	DataInputStream din = new DataInputStream(fin);
	
	String str="";
	while(din.available()!=0){
	str= str+din.readLine()+"\n";
	int linenumber =din.available();
	
	}
	
	JOptionPane.showMessageDialog(null,str);


	
	}
}