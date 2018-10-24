import java.sql.*;
	public class Student{
		public static void main(String args[]) throws Exception{
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:///librarydata","root","");
			
			Statement st = con.createStatement();
			ResultSet result = st.executeQuery("select std_id,std_name,f_name,surname,rollno,email,contact,birth,remarks from student");
			
				while(result.next() ){
					
					
					String stdId = result.getString("std_id");
					String stdName = result.getString("std_name");
					String fName = result.getString("f_name");
					String stdSurname = result.getString("surname");
					String stdRoll = result.getString("rollno");
					String stdEmail = result.getString("email");
					String stdContact = result.getString("contact");
					String stdBirth = result.getString("birth");
					String remark = result.getString("remarks");
					
						System.out.println("std_id : "+stdId);
						System.out.println("std_name : "+stdName);
						System.out.println("f_name : "+fName);
						System.out.println("surname : "+stdSurname);
						System.out.println("rollno : "+stdRoll);
						System.out.println("email : "+stdEmail);
						System.out.println("contact : "+stdContact);
						System.out.println("birth : "+stdBirth);
						System.out.println("---------------------------");
						
						
						
					
					
					
				}
		}
	}