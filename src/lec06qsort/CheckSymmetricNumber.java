package lec06qsort;

public class CheckSymmetricNumber {

    public static void main(String[] args) {
        int x = 196;
        while (!isSymmetric(x)) {
            int y = revInt(x);
            System.out.println(String.format("%d+%d=%d", x, y, x = x + y));
        }
    }

    static boolean isSymmetric(int n) {
        return n == revInt(n);
    }

    static int revInt(int n) {
        int ans = 0;
        while (n > 0) {
            int d = n % 10;
            ans = ans * 10 + d;
            n /= 10;
        }
        return ans;
    }
}
