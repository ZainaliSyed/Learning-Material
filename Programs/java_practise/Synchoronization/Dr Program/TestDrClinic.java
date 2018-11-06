import javax.swing.*;
public class TestDrClinic{
	
	public static void main(String args[]){
		int seatArr[] = new int[11];
		String patNameArr[] = new String [11];
		DrClicnic dc = new DrClicnic();
		
		for(int i=1; i<=10; i++){
			String patName = JOptionPane.showInputDialog(null,"Enter Name :");
			String seatsNo = JOptionPane.showInputDialog(null,"Enter seats you Wants : ");
			int seat = Integer.parseInt(seatsNo);
			seatArr[i]	= seat;
			patNameArr[i] = patName;
		}
		
		Patatient ob1  = new Patatient(seatArr[1],dc,patNameArr[1]);
		Patatient ob2  = new Patatient(seatArr[2],dc,patNameArr[2]);
		Patatient ob3  = new Patatient(seatArr[3],dc,patNameArr[3]);
		
		Patatient ob4  = new Patatient(seatArr[4],dc,patNameArr[4]);
		Patatient ob5  = new Patatient(seatArr[5],dc,patNameArr[5]);
		Patatient ob6  = new Patatient(seatArr[6],dc,patNameArr[6]);
		Patatient ob7  = new Patatient(seatArr[7],dc,patNameArr[7]);
		Patatient ob8  = new Patatient(seatArr[8],dc,patNameArr[8]);
		Patatient ob9  = new Patatient(seatArr[9],dc,patNameArr[9]);
		Patatient ob10  = new Patatient(seatArr[10],dc,patNameArr[10]);
		
		 
		ob1.start();
		ob2.start();
		ob3.start();
		
		ob4.start();
		ob5.start();
		ob6.start();
		ob7.start();
		ob8.start();
		ob9.start();
		ob10.start();
		
		
	}//end of main
	
}//end of class 