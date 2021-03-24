package lec06qsort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 8, 7, 9, 4, 6, 1, 0};
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    //sort//stable_sort
    static void quickSort(int[] a, int left, int right) {
        if (left >= right) return;
        int i = left, j = right;
        int pivot = a[left], temp;

        while (i < j) {
            while (j > i && a[j] >= pivot) --j;
            while (i < j && a[i] <= pivot) ++i;
            if (i == j) break;
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        temp = a[i];
        a[i] = a[left];
        a[left] = temp;
        //a[left,i-1] a[i] a[i+1,right]
        quickSort(a, left, i - 1);
        quickSort(a, i + 1, right);
    }
}
