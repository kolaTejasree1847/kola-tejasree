package Array;
import java.util.Scanner;
public class peogram3 {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the values");
	  int digits[]= new int[10];
	   for(int i=0; i<digits.length; i++) {
		  digits[i]=sc.nextInt();
	   }
	    int a=9;
	   int num[]=new int[10];
	     for(int i=0; i<num.length;i++) {
	     num[i]=digits[a];
	      a--;
	    	 
	     }
	     for(int i=0; i<num.length; i++) {
	    	 System.out.println(num[i]);
	     }
	  

   }
}
