package projectstudents;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class DBconnect {
	Connection con;
	public Connection getDB() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cijd_11";
			String username="root";
			String pwd="root";
			con=DriverManager.getConnection(url,username,pwd);
			Statement st=con.createStatement();
			//String query="create table Student(StudentId int, StudentName varchar(30))";
			//String query= 'alter table student add column(course varchar(50), address varchar(60))";
			//st.execute(query);
			System.out.println("Data has been Connected");
		}
		catch(SQLException e) {
			System.out.println("unable to connect with a database");
			
		}
		catch(ClassNotFoundException e) {
			System.out.println("check path or add a proper. jar file to the program");
			
		}
		return con;
		
		}
	    public static void main(String[] args) throws ClassNotFoundException,SQLException{
	    	new DBconnect().getDB();
	    }
	}


