package projectstudents;

public class Student {
	private int studentid;
	private String studentName;
	
	public int getstudentId() {
	    return studentid;
	} 
	public String getstudentName() {
		return studentName;
		
	}
	public Student(int studentid, String studentName) {
		super();
		this.studentid = studentid;
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student[studentid=" + studentid + ", studentName=" + studentName + "]";
	}
	public static boolean isempty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	    
	

}
