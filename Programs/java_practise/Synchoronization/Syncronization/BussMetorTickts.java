import javax.swing.*;

public class BussMetorTickts implements Runnable{
    int avaliableSeats=2;
    public void run() {
        PassngerTickte pass=(PassngerTickte)Thread.currentThread();
       
        
        boolean tackedBooked=bookTickets(pass.getNeadedSeats(),pass.getName());
        if(tackedBooked==true){
            System.out.println("Congres  "+pass.getName()+" Seats are="+pass.getNeadedSeats());
        }
        else
             System.out.println("Sory "+pass.getName()+" Seats are not avlbel for you ="+pass.getNeadedSeats());
    }

    synchronized private boolean bookTickets(int neadedSeats, String name){
        System.out.println("hi i have seats "+getSeats()+" for "+name);
        if(neadedSeats>avaliableSeats){
            return false;
        }
        else
            avaliableSeats=avaliableSeats-neadedSeats;
            return true;
    }
    private int getSeats(){
        return avaliableSeats;
    }
}//
