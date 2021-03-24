package lec05acm;

import java.math.BigDecimal;
import java.util.Scanner;

public class C {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);//Alt+enter
        while (cin.hasNext()) {
            BigDecimal a = cin.nextBigDecimal();
            BigDecimal b = cin.nextBigDecimal();
            int c = cin.nextInt();
            System.out.println(a.divide(b, c, BigDecimal.ROUND_HALF_UP));
        }

        cin.close();
    }
}
