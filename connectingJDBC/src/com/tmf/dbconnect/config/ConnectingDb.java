package com.tmf.dbconnect.config;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
public class ConnectingDb {
	public static void main(String[] ar) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		
		// connecting with a Database
		Connection conn;
		String url="jdbc:mysql://localhost:3306/java_10";
		String username="root";
		String passward="root";
		conn=DriverManager.getConnection(url,username,passward);
		System.out.println("Connected with Database successfully");
		
		//Executing query using Statement interface
		Statement stmt=conn.createStatement();
		//String query="create table Student(stid int, stName varchar(50),gender varchar(6))";
		//stmt.execute(query);
		String query1="alter table Student add column(phone bigint,email varchar(100))";
	    System.out.println("table has been created");
		
	    //inserting data from program
	    Scanner scan= new Scanner (System.in);
	    System.out.println("Enter student id");
	    int id =scan.nextInt();
	    System.out.println("enter student name");
	    String name=scan.next();
	    System.out.println("Enter student gender");
	    String gender=scan.next();
	    System.out.println("Enter student phone ");
	    long phone=scan.nextLong();
	    System.out.println("Enter Student email");
	    String email=scan.next();
	    String query ="insert into student(stid,stName ,Gender,phone,email) values("
	    		+id+", '"
                +name+" ', '"
                +gender+"',"
                +phone+", '"
                +email+"')";
	    stmt.execute(query);
		System.out.println("Data has been stored");
		
		
	}

}
