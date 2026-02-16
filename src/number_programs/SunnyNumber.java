package number_programs;

public class SunnyNumber {

	public static boolean sunny(int num) {
		// TODO Auto-generated method stub
		int next = num +1 ;
		for(int i=1 ;i < num/2 ;i++) {
			if(i * i == next) {
			  return true;
			}
		}
			  return false;
			}
	public static void main(String[] args) {
		System.out.println(sunny(7));
		System.out.println(sunny(8));
	}

}
