package week01;

public class H {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++)
            for (int b = 0; b <= 9; b++) {
                int c = 1100 * a + 11 * b;
                if (!isSquare(c)) continue;
                System.out.println(c);
            }
    }

    static boolean isSquare(int c) {
        int d = (int) Math.sqrt(c);
        return d * d == c;
    }
}
