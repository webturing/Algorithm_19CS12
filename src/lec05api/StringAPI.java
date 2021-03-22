package lec05api;

public class StringAPI {
    public static void main(String[] args) {
        String str = "2021/3/22 9:31:00";
        int y, m, d, hh, mm, ss;
        str = str.replaceAll("\\D", " ");//\D not digit[0-9]
        System.out.println(str);
        String[] t = str.split(" ");
        y = Integer.parseInt(t[0]);
        m = Integer.parseInt(t[1]);
        d = Integer.parseInt(t[2]);
        hh = Integer.parseInt(t[3]);
        mm = Integer.parseInt(t[4]);
        ss = Integer.parseInt(t[5]);
        System.out.println(String.format("%d %d %d %d %d %d", y, m, d, hh, mm, ss));

    }
}
