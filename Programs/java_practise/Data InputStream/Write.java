import java.io.*;
import java.util.*;
import javax.swing.*;
	class Write
	{
		public static void main(String arg[])throws Exception
		{
			Scanner ob=new Scanner(System.in);
			
			System.out.print("Enter your java marks:");
			int java=ob.nextInt();
			System.out.print("Enter your c marks:");
			int c=ob.nextInt();
			System.out.print("Enter your php marks:");
			int php=ob.nextInt();
			System.out.print("Enter your mpt marks:");
			int mpt=ob.nextInt();
			int obtain=java+c+php+mpt;
			int total=400;
			int per=(obtain*100)/total;
			
				FileOutputStream f = new FileOutputStream("Record1.txt");
				PrintStream file = new PrintStream(f);
				file.println("JAVA:"+java);
				file.println("C MARKS:"+c);
				file.println("PHP MARKS:"+php);
				file.println("MicroProcessor:"+mpt);
				file.println("Obtain Marks:"+obtain);
				file.println("Total Marks:"+total);
				file.println("Percentage:"+per+"%");
				file.close();
				JOptionPane.showMessageDialog(null,"Your Record save Successfully........");
				
			
					File f1=new File("Record1.txt");
					FileInputStream fin=new FileInputStream(f1);
					DataInputStream Din=new DataInputStream(fin);
					//int linenumber=in.available();
					String str="";
				while(Din.available()!=0)
				{
					str=str+Din.readLine()+"\n";
					int linenumber=Din.available();
					
				}
					JOptionPane.showMessageDialog(null,str);
				
		}
	}