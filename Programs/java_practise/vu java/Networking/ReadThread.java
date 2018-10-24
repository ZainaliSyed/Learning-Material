public class ReadThread{
	public static void main(String args[]){
			
		ReadFile first  = new ReadFile("First.java");
		ReadFile second  = new ReadFile("second.java");
		
		
		Thread t1  = new Thread(first);
		Thread t2  = new Thread(second);
		
		t1.start();
		t2.start();
		
		
	}//end of main
	
}
