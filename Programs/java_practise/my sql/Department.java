import java.sql.*;
	public class Department{
	
		public static void main(String args[]) throws Exception{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql:///librarydata","root","");
			
			Statement st = con.createStatement();
			//int facId =0;
			ResultSet result = st.executeQuery("select dept_id,dept_name,remarks from department");
			
				while(result.next()){
					
					//String facId = 
					String deptId = result.getString("dept_id");
					String deptName = result.getString("dept_name");
					String remark = result.getString("remarks");
					
						System.out.println("dept_id : "+deptId);
						System.out.println("dept_name : "+deptName);
						System.out.println("remarks : "+remark);
						System.out.println("---------------------------- ");
					
				}
			
			
			
		}
		
	}//end of class 
	