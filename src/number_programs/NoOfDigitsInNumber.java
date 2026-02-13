package number_programs;

public class NoOfDigitsInNumber {

	public static void Count(int n) {
		// TODO Auto-generated method stub
		int temp = n ;
		int count = 0;
		while(n > 0) {
			n/=10 ;
			count ++;
			
		}
		System.out.println("to no.of digits in  "+temp +" is " + count);
			}
	public static void main(String[] args) {
		
	    Count(600);
		Count(7);
		Count(5690);
		Count(967600);
	}

	}

