import java.io.*;
import java.util.*;
import javax.swing.*;
	class WriteRead
	{
		public static void main(String arg[])throws Exception
		{
			Scanner ob=new Scanner(System.in);
			System.out.println("Enter Troly Load  :");	
			int x=ob.nextInt();
			int totalincome=800*x;
  
			int driverexpenses=(150*x);
			int tax=(10*totalincome)/100;
			int diesel=(2*x*105);
			int expenses=(driverexpenses+tax+diesel);
			int profit= (totalincome-expenses);

			
				FileOutputStream f=new FileOutputStream("Trolly Record.txt");
				PrintStream file=new PrintStream(f);
				file.println("Total Income:" + totalincome);
				file.println("----------------------------");
				file.println("Driver:" + driverexpenses);
				file.println("Tax          :"+   tax);
				file.println("Diesel:" + diesel);
				file.println("Expenses:" + expenses);
				file.println("-----------------------------");
				file.println("Profit:" + profit);
				file.close();
				JOptionPane.showMessageDialog(null,"Your Record save Successfully........");
				
			
					File f1=new File("Trolly Record.txt");
					FileInputStream fin=new FileInputStream(f1);
					DataInputStream Datain=new DataInputStream(fin);
					//int linenumber=in.available();
					String s="";
				while(Datain.available()!=0)
				{
					s=s+Datain.readLine()+"\n";
					int linenumber=Datain.available();
					
				}
					JOptionPane.showMessageDialog(null,s);
				
		}
	}