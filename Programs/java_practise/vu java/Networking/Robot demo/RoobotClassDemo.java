//package mixmaterial;
import javax.swing.*;
import java.awt.Robot;

class RoobotClassDemo {
    public static void main(String arg[])throws Exception{
        Robot rob=new Robot();
        for(int i=1;i<=500;i++){
            Thread.sleep(5);
            rob.mouseMove(i,50);
				
				if(i==500){
					JOptionPane.showMessageDialog(null," VAlue of i "+i);
					for(int j=1; j<=500; j++){
						Thread.sleep(5);
						rob.mouseMove(500,j);
						
						if(j==500){
						JOptionPane.showMessageDialog(null," VAlue of i "+j);		
							for(int k=500; k>=1; k--){
								Thread.sleep(5);
								rob.mouseMove(k,500);
									if(k==1){
									JOptionPane.showMessageDialog(null," VAlue of i "+k);	
										//for(int l=1; l<=500; l++ ){
										for(int l=500; l>=1; l-- ){
										
											Thread.sleep(5);
											rob.mouseMove(1,l);
										
										}//end of l for 
										
									}//end of if k 
								
							}//end of k
			
						}//end of j if 
						
					}//end of j loop 
					 
					 
				}//end of if
			
				 
		}//end of for 
		
    }
}
