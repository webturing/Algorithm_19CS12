package week01;

public class FormattedOutput {
    public static void main(String[] args) {
        double pi = Math.PI;

        System.out.println(pi);
        System.out.print(pi);
        System.out.printf("%.3f", pi);

        String str = String.format("pi=%8.3f", pi);
        System.out.println(str);


    }
}
