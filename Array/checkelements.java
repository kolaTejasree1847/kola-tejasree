package Array;

public class checkelements {
    public static  void main(String args[]) {
    	int a[]= {12,5,57,46,13,12,5,12};
    	boolean read= true;
    	int j= a.length-1;
    	
    	for(int i=0; i<a.length; i++) {
    		if(a[i]==a[j]) {
    			read= false;
    			break;
    		}
    		else 
    	      j--;
    		
    	}
        System.out.println(read);
    }
}
