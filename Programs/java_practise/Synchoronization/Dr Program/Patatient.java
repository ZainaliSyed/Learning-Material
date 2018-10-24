 public class Patatient extends Thread{
	 
	private int neadeSeats;
	Patatient(int seats, Runnable thred,String name){
		super(thred,name);
		neadeSeats = seats;
	}
	
	int getNeadedSeats(){
		return neadeSeats;
	}
	
}