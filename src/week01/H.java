package week01;

public class H {
    public static void main(String[] args) {
        for (int a = 1; a <= 9; a++)
            for (int b = 0; b <= 9; b++) {
                int c = a * 1100 + b * 11;
                if (isSquare(c))
                    System.out.println(c);
            }
    }

    private static boolean isSquare(int c) {
        int x = (int) Math.sqrt(c);
        return x * x == c;
    }
}
