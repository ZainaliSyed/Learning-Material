public class PassngerTickte extends Thread{
    private int neededSeats;
    PassngerTickte(int seats,Runnable thred,String name){
        super(thred,name);
        neededSeats=seats;
    }
    int getNeadedSeats(){
        return neededSeats;
    }
}
