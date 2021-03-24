package lec06qsort;

public class CheckSymmetricNumberv2 {

    public static void main(String[] args) {
        long x = 196;
        while (!isSymmetric(x)) {
            long y = revLong(x);
            System.out.println(String.format("%d+%d=%d", x, y, x = x + y));
        }
    }

    static boolean isSymmetric(long n) {
        return n == revLong(n);
    }

    static long revLong(long n) {
        long ans = 0;
        while (n > 0) {
            long d = n % 10;
            ans = ans * 10 + d;
            n /= 10;
        }
        return ans;
    }
}
