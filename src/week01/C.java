package week01;

import java.math.BigInteger;
import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        //  long n = cin.nextLong();
        // long s = n * (n + 1) / 2;
        BigInteger n = cin.nextBigInteger();
        BigInteger s = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.TWO);
//        for (int i = 1; i <= n; i++) {
//            s += i;
//        }
        System.out.println(s);
        //  System.out.println(s.isProbablePrime(100));//0.5^100

    }
}
