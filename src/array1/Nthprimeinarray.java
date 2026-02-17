package array1;

public class Nthprimeinarray {

	public static boolean prime(int num) {
	
		 if(num<2) {
			 return false;
		 }
		 for(int j =2 ;j<num;j++) {
			 if(num % j == 0) {
				 return false ;
			 }
		 }

		return true;
	}
	public static int nth(int ar[],int n) {
		int count = 0;
		for(int i = 0 ;i<ar.length;i++) {
          if(prime(ar[i])) {
        	  count++;
          if(count ==n) {
		return ar[i];
           }
		}
		}
		return -1;
	}
		
	public static void main(String[] args) {
	int ar1 []= {3,2,5,6,78,9,13,41};
		System.out.println(nth(ar1,5));
	}
		
	}