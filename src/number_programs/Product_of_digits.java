package number_programs;

public class Product_of_digits {
	public static int product(int num) {
		int mult = 1;
		while(num > 0) {
			int rem = num % 10;
			mult*=rem;
			num /=10;
			}
		return mult ;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("product of digits is "+product(25));
	}

}
