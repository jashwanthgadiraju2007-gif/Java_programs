package array1;

public class Store0satlast {

	public static int[] last(int a[]) {

		    for(int j = 0; j < a.length; j++) {
		        for(int i = 0; i < a.length - 1; i++) {
		          if(a[i] == 0) {
		            int temp = a[i];
		             a[i] = a[i+1];
		             a[i+1] = temp;
		          }
		        }
		    }

		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ar1[]= {2,0,3,0,0,2,1,6,0};
int ar2[]=last(ar1);
for(int i = 0;i<ar1.length;i++) {
	System.out.println(ar2[i]);
}
	}

}
