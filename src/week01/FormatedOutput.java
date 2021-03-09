package week01;

public class FormatedOutput {

    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
        System.out.printf("pi=%.3f\n", pi);
        System.out.println(String.format("pi=%.3f\n", pi));
        System.out.print("hello");
        System.out.println("hello");
        System.out.println(3 + 4);
        System.out.println(3 + "4");//Integer=>String
        System.out.println("3" + "4");
        System.out.println(1 + 2 + "3");
        System.out.println("1" + 2 + 3);

    }
}
