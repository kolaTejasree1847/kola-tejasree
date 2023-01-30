package Array;
import java.util.Scanner;
public class practiceprogram {
	 public static void main(String [] args) {
		 Scanner sc=new Scanner(System.in);
		  System.out.println("enter any five numbers");
		  int num[]=new int[5];
		  for(int i=0; i<num.length; i++) {
			  num[i]= sc.nextInt();
		  }
		  int a=4;
		  int digits[]=new int[5];
		  for(int i=0; i<digits.length; i++) {
		  digits[i]=num[a];
		  a--;
		  }
		  
		  for(int i=0; i<digits.length; i++) {
		  System.out.println(digits[i]);
		  
		   
	 }
   }
}
	 


