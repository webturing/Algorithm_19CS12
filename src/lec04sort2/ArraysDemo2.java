package lec04sort2;

import java.util.Arrays;

public class ArraysDemo2 {
    public static void main(String[] args) {


        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        //数组遍历：按索引遍历 可以读，也可以写
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        //for each 按迭代访问 只能顺序读取，只能读不能改写数组内容
        for (int each : a) {
            System.out.print(each + " ");
        }
        System.out.println();
        //数组直接输出:适合调试
        System.out.println(Arrays.toString(a));

    }
}
