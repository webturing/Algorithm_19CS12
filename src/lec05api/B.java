package lec05api;

import java.math.BigInteger;
import java.util.Scanner;

public class B {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            BigInteger s = new BigInteger("1");
            for (int i = 2; i <= n; i++) {
                s = s.multiply(new BigInteger(Integer.toString(i)));//Integer->String->BigInteger
            }
            System.out.println(s);
        }

        cin.close();
    }
}
