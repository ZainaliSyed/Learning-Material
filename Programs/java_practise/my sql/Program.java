import java.sql.*;
	public class Program{
		public static void main(String args[]) throws Exception{
				
			Class.forName("com.mysql.jdbc.Driver");	
			Connection con = DriverManager.getConnection("jdbc:///librarydata","root","");
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select prog_id, prog_name,prog_duration,remarks from program");
			
				while(result.next() ){
					
					String progId = result.getString("prog_id");
					String progName = result.getString("prog_name");
					String progDuration = result.getString("prog_duration");
					String remark = remark = result.getString("remarks");
					
						System.out.println("prog_id : "+progId);
						System.out.println("prog_name : "+progName);
						System.out.println("prog_duration : "+progDuration);
						System.out.println("remarks : "+remark);
						System.out.println("------------------------ ");
				}
		}
	}
	