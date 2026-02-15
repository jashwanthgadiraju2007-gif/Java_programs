package number_programs;

public class Reverse_number {
	public static void reverse(int num) { //490
		int temp = num ;
		int sum = 0;
		while(num > 0) {           //490   , 49, 4
			int rem = num % 10 ;  //0     ,  0 , 4
			sum = sum * 10 + rem; // 0     , 9 , 94
			num /= 10;            // 49   , 4 , 0
			
		}
		System.out.println("reverse of "+temp+"="+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse(490);

	}

}
