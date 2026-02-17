package array1;

public class CountprimeOfarray {
	public static void prime(int ar1[]) {
		int count = 0;
		for (int i =0;i<ar1.length;i++) {
		int cofactor = 0;
		int num = ar1[i];
		for(int j =1;j<=num;j++) {
					if(num % j ==0) {
						cofactor ++ ;
					}
		}
					if(cofactor ==2) {
						count ++;
					}
				}
		System.out.println(count);
			}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar1[]= {5,19,7,23,13,11,20};
		prime(ar1);

	}

}
