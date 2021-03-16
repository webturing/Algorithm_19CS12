package lec03recursion;

public class Fib {
    static int f(int n) {//O(a^n) T(n)=T(n-1)+T(n-2)+1
        if (n == 1 || n == 2) return 1;
        return f(n - 1) + f(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            long start = System.currentTimeMillis();
            f(i);
            long end = System.currentTimeMillis();
            System.out.println(String.format("T(%d)=%d ms", i, end - start));

        }

    }
}
