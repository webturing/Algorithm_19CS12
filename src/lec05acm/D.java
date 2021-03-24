import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Scanner;

public class D {

    public static void main(String[] args) {
        while (cin.hasNext()) {
            BigDecimal a = cin.nextBigDecimal();
            BigDecimal b = cin.nextBigDecimal();
            int c = cin.nextInt();
            System.out.println(a.divide(b, c, BigDecimal.ROUND_HALF_DOWN));
        }
    }

    static Scanner cin = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter cout = new PrintWriter(System.out, true);
}
