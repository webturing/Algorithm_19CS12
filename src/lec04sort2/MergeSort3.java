package lec04sort2;

import java.util.Arrays;

public class MergeSort3 {
    static int[] c = new int[100000000];

    public static void main(String[] args) {
        int[] a = {1, 3, 4, 5, 8, 3, 4, 7, 7, 1, 0, 1000};
        mergeSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    //T(n)=T(n/2)+T(n/2)+O(n) =>T(n)=O(nlogn)
    public static void mergeSort(int[] a, int left, int right) {
        if (left >= right) return;
        int mid = (right + left) / 2;
        //a[left,mid]  and a[mid+1,right]
        mergeSort(a, left, mid);
        mergeSort(a, mid + 1, right);
        int i = left, j = mid + 1, k = left;
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = a[j++];
            }
        }
        while (i <= mid) c[k++] = a[i++];
        while (j <= right) c[k++] = a[j++];
        for (int x = left; x <= right; x++) a[x] = c[x];

    }


}
