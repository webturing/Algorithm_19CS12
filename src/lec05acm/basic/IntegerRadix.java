package lec05acm.basic;

public class IntegerRadix {
    public static void main(String[] args) {
        //Integer /Long /BigInteger
        int x = 1237774;
        System.out.println(x + "");
        System.out.println(Integer.toString(x));
        System.out.println(Integer.toString(x, 10));
        System.out.println(Integer.toString(x, 2));
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toString(x, 8));
        System.out.println(Integer.toOctalString(x));
        System.out.println(Integer.toString(x, 16));
        System.out.println(Integer.toHexString(x));
        System.out.println(Integer.toString(x, 34));

    }
}
