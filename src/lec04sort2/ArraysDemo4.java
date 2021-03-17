package lec04sort2;

import java.util.Arrays;

public class ArraysDemo4 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        Arrays.sort(a, 3, 7);
        System.out.println(Arrays.toString(a));

        int x = 0;
        while (x <= 10) {
            while (x <= 10) {
                x++;
                System.out.println("1111");
            }
            x++;
        }

    }


}
