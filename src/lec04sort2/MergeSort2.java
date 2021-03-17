package lec04sort2;

import java.util.Arrays;

public class MergeSort2 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 17, 19, 0, 2, 4, 6, 8};
        int[] c = new int[a.length];
        int mid = 4;
        int i = 0, j = mid + 1, k = 0;
        while (i <= mid && j <= a.length - 1) {
            if (a[i] <= a[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = a[j++];
            }
        }
        while (i <= mid) c[k++] = a[i++];
        while (j <= a.length - 1) c[k++] = a[j++];


        System.out.println(Arrays.toString(c));
        for (int x = 0; x < a.length; x++)
            a[x] = c[x];

        System.out.println(Arrays.toString(a));

    }


}
