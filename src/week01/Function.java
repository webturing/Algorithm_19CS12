package week01;

public class Function {


    public static void main(String[] args) {
        int c = add(3, 4);
        int d = mul(3, 4);
        System.out.println(c);

    }

    static int mul(int x, int y) {
        return x * y;
    }

    static int add(int a, int b) {
        return a + b;
    }
}
