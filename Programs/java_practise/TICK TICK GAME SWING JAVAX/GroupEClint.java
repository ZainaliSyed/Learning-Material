
import java.io.PrintStream;
import java.net.Socket;
import javax.swing.JOptionPane;

public class GroupEClint {
	
	 
	// implements ActionListener
    public static void main(String arg[])throws Exception{
        Socket socket=new Socket("localhost",9090);  //127.0.0.1//
        PrintStream out=new PrintStream(socket.getOutputStream());
        //String msg=JOptionPane.showInputDialog("Heloo im clint kathe aahen");
        //out.println(msg);
		TickTick3 tick = new TickTick3();
		
		System.out.println(""+tick);
		/*public void actionPerformed(ActionEvent e){
			
			while(true){
			
				Object t  = tick.actionPerformed(ActionEvent evt);
			}
		}
		*/
		
		

    
    }//end of main
}
