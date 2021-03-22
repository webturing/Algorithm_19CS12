package lec05api;

import java.math.BigInteger;

public class A {
    //13!>INT_MAX
    //21!>LONG_MAX
    public static void main(String[] args) {
        BigInteger s = new BigInteger("1");
        for (int i = 2; i <= 1977; i++) {
            s = s.multiply(new BigInteger(Integer.toString(i)));//Integer->String->BigInteger
        }
        System.out.println(s);
    }
}
