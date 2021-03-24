package lec05acm;

public class F {
    public static void main(String[] args) {
        int n = 1977;
        int s = 1;
        int two = 0, five = 0;
        for (int i = 2; i <= n; i++) {
            int j = i;
            while (j % 2 == 0) {
                j /= 2;
                ++two;
            }
            while (j % 5 == 0) {
                j /= 5;
                ++five;
            }
            s = (s * j) % 10;
        }

//        int two = n / 2 + n / 4 + n / 8 + n / 16 + n / 32 + n / 64 + n / 128;
//        int five = n / 5 + n / 25 + n / 125;
        for (int i = 0; i < (two - five) % 4 + 4; i++)
            s = (s * 2) % 10;
        System.out.println(s);
    }
}
