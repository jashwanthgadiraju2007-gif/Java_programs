package number_programs;

public class Strong_number {
	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }
	    public static boolean isStrong(int num) {
	        int temp = num;
	        int sum = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            sum += factorial(digit);
	            num /= 10;
	        }

	        return sum == temp;
	    }

	    public static void main(String[] args) {
	        int num = 145;

	        if (isStrong(num))
	            System.out.println("Strong Number");
	        else
	            System.out.println("Not Strong Number");
	    }
	}

