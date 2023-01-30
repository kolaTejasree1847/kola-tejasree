package Array;
import java. util.Scanner;
public class checkbigger {
  public static void main(String[] args) {
	  Scanner scan =new Scanner(System.in);
	  int num[]=new int[5];
	  System.out.println("enter the numbers");
	  
	  for(int i=0;i<num.length;i++) {
		  num[i]=scan.nextInt();
	  }
	  for(int i=0;i<num.length;i++) {
		 System.out.println(num[i]);
	  }
     int largest= num[0];
     for(int i=0;i<num.length;i++) {
    	 if(num[i]>largest) {
    		 largest=num[i];
    		 
    	 }
    	 

  }
    System.out.println("the largest number is"+largest);
    int smallest= num[0];
    for(int i=0;i<num.length;i++) {
   	 if(num[i]< smallest) {
   		 smallest=num[i];
   		 
   	 }
   	 

 }
   System.out.println("the smallest  number is"+smallest);
    
}

}