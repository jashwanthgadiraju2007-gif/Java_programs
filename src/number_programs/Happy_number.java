package number_programs;

public class Happy_number{
	public static void code(int num) {
		int temp = num;
		while(num!= 1 && num!= 4) {
			int sum=0;
			while(num>0) {
				int rem = num %10 ;
				sum = sum + (rem*rem);
				num/=10;
			}
			num = sum;
		}
		if(num==1) {
			System.out.println(temp+" is a happy number");
		}
		System.out.println(temp+" is not a happy number");
	}
public static void main(String[] args) {
	code(81);
	code(11);
	
}
}
