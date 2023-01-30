package projectstudents;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.sql.SQLException;
import java.util.Set;
import java.util.HashSet;


public class App {
	public static void main(String args[]) {
		StudentServices services=new StudentServices();
		services.menu();
	}

}
