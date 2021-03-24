package lec06qsort;

import java.math.BigInteger;

public class CheckSymmetricNumberv3 {
    public static void main(String[] args) {
        BigInteger a = new BigInteger("196");
        while (!isSymmetric(a.toString())) {
            BigInteger b = new BigInteger(revStr(a.toString()));
            BigInteger c = a.add(b);
            System.out.println(String.format("%s + %s = %s", a, b, c));
            a = c;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static boolean isSymmetric(String str) {//isXXX hasXXX canXXX
        return str.equals(revStr(str));
    }

    static String revStr(String s) {//v+n
//        StringBuffer b = new StringBuffer(s);
//        b.reverse();
//        return b.toString();
        return new StringBuffer(s).reverse().toString();
    }


}
