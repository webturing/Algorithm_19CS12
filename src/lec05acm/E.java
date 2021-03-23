public class E {
    public static void main(String[] args) {
        int n = 1977;
        int s = 1;
        int two = 0, five = 0;
        for (int x = 2; x <= n; x++) {
            int y = x;
            while (y % 2 == 0) {
                y /= 2;
                ++two;
            }
            while (y % 5 == 0) {
                y /= 5;
                ++five;
            }
            s = (s * y) % 10;

        }
        // int two = n / 2 + n / 4 + n / 8 + n / 16 + n / 32 / +n / 64;
        // int five = n / 5 + n / 25 + n / 125;
        for (int i = 0; i < (two - five) % 4 + 4; i++) {
            s = (s * 2) % 10;
        }
        System.out.println(s);
    }
}
