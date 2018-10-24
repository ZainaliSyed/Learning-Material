 

import java.sql.*;

public class PrepareSt {

    public static void main(String args[]){
        
        
        try{
				Connection  con =null;
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                String path = "D:\\person.mdb";
                
                con =DriverManager.getConnection("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};DBQ="+path+";DriverID=22;READONLY=true");	
                
                String query = "UPDATE personInfo SET address = ?"+"WHERE name = ? ";
                
                PreparedStatement pst  = con.prepareStatement(query);
                String add  = args[0];
                String name = args[1];
                
                pst.setString(1, add);
                pst.setString(2, name);
                
                int num = pst.executeUpdate();
                System.out.println(num+" Records Updated ");
                
                con.close();
 
        }catch(Exception e){
            System.out.println(e);}
        
    }//end pf main 
    
    
}
