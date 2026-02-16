package array1;

public class odd_checker {

	public static void odd(int ar[]) {
		// TODO Auto-gen
		for(int i =0; i<ar.length;i++) {
			if (ar[i]%2 ==1) {
				System.out.println("index value "+i+" has odd value "+ar[i]);
			}
		}

	}
	public static void main(String[] args) {
		int ar1[]= {2,56,46,65,3,13	};
           odd(ar1);
}
}
