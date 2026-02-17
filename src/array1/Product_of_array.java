package array1;
import java.util.Arrays;

public class Product_of_array {
	public static void parray(int ar1[]) {
		int product = 1;
		for(int i=0;i<ar1.length;i++) {
			if(ar1[i] != 0) {
			product*=ar1[i];
			}
		}
		System.out.println("product of array is "+product);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {10,2,4,0,3,1};
	    	parray(ar1);
	    	
	    }

	}


