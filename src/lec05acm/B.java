import java.io.BufferedInputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class B {


    public static void main(String[] args) {
        BigInteger a = new BigInteger(cin.next());
        BigInteger b = cin.nextBigInteger();
        cout.println(a.add(b));
    }

    static Scanner cin = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter cout = new PrintWriter(System.out, true);
}
