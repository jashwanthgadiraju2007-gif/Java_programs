package number_programs;

public class kaprekar_number {

    public static boolean kap(int num) {
        if (num == 1) return true;

        int sq = num * num;

        int count = 0, temp = sq;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int div = (int) Math.pow(10, (count % 2 == 0) ? count / 2 : (count / 2) + 1);

        int quo = sq / div;
        int rem = sq % div ;

        return quo + rem == num;
    }

    public static void main(String[] args) {
        System.out.println(kap(45));
    }
}
