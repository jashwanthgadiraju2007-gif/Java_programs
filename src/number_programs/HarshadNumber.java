package number_programs;

public class HarshadNumber {
	public static void harshad(int num) {
		int temp = num ;
		int sum = 0 ;
		while (temp>0) {
			int rem = temp %10 ;
			sum += rem ;
			temp /=10;
		}
		if(num % sum == 0) {
			System.out.println(num+ " is a harshad");
		}else {
			System.out.println(num+ " is  not a harshad");
		}
	}
		
	public static void main(String[] args) {
		harshad(81);
		harshad(810);
		harshad(15);
		
	}

}
