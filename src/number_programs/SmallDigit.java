package number_programs;

public class SmallDigit {
	public static void small(int num) {
		int small = 9 ;
		while(num > 0) {
			int rem = num % 10;
			if(rem < small) {
				small = rem;
			}
			num/=10;			
		}
		System.out.println(small);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		small(7809);

	}

}
