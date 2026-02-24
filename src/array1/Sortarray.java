package array1;
import java.util.Arrays;
public class Sortarray {
public static void sort(int a[]) {
	 for (int i = 0; i < a.length - 1; i++) {
         for (int j = i + 1; j < a.length; j++) {
             if (a[i] > a[j]) {
                 int temp = a[i];
                 a[i] = a[j];
                 a[j] = temp;
             }}
     }
	 System.out.println(Arrays.toString(a));

//	for(int k= 0;k<a.length;k++) {
//	System.out.println(a[k]);
//	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {8,4,3,5,6,2,1};
		sort(a);

	}

}
