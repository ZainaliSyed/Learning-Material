package mixmaterial;

import java.awt.Robot;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;
import java.util.*;
class Client {
    public static void main(String arg[])throws Exception{
        Robot rob=new Robot();
        Scanner ob=new Scanner(System.in);
        Socket socket = new Socket("localhost",9099);  //127.0.0.1//
		
        PrintStream out=new PrintStream(socket.getOutputStream());
		
        for(int i=0;true;i++){
            Thread.sleep(100);
            rob.mouseMove(i, 60);
            out.println("value is="+i);
        }
		
    }
}
