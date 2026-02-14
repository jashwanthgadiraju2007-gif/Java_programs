package number_programs;

public class LargestDigit {
	public static int max(int num) {
		int large = 0 ;
		while(num > 0) {
			int rem = num % 10 ;
			if(rem > large) {
				large = rem ;
			}
			num /=10 ;
		}
		return large ;
				
			}
	public static void main(String[] args) {
		System.out.println(max(4756));
		System.out.println(max(40056));
		
	}
		}
