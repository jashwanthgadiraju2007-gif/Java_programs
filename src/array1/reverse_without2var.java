package array1;

public class reverse_without2var {
	public static int[] rev(int ar[]) {
		int i = 0;
		int j = ar.length-1;
		while(i<j) {
			int temp = ar[i];
			ar[i] =ar [j];
			ar[j] = temp ;		
			i++ ;
			j-- ;
			}
		return ar;		
	}
	public static void main(String[] args) {
		int ar1[]= {0,10,20,30,40};
		int ar2[]=rev(ar1);
		for(int i=0;i<ar1.length;i++) {
			System.out.println(ar2[i]);
		}
	}
	

}
