package lec01basic;

import java.util.Arrays;

public class ArrayDemo2 {
    public static void main(String[] args) {


        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i : a) {//read-only
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(a));//debug
        System.out.println(a);
    }
}
