package lec04sort2;

public class BenchMark {
    static int N = 20000000;

    public static void main(String[] args) {
        int[] a = new int[N];
        for (int i = 0; i < a.length; i++) a[i] = (int) (Math.random() * 10000);
        //  System.out.println(Arrays.toString(a));
        long start = System.currentTimeMillis();
        //ArraysDemo3.sort(a);
        MergeSort3.mergeSort(a, 0, N - 1);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
