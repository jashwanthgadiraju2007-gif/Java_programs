package number_programs;

public class Automorphic {

	public static void auto(int num) {
		int temp = num ;
		int square =num*num ;
		int count = 0;
		while(num >0 ) {
			count ++ ;
			num /=10 ;
			}
		int divisor =(int)Math.pow(10, count);
		int rem = square % divisor ;
		if(temp == rem) {
			System.out.println(temp+" is a automorphic number");
		}
		else {
		System.out.println(temp+" is not an automorphic number");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		auto(25);
		auto(6);
		auto(0);

	}

}
