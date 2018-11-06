import java.awt.event.*;
import javax.swing.*;


class Marksheetgui implements ActionListener{
	
	
	JFrame f =new JFrame("Converter");
	JLabel head = new JLabel("Mark sheet");
	JLabel l1 = new JLabel("Enter Java MArks : ");
	JTextField tf1 = new JTextField();
	
	JLabel l2 = new JLabel("Enter C++ Marks  :");
	JTextField tf2 = new JTextField();
	
	JLabel l3 = new JLabel("Enter Php Marks : ");
	JTextField tf3 = new JTextField();
	
	
	JLabel l4 = new JLabel("Enter Python Marks : ");
	JTextField tf4 = new JTextField();
	
	JLabel l5 = new JLabel("Enter Sql Marks : ");
	JTextField tf5 = new JTextField();	
	
	JButton calBtn = new JButton(" Calculate");
	
	JLabel perlb = new JLabel("Percentage :");
	JTextField pertf = new JTextField();
	
	JLabel oblb = new JLabel("Obtain Marks :");
	JTextField obtf = new JTextField();
	
	JLabel totlb = new JLabel("Total Marks : ");
	JTextField TotTf = new JTextField();
	
	JButton clrbtn = new JButton("Clear");
	JButton abtbtn = new JButton("About");
	JButton extbtn = new JButton("Exit");

	
	Marksheetgui(){
		
		
		f.setBounds(0,0,600,700);
		f.setLayout(null);
		
		head.setBounds(200,50,100,30);
		f.add(head);
		
		l1.setBounds(20,100,100,30);
		f.add(l1);
		
		tf1.setBounds(150,100,100,30);
		f.add(tf1);
		
		l2.setBounds(20,140,100,30);
		f.add(l2);
		
		tf2.setBounds(150,140,100,30);
		f.add(tf2);
		
		
		l3.setBounds(20,200,100,30);
		f.add(l3);
		
		tf3.setBounds(150,200,100,30);
		f.add(tf3);
		
		l4.setBounds(20,250,100,30);
		f.add(l4);
		
		tf4.setBounds(150,250,100,30);
		f.add(tf4);
		
		l5.setBounds(20,300,100,30);
		f.add(l5);
		
		tf5.setBounds(150,300,100,30);
		f.add(tf5);
		
		calBtn.setBounds(100,350,100,30);
		f.add(calBtn);
		calBtn.addActionListener(this);
		
		perlb.setBounds(20,400,100,30);
		f.add(perlb);
		
		pertf.setBounds(150,400,100,30);
		f.add(pertf);
		pertf.setEditable(false);
		
		oblb.setBounds(20,450,100,30);
		f.add(oblb);
		
		obtf.setBounds(150,450,100,30);
		f.add(obtf);
		obtf.setEditable(false);
		
		totlb.setBounds(20,500,100,30);
		f.add(totlb);
		
		TotTf.setBounds(150,500,100,30);
		f.add(TotTf);
		TotTf.setText("500");
		TotTf.setEditable(false);
		
		
		clrbtn.setBounds(50,550,80,50);
		f.add(clrbtn);
		clrbtn.addActionListener(this);
		
		abtbtn.setBounds(130,550,80,50);
		f.add(abtbtn);
		abtbtn.addActionListener(this);
		
		extbtn.setBounds(200,550,80,50);
		f.add(extbtn);
		extbtn.addActionListener(this);
		
		
		f.setVisible(true);
	}
	public static void main(String args[]){
		new Marksheetgui();
	}
	
		public void actionPerformed(ActionEvent evt){
			
			if(evt.getSource()==calBtn){
				
				String java = tf1.getText();
				int javaMarks = Integer.parseInt(java);
				
				String c = tf2.getText();
				int cMArks =Integer.parseInt(c);
				
				String php =tf3.getText();
				int phpMarks =Integer.parseInt(php);
				
				String python = tf4.getText();
				int pythonMarks =Integer.parseInt(python);
				
				String sql =tf5.getText();
				int sqlMarks = Integer.parseInt(sql);
				
				int ObMarks = javaMarks+cMArks+phpMarks+pythonMarks+sqlMarks;
				float percent = (ObMarks*100)/500f;
				pertf.setText(percent+"");
				
				obtf.setText(ObMarks+"");
				
				
				
			}
			
			else if(evt.getSource()==clrbtn){
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
				tf4.setText("");
				tf5.setText("");
				
				pertf.setText("");
				obtf.setText("");
				
				
			}
			
			else if(evt.getSource()==abtbtn){
				JOptionPane.showMessageDialog(null,"\t Programmer \n Name : Syed Zain Ali \n Study : BSCS");
			}
			
			else if(evt.getSource()==extbtn){
				System.exit(0);
			}
			
			
			
		}
}// end of main 