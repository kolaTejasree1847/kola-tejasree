package Array;

public class program4 {
	public static void main(String ARGS[]) {
		int num[]= {12,24,46,64,56,27,43,23};
		   for(int i=0; i<num.length; i++) {
			 System.out.println(num[i]); 
		   }
		   
		   int sum=0;
		   for(int i=0; i<num.length; i++) {
			 sum=sum+num[i];
		   }
			 System.out.println("the sum is "+sum);
		   
	
		   int product=1;
		    for(int i=0; i<num.length; i++) {
		    	product=product+num[i];
		    }
		    System.out.println("the product is "+product);

     }
}
