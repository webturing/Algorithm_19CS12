package lec05api;

public class IntegerRadixDemo {
    public static void main(String[] args) {
        int i = 1234;
        System.out.println(i + "");//"1234"
        System.out.println(Integer.toString(i));//"1234"
        System.out.println(Integer.toString(i, 10));//"1234"
        System.out.println(Integer.toString(i, 2));//"1234"
        System.out.println(Integer.toString(i, 8));//"1234"
        System.out.println(Integer.toString(i, 16));//"1234"
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
    }
}
