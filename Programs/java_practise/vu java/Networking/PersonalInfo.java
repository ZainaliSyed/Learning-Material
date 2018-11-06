import javax.swing.*;
import java.io.*;
class PersonalInfo  implements Serializable{

	
	String name ;
	String address;
	String phoneNum;
	
	public PersonalInfo(String n, String a, String p){
		
		name = n;
		address= a;
		phoneNum = p;
		
	}
	
	public void printPersonalInfo(){
		JOptionPane.showMessageDialog(null,"Name : "+name+" Address : "+address+" Phone Number  : "+phoneNum);
	}
	
	
}//end of class