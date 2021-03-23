package lec05acm.hp;

import java.util.*;

public class FactorialLength {//Ctrl+Alt+L

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        double s = 0;
        for (int i = 2; i <= 1977; i++) {
            s += Math.log10(i);
        }
        System.out.println(s);
        double x = s - (int) s;
        System.out.println(Math.pow(10, x));
        cin.close();
    }
}
