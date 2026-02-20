package array1;
import java.util.Arrays;

public class return_array {
	public static int[] rev(int ar1[]) {
		int j=0;
		int ar2 [] = new int [ar1.length];
		for(int i = ar1.length-1;i>=0;i--) {
			ar2[j++]=ar1[i];
		}
		return ar2;
		}
		

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int ar1[]= {10,46,556,86,89};
		
		int[]ar2=rev(ar1);
		for(int i =0;i< ar2.length;i++) {
		
		System.out.println(ar2[i]);
		}
}
}

