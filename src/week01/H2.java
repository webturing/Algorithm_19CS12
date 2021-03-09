package week01;

import java.util.Arrays;

public class H2 {
    public static void main(String[] args) {
        int s[] = new int[100];

        int k = 0;
        for (int i = 0; i <= 1000; i++) {
            int c = i * i;
            if (c < 1000 || c > 9999) continue;
            s[k++] = c;
        }
        for (int a = 1; a <= 9; a++)
            for (int b = 0; b <= 9; b++) {
                int c = a * 1100 + b * 11;
                if (Arrays.binarySearch(s, 0, k, c) >= 0)//OlogN
                    System.out.println(c);
            }

    }

}
