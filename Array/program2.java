package Array;
import java.util.Scanner;
public class program2 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int num[]=new int[5];
			
			
			for(int i=0; i<num.length; i++) {
				System.out.println("Enter a number");
				num[i]=sc.nextInt();
				
			
				if(num[i]>0) {
					System.out.println("the given number is positive");
					
				}
					else if(num[i]<0) {
						System.out.println("the given number is negative");
					}
					else {
						System.out.println("the given number is zero");
				}
				if (num[i]%2==0) {
					System.out.println("the given number is even");
					
				}
				else {
					System.out.println("the given number is odd");
				}
				
			}
			
		}
		
}
	



