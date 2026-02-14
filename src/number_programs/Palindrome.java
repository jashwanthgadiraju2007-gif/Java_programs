package number_programs;

public class Palindrome {
	public static boolean code (int num) {
		int sum =0 ;
		int temp = num ;
		while(num>0) {
			int rem = num % 10;
			sum = sum *10 +rem ;
			num/=10;	
		}
		if (temp == sum) {
			return true;
		}
		   return false;
	}
	public static void main(String[] args) {
		System.out.println(code(121));
		System.out.println(code(6250));
		code(6762);
		
	}
	

}
