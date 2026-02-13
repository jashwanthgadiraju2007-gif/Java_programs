package number_programs;

public class Swap {
	public static void swap(int a ,int b) {
		a = a + b;
		b = a - b;
		a = a - b ;
		System.out.println(" After swaping numbers: ");
		System.out.println(a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap(40,20);

	}

}
