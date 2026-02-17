package number_programs;

public class Nthprime {
	public static boolean isprime(int num) {
		if(num<2) {
			return false;
		}
		for(int i = 2;i<num ; i++) {
			if(num% i ==0) {
				return false;
			}}
		return true;
	}
	public static int nth(int num) {
		int count = 0;
		int number =1;
		while(count < num) {
			number++;
			if(isprime(number)) {
				count++;
			}
		}
		return number;
		
	}
	public static void main(String[] args) {
		System.out.println(nth(13));
	}
}