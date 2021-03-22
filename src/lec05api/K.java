package lec05api;

import java.util.Arrays;

public class K {
    public static void main(String[] args) {
        String str = "192.168.0.1";
        String[] ss = str.split("\\.");
        System.out.println(Arrays.toString(ss));

    }
}
