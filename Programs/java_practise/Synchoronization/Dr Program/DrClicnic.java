import javax.swing.*;
public class DrClicnic implements Runnable{
	
	int avaliableSeats = 10;
	
	public void run(){
		
		Patatient  pat = (Patatient)Thread.currentThread();
		boolean patatientBook = bookTickets(pat.getNeadedSeats(),pat.getName());
		if(patatientBook==true){
			System.out.println("Congress "+pat.getName()+" Seats are : "+pat.getNeadedSeats());
		}
			else{
				System.out.println("Sorry "+pat.getName()+" Seats Are not Avaliable for you : "+pat.getNeadedSeats());
			}
			
	}//end of run
	
	synchronized private boolean bookTickets(int neadedSeat,String name){
		System.out.println("Hi I have seats "+getSeats()+" for Name :"+name);
		if(neadedSeat>avaliableSeats){
			return false;
		}
			else{
				avaliableSeats = avaliableSeats- neadedSeat;
				return true;
			}
	}//end of bookTickets
	
	private int getSeats(){
		return avaliableSeats;
	}
	
}//end of class 