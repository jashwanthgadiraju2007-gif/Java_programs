package array1;

import java.util.Arrays;

public class Store0satlast {

	public static int[] last(int a[]) {
		for(int i= 0 ;i<a.length;i++) {
		        for(int j = i+1 ; j < a.length - 1; j++) {
		          if(a[i] == 0) {
		            int temp = a[i];
		             a[i] = a[j];
		             a[j] = temp;
		          }
		        }
		}

		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar1[]= {2,0,3,0,0,2,1,6,0};
	System.out.println(Arrays.toString(last(ar1)));
}
	}
