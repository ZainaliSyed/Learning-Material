import java.sql.*;

public class TestMySQL{
   public static void main(String arg[])throws Exception{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql:///malhi","root","");

        Statement st=con.createStatement();
	
        ResultSet result=st.executeQuery("select fac_id,fac_name,remarks from faculty");
        
		while(result.next()){

          String fac_id=result.getString("fac_id");
          String fac_name=result.getString("fac_name");
          String remarks=result.getString("remarks");

          System.out.println("fac_id: "+fac_id);
          System.out.println("fac_name: "+fac_name);
          System.out.println("remarks: "+remarks);
          System.out.println("------------------------");

        }
   }
}
