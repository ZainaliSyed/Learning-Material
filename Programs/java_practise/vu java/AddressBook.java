import java.util.*;
import javax.swing.*;
import java.io.*;

public class AddressBook{

	ArrayList<PersonalInfo> persons;
	
	public AddressBook(){
		persons = new ArrayList<PersonalInfo>();
		loadPersons();
	}
	
	
		String token [] = null;
		String name,address,phno;
	
	
	public void loadPersons(){
		 	try{
			FileReader f = new FileReader("input.txt");
			BufferedReader bf = new BufferedReader(f);
			
			String s  = bf.readLine();
			
			while(s!=null){
				
			/*	token = s.splite(",");
				name = token[0];
				address = token[1];
				phno = token[2];
				*/
				PersonalInfo p = PersonalInfo(name,address,phno);
				persons.add(p);
				s  = bf.readLine();
				
			}
			
			bf.close();
			f.close();
		}catch(IOException e){
			System.out.println("Unable to Read File ");
		}
	}
	
	public void addPerson(){
		String name  = JOptionPane.showInputDialog("Enter Name : ");
		String adress  = JOptionPane.showInputDialog("Enter Adress : ");
		String phoneNum  = JOptionPane.showInputDialog("Enter Phone .no  : ");
		
		PersonalInfo p = new PersonalInfo(name,adress,phoneNum);
		persons.add(p);
	}
	
	public void searchPerson(String n){
		
		for(int i=0; i<persons.size(); i++){
			PersonalInfo p =  (PersonalInfo)persons.get(i);
				if(n.equals(p.getName() ) ){
					p.print();
				}
		}//end of for 
	}
	
	
	public void deletePerson(String n){
		
		for(int i=0; i<persons.size(); i++){
			PersonalInfo p =(PersonalInfo)persons.get(i);
				if(n.equals(p.getName() )){
					persons.remove(i);
				}
		}
		
	}
	
	/*public void savePersons(){
		
		try{
			
			String s = "";
			FileWriter fw = new FileWriter("input.txt");
			PrintWriter p = new PrintWriter(fr);
			for(int i=0; i<persons.size(); i++){
				PersonalInfo p =(PersonalInfo)persons.get(i);
				
				s = p.name+" , "+p.address+" , "+p.phno;
				p.println(s);
			}
			
			fw.close();
			p.close();
		}catch(IOException e){}
	}
	*/
	
}//end of class