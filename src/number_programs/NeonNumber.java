package number_programs;

public class NeonNumber {
	public static void neon(int num) {
		int sum = 0;
		int sq = num*num;
		while(sq >0) {
			int rem=sq % 10;
			sum = sum + rem ;
			sq/=10;
		}
		if(num == sum) {
			System.out.println("neon");
		}
		else {
			System.out.println("not a neon");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		neon(9);
		neon(90);

	}

}
