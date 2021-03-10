package lec01basic;

public class C {
    public static void main(String[] args) {
        long n = 100000000000L;
        long s = 0;
        for (long i = 1; i <= n; i++) {
            s += i;
        }
        System.out.println(s);
    }


}
