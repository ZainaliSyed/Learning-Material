import java.util.*;
public class ThreadTest {
	
	public static void main(String args[]){
		
		
		Worker first = new Worker("First Job ");
		Worker sec = new Worker("Seconf Job");
		Worker third  = new Worker("Third Job");
		
		Thread t1  = new Thread(first);
		Thread t2  = new Thread(sec);
		Thread t3  = new Thread(third);
		t1.start();
		t2.start();
		t3.start();
	}
}