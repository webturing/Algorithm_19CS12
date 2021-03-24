import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO 开启你的ACM模式

        cin.close();//关闭输入流
        cout.close();//关闭输出流，这是必须的，否则一般不会自动刷新缓冲区

    }

    static Scanner cin = new Scanner(new BufferedInputStream(System.in));//大量输入优化版本
    static PrintWriter cout = new PrintWriter(new BufferedOutputStream(System.out));//大量输出优化版本
    static PrintWriter cerr = new PrintWriter(System.err,true);//开启调试模式,一般输出量不大，不需要buffered
}
