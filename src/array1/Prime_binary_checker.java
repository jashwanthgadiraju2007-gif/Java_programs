package array1;

public class Prime_binary_checker {
    public static boolean isprime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
    public static int binary(int num) {
        int binary = 0;
        while (num > 0) {
            int rem = num % 2;
            binary = binary * 10 + rem;
            num /= 2;
        }
        int count = 0;
        while (binary > 0) {
            int rem = binary % 10;
            if (rem == 1) count++;
            binary /= 10;
        }
        return count;
    }
    public static void checkPrimes(int ar[]) {
        for (int i = 0; i < ar.length; i++) {

            if (isprime(ar[i])) {
                int count = binary(ar[i]);

                if (count % 2 == 0)
                    System.out.println(ar[i] + " -> pass");
                else
                    System.out.println(ar[i] + " -> fail");
            }
        }
    }

    public static void main(String[] args) {
        int ar1[] = {3, 9, 5, 7};
        checkPrimes(ar1);
    }
}