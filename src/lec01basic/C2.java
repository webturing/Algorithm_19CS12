package lec01basic;

import java.math.BigInteger;
import java.util.Scanner;

public class C2 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger n = cin.nextBigInteger();
        BigInteger s = n.multiply(n.add(BigInteger.ONE)).divide(BigInteger.TWO);//s=n*(n+1)/2
        System.out.println(s);
        System.out.println(s.isProbablePrime(100));//0.25^100
    }


}
