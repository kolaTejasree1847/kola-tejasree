package Array;
import java.util.Scanner;
public class program5 {
	public static void main(String[] args) {
		int marks[]= new int[5];
		System.out.println("enter the elements in an array");
		Scanner scan=new Scanner(System.in);
		 for(int i=0; i<marks.length; i++) {
			 marks[i]=scan.nextInt();
		 }
		  int largest=marks[0];
		   for(int i=0; i<marks.length; i++) {
			   if(marks[i]> largest)
				 largest=marks[i];
		   }
			     System.out.println("it is a largest number "+largest);
			   int smallest=marks[0];
			  for(int i=0;i<marks.length; i++) {
			  if(marks[i]<smallest)
				  smallest=marks[i];
			  }
			   System.out.println("it is a smallest number  "+smallest);
       }
	}
	

  