package array1;

public class Sumof2elementsinArray {
public static int[] Sum(int ar1[],int num) {
	int res[]=new int[2];
	for(int i = 0;i<ar1.length;i++) {
		for(int j = 0 ;j<ar1.length;j++) {
			if(num == ar1[i] +ar1[j]) {
				res[0] = j;
				res[1] = i ;
			}
			
		}
	}
		return res;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {2,4,6,8,10};
		int result[] = Sum(ar1, 12);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
          }

}
}
