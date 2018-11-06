import javax.swing.*;
import java.awt.event.*;
class CalcDemo extends JFrame implements ActionListener{

JButton b1 = new JButton("add");
JButton b2 = new JButton("sub");
JButton b3 = new JButton("mul");
JButton b4 = new JButton("div");
JButton b5 = new JButton("rem");
JTextField t1 = new JTextField();
JTextField t2 = new JTextField();
JTextField ans = new JTextField();

CalcDemo(){
setBounds(0,0,500,500);
setLayout(null);

t1.setBounds(20,20,100,30);
t2.setBounds(200,20,100,30);
b1.setBounds(20,80,50,30);
b2.setBounds(70,80,50,30);
b3.setBounds(120,80,50,30);
b4.setBounds(170,80,50,30);
b5.setBounds(220,80,50,30);
ans.setBounds(20,150,100,30);

add(t1);
add(t2);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(ans);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
setVisible(true);
}
public static void main(String args[]){

new CalcDemo();

}

public void actionPerformed(ActionEvent e){
Object ob = e.getSource();
String v1 = t1.getText();
String v2 = t2.getText();

int a = Integer.parseInt(v1);
int b = Integer.parseInt(v2);

if(ob == b1){
int c = a+b;
ans.setText("Answer is : "+c);    
}


}    
    
}