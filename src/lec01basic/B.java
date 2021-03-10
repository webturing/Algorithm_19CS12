package lec01basic;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        int c = cin.nextInt();
        double v = (a + b + c) / 3.0;
        System.out.println(String.format("%.3f", v));


        cin.close();
    }
}
