package week01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int b = cin.nextInt();
        System.out.println(a + b);
        cin.close();
    }
}
