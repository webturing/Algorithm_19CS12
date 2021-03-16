package lec03recursion;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] a = new int[]{1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        insertSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    static void insertSort(int[] a, int left, int right) {//T(n)= T(n-1)+O(n) =>T(n)=O(n^2)
        if (left >= right) return;
        insertSort(a, left, right - 1);
        for (int j = right - 1; j >= left; j--) {
            if (a[j] <= a[j + 1]) break;
            int t = a[j];
            a[j] = a[j + 1];
            a[j + 1] = t;
        }
    }


}
