package number_programs;

public class kaprekar_number {
	public static boolean kap(int num) {
		if(num ==1) {
			return true;
		}
		int sq = num * num ;
		int temp = sq;
		int count = 0 ;
		int sum = 0;
		while(temp > 0) {
			count ++;
			temp/=10;
		}
		if(count % 2 ==0) {
		int div = (int) Math.pow(10,count/2);
			int quo = sq / div ;
			int rem =sq % div ;
			sum = quo + rem ;
			if(sum == num) {
				return true ;
			}
		}
		if(count % 2 !=0) {
			int div = (int) Math.pow(10,((count/2)+1));
				int quo = sq / div ;
				int rem =sq % div ;
				sum = quo + rem ;
				if(sum == num) {
					return true ;
				}
			}
			
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(kap(45));

	}

}
