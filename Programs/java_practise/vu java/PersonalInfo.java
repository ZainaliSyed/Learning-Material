
import javax.swing.*;
public class PersonalInfo{
	
	private String name;
	private String address;
	private String phoneNum;
	
	public void setName(String name){
		this.name= name;
	}
	public String getName(){
		return name;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum(){
		return phoneNum;
	}
	
	public PersonalInfo(String n, String a, String p){
		
		name = n;
		address =a;
		phoneNum =p;
	}
	
	public void print(){
		JOptionPane.showMessageDialog(null,"Name : "+name+" Address : "+address+" Phone No : "+phoneNum);
	}
	
	
}//end of class