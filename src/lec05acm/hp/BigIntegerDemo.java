package lec05acm.hp;

import java.math.BigInteger;

public class BigIntegerDemo {//Ctrl+Alt+L

    public static void main(String[] args) {
        BigInteger a = new BigInteger("111111111111111111111111111111111111111111111111");//Alt+Enter
        BigInteger b = BigInteger.TEN;
        System.out.println(a.add(b));
        System.out.println(a.subtract(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
        System.out.println(a.mod(b));
        System.out.println(a.pow(10));
        System.out.println(a.isProbablePrime(100));
    }
}
