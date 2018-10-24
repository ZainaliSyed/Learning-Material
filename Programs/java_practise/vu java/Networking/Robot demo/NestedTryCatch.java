package mixmaterial;

import java.awt.Button;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class NestedTryCatch {
    Button bb;
    public static void main(String arg[]){
       
        Connection con=null;
        Statement st=null;
        int data[]=new int[2];
        try{
            for(int kk=0;kk<15;kk++){
                if(kk==5){
                    st=con.createStatement();
                    FileReader file=new FileReader("d:\\asdfaslf.txt");
                }
                System.out.println(data[4]);
            }
        }catch(IndexOutOfBoundsException index){
            JOptionPane.showMessageDialog(null,"index out of bound exp accurd...");
        }
        catch(NumberFormatException nub){
                        JOptionPane.showMessageDialog(null,"Numvber format");
        }
        catch(NullPointerException nullex){
                        JOptionPane.showMessageDialog(null,"null pointer expe");

        }catch(Exception partex){
            partex.printStackTrace();
                        JOptionPane.showMessageDialog(null,"Exception");
        }
    
    }
}
