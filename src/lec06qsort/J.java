package lec06qsort;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class J {
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

    public static void main(String[] args) {
        int n = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = cin.nextInt();
        }
        quickSort(a, 0, a.length - 1);
        for (int i : a) {
            System.out.print(i + " ");
        }
        cin.close();
        cout.close();
    }

    static Scanner cin = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter cout = new PrintWriter(new BufferedOutputStream(System.out));

}
