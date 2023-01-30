package projectstudents;
import java.util.List;
import java.util.Scanner;
public class StudentServices {
   private Scanner scan= new Scanner(System.in);
   private StudentDAODB dao= new StudentDAODB();
   
   public void addStudent() {
	   System.out.println("Enter student id");
	   int id = scan.nextInt();
	   System.out.println("Enter student name");
	   String name=scan.next();
	   
	   //set these details to student object.
	   Student st =new Student(id, name);
       dao.addStudent(st);
   
   }
   public void displaystudentbyId() {
	   System.out.println("enter student id to fetch");
	   int studentid=scan.nextInt();
	   Student st= dao.findStudent(studentid);
	   if(st.getstudentId()==0) {
		   System.out.println("sorry!!! student not found");
		   
	   }else {
		   System.out.println(st);
		   }
	   }
     public void displayAllstudents() {
    	 List<Student> student= dao.findAll();
    	 if(Student.isempty()) {
    		 System.out.println("no student has been registred");
    	 }
    	 else {
    		 for(Student st: student) {
    			 
    		 }
    	 }
    	 }
    	 
    	 public void menu() {
    		 while(true) {
    			 System.out.println("------Student module details------");
    			 System.out.println("\n\t press 1 for student id");
    			 System.out.println("\n\t press 2 for show module name");
    			 System.out.println("\n\t press 3 for dispaly all students");
    			 System.out.println("\n\t press 4 for delete student");
    			 System.out.println("\n\t press 5 for system.exit");
    			 System.out.println("\n\t please enter your choice");
    			 int opt= scan.nextInt();
    			 switch(opt) {
    			 case 1: addStudent();break;
    			 case 2: dispalymodule();break;
    			 case 3: displayAllstudents();break;
    			 case 4: deleteStudentId();break;
    			 case 5:System.exit(opt);
    			 default:System.out.println("sorry!!!! your've choosena wrong option");
    			 }
    			 
    		}
     }
     
    	 private void dispalymodule() {
			// TODO Auto-generated method stub
			System.out.println("Full stack java Development course");
		}
		private void deleteStudentId() {
    		 System.out.println("enter the student id to delete");
    		 int studentId= scan.nextInt();
    		 Student st=dao.findStudent(studentId);
    		 if(st.getstudentId()==0) {
    			 System.out.println("sorry!!!!! student not found");
    		 }
    		 else {
    			 dao.deleteStudent(st);
    		 }
    		 
    	 }
     }
   
   
   

