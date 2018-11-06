public class MainThread{

	
	public static void main(String args[]){
			
		ReadFile first  = new ReadFile("first.txt");
		ReadFile second  = new ReadFile("second.txt");
		
		
		Thread t1  = new Thread(first);
		Thread t2  = new Thread(second);
		
		t1.start();
		t2.start();
		
		
	}//end of main
	
}
