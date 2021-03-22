package lec05api;

public class FactorialLength {

    public static void main(String[] args) {
        double s = 0;
        for (int i = 2; i <= 1977; i++)
            s += Math.log10(i);

        System.out.println(s);
    }
}
