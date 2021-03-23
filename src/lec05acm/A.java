import java.math.BigInteger;
import java.util.Scanner;

public class A {//Ctrl+Alt+L

    //13!>Integer.MAX_VALUE
// 21!>LONG.MAX_VALUE
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger s = new BigInteger("1");//BigInteger s=BigInteger.ONE;
        for (int i = 2; i <= 1977; i++) {
            s = s .multiply(new BigInteger(Integer.toString(i)));//Integer=toString()=>String=new=>BigInteger
        }
        System.out.println(s);
        cin.close();
    }
}
