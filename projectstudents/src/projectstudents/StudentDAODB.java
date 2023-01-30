package projectstudents;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class StudentDAODB {
      DBconnect db=new DBconnect();
      Connection con=db.getDB();
      
      public void addStudent(Student st) {
    	  try {
    		  String query= "insert into student value(?, ?)";
    		  PreparedStatement ps=con.prepareStatement(query);
    		  ps.setInt(1, st.getstudentId());
    		  ps.setString(2,st.getstudentName());
    		  
    		  ps.execute();
    		  System.out.println("student successfully registered");
    		  
    	  }
    	  catch(SQLException e) {
    		  System.out.println("unable to insert data..");
    	  }
      }
      public Student findStudent(int studentid) {
    	  Student st =null;
    	  try {
    		  String query ="select* from student where studentId=?";
    		  PreparedStatement ps = con.prepareStatement(query);
    		  ps.setInt(1, studentid);
    		  ResultSet rs= ps.executeQuery();
    		  
    		  
    		  if(rs.next()) {
    			  int id =rs.getInt("studentId");
    			  String name=rs.getString("studentName");
    			  
    			  st= new Student(id, name);
    			  
    		  }
    		  else {
    			  st= new Student(0, null);
    		  }
    	  }catch(SQLException e) {
    		  System.out.println("unable to retrieve data from the database");
    		  
    	  }
    	  return st;
      }
      public List<Student> findAll(){
    	  List<Student>st = new ArrayList<Student>();
    	  String query = "select * from students";
    	  try {
    		  PreparedStatement ps= con.prepareStatement(query);
    		  ResultSet rs= ps.executeQuery();
    		  while(rs.next());
    		  int id= rs.getInt("studentId");
    		  String name =rs.getString("stidentName");
    		  
    		  Student st1= new Student(id, name);
    		    st.add(st1);
    		   
    	  
      
      }catch (SQLException ar) {
    	  System.out.println("unable to retrieve  data from the data base");
    	  
    	  }

           return st;
   
        }
      

     public void deleteStudent(Student st) {
	  String query ="delete from student where studentId=?";
	 try {
		 PreparedStatement ps= con.prepareStatement(query);
		 ps.setInt(1,st.getstudentId());
		 ps.execute();
		 System.out.println("student sucessfully deleted");
	 }catch(SQLException e) {
		 System.out.println("unable to read the data from thr database");
           }
      }
  }
  
