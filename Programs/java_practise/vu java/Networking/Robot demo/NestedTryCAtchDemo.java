package mixmaterial;

import javax.swing.JOptionPane;

public class NestedTryCAtchDemo {
    public static void main(String arg[]){
        int data[]=new int[3];
        try{
            
            try{
                System.out.println(data[6]);
            }catch(Exception ee){
                JOptionPane.showMessageDialog(null,"i am inner");
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null,"i am outer");
        }
    
    }
}
