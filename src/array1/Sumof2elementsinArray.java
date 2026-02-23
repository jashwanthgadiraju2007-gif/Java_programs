package array1;

public class Sumof2elementsinArray {
public static void Sum(int ar1[],int num) {
	int res[]=new int[2];
	for(int i = 0;i<ar1.length;i++) {
		for(int j = i+ 1;j<ar1.length;j++) {
			if(i < j) {
			if(num == ar1[i] +ar1[j]) {
				res[0] = ar1[j];
				res[1] = ar1[i] ;
			System.out.println("two numbers are"+res[0]+"and"+res[1]);
			}
			
		}
	}
	}
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {2,4,6,8,6,10};
   
          Sum(ar1,12);
          
          }

}
