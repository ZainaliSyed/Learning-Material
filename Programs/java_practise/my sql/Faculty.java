import java.sql.*;
	
	public class Faculty{
		public static void main(String args[]) throws Exception{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql:///librarydata","root","");
			
			Statement st = con.createStatement();
			ResultSet result  = st.executeQuery("select fac_id,fac_name,remark from faculty");
			
				while(result.next() ){
					
					String facId  = result.getString("fac_id");
					String facName = result.getString("fac_name");
					String remark = result.getString("remark");
					
					System.out.println("fac_id : "+facId);
					System.out.println("fac_name : "+facName);
					System.out.println("remarks : "+remark);
					System.out.println("-------------------- ");
				}
		
		}//end of main method 
		
	}