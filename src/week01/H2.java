package week01;

import java.util.Arrays;

public class H2 {
    public static void main(String[] args) {
        int[] a = new int[10000];
        int k = 0;
        for (int i = 0; i <= 10000; i++) {
            int c = i * i;
            if (c < 1000 || c > 9999) continue;
            a[k++] = c;
        }
        for (int i = 0; i < k; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
        int x = 1024;
        System.out.println(Arrays.binarySearch(a, 0, k, x) >= 0);//[fromIndex,toIndex)
    }


}
