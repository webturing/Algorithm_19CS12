package week01;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = null;
        int[] b = {1, 2, 3};
        int c[] = {3, 4};//
        int[] d = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};

        System.out.println(b.length);

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
        System.out.println();

        for (int i : d) {
            System.out.print(i + " ");
        }
        System.out.println();
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));//debug
        System.out.println(d);
    }
}
