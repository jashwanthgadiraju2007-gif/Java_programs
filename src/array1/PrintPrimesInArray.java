package array1;

public class PrintPrimesInArray {

    public static boolean isPrime(int num) {
        if (num < 2) return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void printPrimes(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 7, 8, 11, 15, 17};
        printPrimes(arr);
    }
}
