//PersonalInfo , AddressBook

import javax.swing.*;
class AdressBookTest{
	
	public static void main(String args[]){
		
		AddressBook a  = new AddressBook();
		int in;
		while(true){
			
			String input = JOptionPane.showInputDialog("1) Add \n 2) Search \n 3) Delete \n 4) Quit  ");
			//char in = input.charAt(0);
			
			in = Integer.parseInt(input);
			switch(in){
				case 1: 
				a.addPerson();
				break;
				
				case 2:
				String search = JOptionPane.showInputDialog("Enter Name to Search : ");
				a.searchPerson(search);
				break;
				
				case 3:
				String delete = JOptionPane.showInputDialog("Enter Name to Delete : ");
				a.searchPerson(delete);
				break;
				
				case 4:
				System.exit(0);
			}
			
			
			
			
		}//end of while 
	}//end of main
}//end of test 
