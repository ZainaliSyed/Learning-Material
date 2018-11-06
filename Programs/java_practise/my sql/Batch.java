import java.sql.*;
public class Batch{
	public static void main(String args[]) throws Exception{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:///librarydata","root","");
		
		Statement st = con.createStatement();
		ResultSet result  = st.executeQuery("select batch_id,batch_year,batch_group,batch_shift,remarks from batch");
		
			while(result.next()){
				
				String batchId = result.getString("batch_id");
				String batchYear = result.getString("batch_year");
				String batchGroup = result.getString("batch_group");
				String batchShift = result.getString("batch_shift");
				String remark = result.getString("remarks");
				
					System.out.println("batch_id  : "+batchId);
					System.out.println("batch_year  : "+batchYear);
					System.out.println("batch_group  : "+batchGroup);
					System.out.println("batch_shift  : "+batchShift);
					System.out.println("remarks  : "+remark);
					System.out.println("------------------------------- ");
					
					
				
				
			}
	}

}