package com.tmf.project2.menu;
import java.util.Scanner;


    public class Student {
    	private Scanner scan= new Scanner(System.in);
    	
    	public void addStudent() {
    		System.out.println("enter student Id");
    		int id =scan.nextInt();
    		System.out.println("enter module name");
    		String name=scan.next();
    	}
    	
    
      public void menu() {
    	  while(true) {
    		  System.out.println("student module");
    		  System.out.println("\n\t press 1 for add module");
    		  System.out.println("\n\t press 2 for show present module");
    		  System.out.println("\n\t press 3 for exit");
    		  int opt=scan.nextInt();
    		  
			System.out.println(true);
    		  switch(opt) {
    		  case 1:addmodule();
    		       break;
    		       
    		  case 2: showmodule();  
    		        break;
    		   
    		  case 3: System.exit(opt);
    		  
    		  }
    		  
    	  }
    	  
      }


	private void showmodule() {
		// TODO Auto-generated method stub
		
	}


	private void addmodule() {
		// TODO Auto-generated method stub
		
	}


	public void Menu() {
		// TODO Auto-generated method stub
		
	}


	
	}

       
			
			
   		
			
			