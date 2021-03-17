package lec04sort2;

import java.util.Arrays;

public class ArraysDemo3 {
    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        sort(a);
        System.out.println(a);
        System.out.println(Arrays.toString(a));

    }

    //a[left:right]区间进行排序
    static void selectSort(int[] a, int left, int right) {
        // System.err.println(Arrays.toString(a));
        if (left >= right) return;
        //从[left,right]之间选择一个最小值与a[left]交换
        int k = left;
        for (int i = left + 1; i <= right; i++) {
            if (a[i] < a[k]) k = i;
        }
        if (k != left) {
            int t = a[k];
            a[k] = a[left];
            a[left] = t;
        }
        selectSort(a, left + 1, right);

    }

    static void sort(int[] a) {
        for (int i = 0; i <= a.length - 1; i++) {
            int k = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[k]) k = j;
            }
            if (k != i) {
                int t = a[k];
                a[k] = a[i];
                a[i] = t;
            }
        }


    }
}
