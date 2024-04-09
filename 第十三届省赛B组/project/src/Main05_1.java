import java.io.*;
import java.math.BigInteger;
import java.util.Scanner;

public class Main05_1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main1(String[] args) throws IOException {

//        BigInteger k = new BigInteger(br.readLine());
        long k = Integer.parseInt(br.readLine());
        long sum_0 = 1; //0的个数
        int sum_5 = 1; //5的个数
        for (long i = 5; i < k; i+=5) {
        }
    }
    static long count_5(long num) {
        long ret = 0;
        while (num!=0) {
            if (num%5!=num) ret++;
            num /= 5;
        }
        return ret;
    }

    public static void main(String[] args) {

        System.out.println(count_5(40));
        for (long i = 5; i < 126; i+=5) {
            System.out.println(i+" "+count_5(i));
        }
    }
}
