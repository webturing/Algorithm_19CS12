package lec04sort2;

public class ArraysDemo {
    public static void main(String[] args) {
        int x = 3;
        int y = x;//
        x++;
        System.out.println(y);//y=3


        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        //int [] b=a;//shallow copy
        int[] b = new int[a.length];//deep copy
        for (int i = 0; i < a.length; i++) b[i] = a[i];

        //int [] b=a.clone();
        a[0]++;
        System.out.println(b[0]);

    }
}
