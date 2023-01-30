package Array;
import java.util.Scanner;
public class program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values");
		int num[]=new int[5];
		for(int i=0; i<num.length; i++) {
			num[i]=sc.nextInt();
			
		}
		int a=4;
		int num1[]=new int[5];
		for(int i=0; i<num.length; i++) {
			num1[i]=num[a];
			a--;
		}
		 for(int i=0; i<num1.length; i++) {
			 System.out.println(num1[i]);
		 }
	}

}
