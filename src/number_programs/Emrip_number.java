package number_programs;

public class Emrip_number {
public static boolean isprime(int num) {
	if(num<2) {
		return false;
	}
	for(int i =2 ;i*i <= num ;i++) {
		if( num % i ==0) {
			return false;
		}
	}
	       return true ;
}
	public static boolean isemrip(int num) {
		if(num<2) {
			return false;
		}
		if((isprime(num))==false) {
			return false;
		}
		int temp = num;
		int rev = 0;
		while(temp>0) {
			int rem = temp%10;
			rev = rev * 10 +rem ;
			temp/=10;
		}
		if(rev == num) {
			return false;
		}
		if((isprime(rev))==false) {
			return false;
		}
	return true ;
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isemrip(25));
		System.out.println(isemrip(13));
		System.out.println(isemrip(17));

	}

}
